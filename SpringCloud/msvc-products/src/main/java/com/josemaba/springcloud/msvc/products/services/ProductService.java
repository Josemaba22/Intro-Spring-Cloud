package com.josemaba.springcloud.msvc.products.services;

import java.util.List;
import java.util.Optional;

import com.josemaba.springcloud.msvc.products.entites.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

}
