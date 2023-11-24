package com.example.serviceproduct.repositories;

import com.example.serviceproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
//@RepositoryRestResource(path = "product") puede ser utilizado para crear rest api desde repositorio
public interface ProductRepository extends JpaRepository<Product, Integer> {
}