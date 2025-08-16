package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    public UserDTO getUserByEmail(String email){
        System.out.println("We have used " + email);
        User user = userRepository.findByEmail(email).orElse(null);
        return userMapper.toDto(user);
    }

    public List<UserDTO> getAllUsers(){
        List<User> allUsers = userRepository.findAll();
        List <UserDTO> allUsersDto = allUsers.stream().map(user -> userMapper.toDto(user)).collect(Collectors.toList());
        return allUsersDto;
    }
}
