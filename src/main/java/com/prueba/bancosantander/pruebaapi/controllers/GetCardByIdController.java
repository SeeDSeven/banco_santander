package com.prueba.bancosantander.pruebaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.bancosantander.pruebaapi.dto.GetCardByIdResponseDto;
import com.prueba.bancosantander.pruebaapi.services.CardService;

@RestController 
@RequestMapping ("/cards")
public class GetCardByIdController {

    @Autowired 
    private CardService cardService;


    @GetMapping ("/{cardId}")
    public ResponseEntity<GetCardByIdResponseDto> getById(@PathVariable String cardId) throws Exception{
        return ResponseEntity.status(200).body(cardService.getById(cardId));
    }

}
