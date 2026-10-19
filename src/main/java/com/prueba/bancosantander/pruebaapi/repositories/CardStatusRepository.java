package com.prueba.bancosantander.pruebaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.bancosantander.pruebaapi.models.CardStatus;

@Repository 
public interface CardStatusRepository extends JpaRepository<CardStatus, Integer> {

    CardStatus findFirstByName(String name);

}
