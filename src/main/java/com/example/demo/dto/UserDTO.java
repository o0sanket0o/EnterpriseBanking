package com.example.demo.dto;

import com.example.demo.enums.UserRole;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO {
    private String fullname;
    private String email;
    private UserRole role;
}
