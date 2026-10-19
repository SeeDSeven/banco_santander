package com.prueba.bancosantander.pruebaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.bancosantander.pruebaapi.models.Product;

@Repository 
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
