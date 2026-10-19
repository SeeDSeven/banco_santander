package com.prueba.bancosantander.pruebaapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.bancosantander.pruebaapi.repositories.CardStatusRepository;

@Service 
public class CardStatusService {

    @Autowired 
    private CardStatusRepository cardStatusRepository;


    
}
