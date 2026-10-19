package com.prueba.bancosantander.pruebaapi.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.bancosantander.pruebaapi.models.CardStatus;
import com.prueba.bancosantander.pruebaapi.repositories.CardStatusRepository;

@Component 
@Order (2)
public class CardStatusSeed implements CommandLineRunner {


    @Autowired 
    private CardStatusRepository cardStatusRepository;


    @Override 
    @Transactional 
    public void run(String... args) throws Exception {
        if (cardStatusRepository.count() == 0) {
            cardStatusRepository.save(new CardStatus("ISSUED"));
            cardStatusRepository.save(new CardStatus("ACTIVE"));
            cardStatusRepository.save(new CardStatus("BLOCKED"));
        }
    }

}
