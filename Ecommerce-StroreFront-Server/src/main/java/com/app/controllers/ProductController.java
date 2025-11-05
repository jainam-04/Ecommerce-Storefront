package com.app.controllers;

import com.app.models.Product;
import com.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/category/{id}")
    public List<Product> getAllProductsByCategoryId(@PathVariable long id){
        return service.getAllProductsByCategory(id);
    }
}
