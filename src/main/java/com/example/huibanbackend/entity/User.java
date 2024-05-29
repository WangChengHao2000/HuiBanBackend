package com.example.huibanbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @Column(name = "u-id")
    private Long id;

    private String name;
    private String mail;
    private String institution;
    private String registerTime;
}
