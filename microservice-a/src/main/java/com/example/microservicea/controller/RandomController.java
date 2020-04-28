package com.example.microservicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class RandomController {

    @GetMapping("/random")
    public List<Integer> random(){
        Random random = new Random();
        return random.ints( 5 ).boxed().collect( Collectors.toList() );
    }
}
