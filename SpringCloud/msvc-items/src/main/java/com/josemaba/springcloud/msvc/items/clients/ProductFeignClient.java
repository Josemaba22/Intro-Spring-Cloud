package com.josemaba.springcloud.msvc.items.clients;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.josemaba.springcloud.msvc.items.models.Product;

@FeignClient(value = "mscv-product", url = "localhost:8001")
public interface ProductFeignClient {

    @GetMapping
    List<Product> findAll();

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id);

}
