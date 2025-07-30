package com.example.demo.entity;

import com.example.demo.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Setter
    @Getter
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Setter
    @Getter
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Setter
    @Getter
    @Column(nullable = false)
    private UserRole role; // CUSTOMER, ADMIN, TELLER

    @Setter
    private Boolean isBlocked = false;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Account> accounts;

}
