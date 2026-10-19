package com.prueba.bancosantander.pruebaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.bancosantander.pruebaapi.dto.BlockCardRequestDto;
import com.prueba.bancosantander.pruebaapi.dto.BlockCardResponseDto;
import com.prueba.bancosantander.pruebaapi.services.CardService;

@RestController
@RequestMapping ("/cards")
public class BlockCardController {

    @Autowired
    private CardService cardService;


    @PostMapping ("/{cardId}/block")
    public ResponseEntity<BlockCardResponseDto> block(@PathVariable String cardId,
            @RequestBody BlockCardRequestDto request) throws Exception {
        return ResponseEntity.status(200).body(cardService.blockCard(cardId, request));
    }
}
