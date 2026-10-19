package com.prueba.bancosantander.pruebaapi.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.prueba.bancosantander.pruebaapi.models.Product;
import com.prueba.bancosantander.pruebaapi.models.ProductType;
import com.prueba.bancosantander.pruebaapi.repositories.ProductRepository;
import com.prueba.bancosantander.pruebaapi.repositories.ProductTypeRepository;

@Component 
@Order (3)
public class PorductSeed implements CommandLineRunner{

    @Autowired 
    private ProductRepository productRepository;

    @Autowired 
    private ProductTypeRepository productTypeRepository;

    @Override 
    public void run(String... args) throws Exception {
        ProductType credit = productTypeRepository.findById(1).get();
        ProductType debit = productTypeRepository.findById(2).get();
        if (productRepository.count() == 0) {
            productRepository.save(new Product(true, "Platino", debit));
            productRepository.save(new Product(true, "Credito basica", credit));
        }   

    }


}
