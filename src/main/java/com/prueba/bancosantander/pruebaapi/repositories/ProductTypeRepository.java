package com.prueba.bancosantander.pruebaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.bancosantander.pruebaapi.models.ProductType;

@Repository 
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

}
