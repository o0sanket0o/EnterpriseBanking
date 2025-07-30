package com.example.demo.controller.admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/sayHi")
    public String hiAdmin(){
        return "Hey Admin. Welcome to the slot of your deployment.";
    }
}
