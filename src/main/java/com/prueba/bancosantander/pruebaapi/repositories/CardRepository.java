package com.prueba.bancosantander.pruebaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.bancosantander.pruebaapi.models.Card;

@Repository 
public interface CardRepository extends JpaRepository<Card, Integer> {

}
