package com.prueba.bancosantander.pruebaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.bancosantander.pruebaapi.dto.ActivateCardResponseDto;
import com.prueba.bancosantander.pruebaapi.services.CardService;

@RestController
@RequestMapping ("/cards")
public class ActivateCardController {

    @Autowired 
    private CardService cardService;


    @PostMapping ("/{cardId}/activate")
    public ResponseEntity<ActivateCardResponseDto> activate(@PathVariable String cardId) throws Exception {
        return ResponseEntity.status(200).body(cardService.activateCard(cardId));
    }
}
