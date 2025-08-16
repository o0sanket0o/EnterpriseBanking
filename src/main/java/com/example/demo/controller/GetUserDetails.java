package com.example.demo.controller;


import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetUserDetails {
    @Autowired
    private UserService userService;
    @GetMapping("/getUserByEmail")
    public UserDTO getUserByEmail(@RequestParam String email){
        System.out.println(email);
        return userService.getUserByEmail(email);
    }
    @GetMapping("/getAllUsers")
    public List<UserDTO> findAllUsers(){
        return userService.getAllUsers();
    }
}
