package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")


public class Sample {
    @GetMapping("/get")
    public String sayHello(){
        return "Hello hello from the random controller.";
    }
}
