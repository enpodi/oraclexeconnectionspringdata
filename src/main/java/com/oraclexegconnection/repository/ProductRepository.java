package com.oraclexegconnection.repository;

import com.oraclexegconnection.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    // agregar consultas personalizadas si es necesario
}