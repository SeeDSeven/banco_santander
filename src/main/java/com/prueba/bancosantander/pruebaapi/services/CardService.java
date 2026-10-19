package com.prueba.bancosantander.pruebaapi.services;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.bancosantander.pruebaapi.dto.ActivateCardResponseDto;
import com.prueba.bancosantander.pruebaapi.dto.BlockCardRequestDto;
import com.prueba.bancosantander.pruebaapi.dto.BlockCardResponseDto;
import com.prueba.bancosantander.pruebaapi.dto.CreateCardRequestDto;
import com.prueba.bancosantander.pruebaapi.dto.CreateCardResponseDto;
import com.prueba.bancosantander.pruebaapi.dto.GetCardByIdResponseDto;
import com.prueba.bancosantander.pruebaapi.models.Card;
import com.prueba.bancosantander.pruebaapi.models.CardStatus;
import com.prueba.bancosantander.pruebaapi.models.Product;
import com.prueba.bancosantander.pruebaapi.repositories.CardRepository;
import com.prueba.bancosantander.pruebaapi.repositories.CardStatusRepository;
import com.prueba.bancosantander.pruebaapi.repositories.ProductRepository;

@Service 
public class CardService {

    @Autowired 
    private CardRepository cardRepository;

    @Autowired 
    private ProductRepository productRepository;

    @Autowired 
    private CardStatusRepository cardStatusRepository;


    public CreateCardResponseDto createCard(CreateCardRequestDto request) {

        // ckeck product id
        Product product = productRepository.findById(Integer.parseInt(request.getProductId()))
                .orElseThrow(() -> new RuntimeException("Product not found"));

        CardStatus cardStatus = cardStatusRepository.findFirstByName("ISSUED");

        LocalDateTime now = LocalDateTime.now();
        String cardNumber = generateCardNumber(Integer.parseInt(request.getProductId()));


        Card card = new Card(cardNumber, request.getHolderName(), now, now.plusYears(3), null, null, 0.0, "USD" );
        card.setProduct(product);
        card.setStatus(cardStatus);
        cardRepository.save(card);

        return new CreateCardResponseDto(String.valueOf(card.getCardId()), card.getCardNumber(), card.getStatus().getName(), card.getExpiredAt().toString(), card.getBalance(), card.getCurrency());
    }


    public GetCardByIdResponseDto getById(String id) throws Exception {
        Optional<Card> card = this.cardRepository.findById(Integer.parseInt(id));

        if(card.isEmpty()){
            throw new Exception("Record not found");
        }
        Card cardPresent = card.get();

        GetCardByIdResponseDto cardResponse = new GetCardByIdResponseDto(
            cardPresent.getCardId().toString(),
            cardPresent.getCardNumber(),
            cardPresent.getHolderName(),
            cardPresent.getBlockedAt() != null ? cardPresent.getBlockedAt().toString() : null,
            cardPresent.getBlockedReason(),
            cardPresent.getBalance(),
            cardPresent.getExpiredAt() != null ? cardPresent.getExpiredAt().toString(): null,
            cardPresent.getCurrency(),
            cardPresent.getStatus().getName()
        );

        return cardResponse;

    }

    public ActivateCardResponseDto activateCard (String cardId) throws Exception {

        Optional<Card> cardToActivate = this.cardRepository.findById(Integer.parseInt(cardId));

        if(cardToActivate == null){
            throw new Exception("Record not found");
        }

        Card card = cardToActivate.get();

        if (card.getStatus().getName() == "BLOCKED"){
            throw new Exception("Can not activate card");
        }

        CardStatus cardStatus = cardStatusRepository.findFirstByName("ACTIVE");

        card.setStatus(cardStatus);

        cardRepository.save(card);

        return new ActivateCardResponseDto(card.getCardId().toString(), card.getStatus().getName());
    }


    public BlockCardResponseDto blockCard(String cardId, BlockCardRequestDto request) throws Exception {

        if (request == null || request.getReason() == null || request.getReason().isBlank()) {
            throw new Exception("Reason is required");
        }

        Optional<Card> cardToBlock = this.cardRepository.findById(Integer.parseInt(cardId));

        if (cardToBlock.isEmpty()) {
            throw new Exception("Record not found");
        }

        Card card = cardToBlock.get();

        if ("BLOCKED".equals(card.getStatus().getName())) {
            throw new Exception("Card is already blocked");
        }

        CardStatus blockedStatus = cardStatusRepository.findFirstByName("BLOCKED");

        card.setStatus(blockedStatus);
        card.setBlockedAt(LocalDateTime.now());
        card.setBlockedReason(request.getReason().trim());

        cardRepository.save(card);

        return new BlockCardResponseDto(card.getCardId().toString(), card.getStatus().getName());
    }


    private String generateCardNumber(Integer productId) {
        String cardNumber = String.valueOf(ThreadLocalRandom.current().nextLong(1000000000L, 10000000000L));
        return String.format("%d%s", productId, cardNumber);
    }
}