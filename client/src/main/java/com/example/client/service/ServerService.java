package com.example.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServerService {

    @Autowired
    private RestTemplate restTemplate;

    public String getHelloMessage() {
        return restTemplate.getForObject("https://localhost:8443/api/hello", String.class);
    }
} 