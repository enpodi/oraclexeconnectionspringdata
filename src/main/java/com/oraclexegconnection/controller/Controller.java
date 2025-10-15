package com.oraclexegconnection.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import com.oraclexegconnection.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oraclexegconnection.service.ProductService;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ProductService ps;

    @PostMapping("/hello")
    public ResponseEntity<String> hello(@RequestBody Map<String, String> payload) {
        String name = payload.getOrDefault("name", "world");
        System.out.println("all: "  + ps.findAll());
        return ResponseEntity.ok("Hello " + name);
    }
}