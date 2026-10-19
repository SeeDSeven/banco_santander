package com.prueba.bancosantander.pruebaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.bancosantander.pruebaapi.dto.CreateCardRequestDto;
import com.prueba.bancosantander.pruebaapi.dto.CreateCardResponseDto;
import com.prueba.bancosantander.pruebaapi.services.CardService;

@RestController
@RequestMapping ("/cards")
public class CreateCardController {

    @Autowired 
    private CardService cardService;

    @PostMapping("")
    public ResponseEntity<CreateCardResponseDto> create(@RequestBody CreateCardRequestDto request){
        return ResponseEntity.status(201).body(this.cardService.createCard(request));
    }

}
