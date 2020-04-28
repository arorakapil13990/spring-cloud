package com.example.consumer.controller;

import com.example.consumer.feign.RandomServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {


    @Autowired
    RandomServiceProxy serviceProxy;

    @GetMapping("/add")
    public Integer add() {
        return serviceProxy.randoms().stream().mapToInt(Integer::intValue).sum();
    }


}
