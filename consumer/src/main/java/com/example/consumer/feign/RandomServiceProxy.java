package com.example.consumer.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient(name = "microservice-a") // without gateway
@FeignClient(name = "gateway")
@RibbonClient(name = "microservice-a")
public interface RandomServiceProxy {

    //@RequestMapping("/random") // without gateway
    @RequestMapping("/microservice-a/random")
    List<Integer> randoms();
}
