package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Product create(Product product);
    Product delete(int id);
    Product update(int id);
    Optional<Product> findById(Integer id);
}
