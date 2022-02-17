package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final UserService userService;
    private final ProductService productService;

    @Autowired
    public ProductController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping
    @ResponseBody
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping
    @ResponseBody
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Product delete(@RequestHeader int id){
        return productService.delete(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Product update(@RequestHeader int id){
        return productService.update(id);
    }


}
