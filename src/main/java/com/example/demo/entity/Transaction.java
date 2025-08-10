package com.example.demo.entity;

import com.example.demo.enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "transactions")
public class Transaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String type; // DEPOSIT, WITHDRAW, TRANSFER

    @Setter
    @Column(nullable = false)
    private Double amount;

    @Setter
    private String description;

    @Setter
    private Boolean isFlagged = false;

    @Setter
    private TransactionStatus status;

    @Setter
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "related_account_id")
    private Account relatedAccount;
}
