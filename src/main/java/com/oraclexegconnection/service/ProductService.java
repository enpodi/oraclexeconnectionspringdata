package com.oraclexegconnection.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oraclexegconnection.model.Product;
import com.oraclexegconnection.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(list::add);
        return list;
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product create(Product product) {
        product.setProductId(null); // asegurar insert
        return productRepository.save(product);
    }

    public Optional<Product> update(Long id, Product product) {
        return productRepository.findById(id)
                .map(existing -> {
                    product.setProductId(id);
                    return productRepository.save(product);
                });
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
