package com.prueba.bancosantander.pruebaapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.bancosantander.pruebaapi.repositories.ProductRepository;

@Service 
public class ProductService {


    @Autowired 
    private ProductRepository productRepository;
}
