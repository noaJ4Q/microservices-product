package com.example.serviceproduct.controllers;

import com.example.serviceproduct.entities.Product;
import com.example.serviceproduct.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> list(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product listById(@PathVariable("id") int id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElse(null);
    }
}
