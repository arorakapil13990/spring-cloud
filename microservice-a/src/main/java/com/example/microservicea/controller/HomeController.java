package com.example.microservicea.controller;

import com.example.microservicea.properties.BootstrapProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    BootstrapProperties properties;

    @GetMapping("/message")
    public String home() {
        return properties.getMessage();
    }

}
