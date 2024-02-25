package com.barefoot.repository;

import com.barefoot.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
