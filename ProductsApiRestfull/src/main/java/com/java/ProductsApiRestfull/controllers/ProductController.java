package com.java.ProductsApiRestfull.controllers;

import com.java.ProductsApiRestfull.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;
}
