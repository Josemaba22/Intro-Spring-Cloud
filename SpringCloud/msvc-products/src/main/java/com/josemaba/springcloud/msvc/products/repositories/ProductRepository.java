package com.josemaba.springcloud.msvc.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.josemaba.springcloud.msvc.products.entites.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
