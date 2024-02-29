package com.devayush.PracticeDemo.service;


import com.devayush.PracticeDemo.entity.Product;
import com.devayush.PracticeDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
