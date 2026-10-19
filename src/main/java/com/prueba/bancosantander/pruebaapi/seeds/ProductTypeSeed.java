package com.prueba.bancosantander.pruebaapi.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.prueba.bancosantander.pruebaapi.models.ProductType;
import com.prueba.bancosantander.pruebaapi.repositories.ProductTypeRepository;

@Component 
@Order (1)
public class ProductTypeSeed implements CommandLineRunner{

    @Autowired 
    private ProductTypeRepository productTypeRepository;


    @Override 
    public void run(String... args) throws Exception {
        if (productTypeRepository.count() == 0) {
            productTypeRepository.save(new ProductType("CREDIT"));
            productTypeRepository.save(new ProductType("DEBIT"));
        }   

    }

}
