package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String testServerConnection() {
        return restTemplate.getForObject("https://localhost:8443/api/hello", String.class);
    }
} 