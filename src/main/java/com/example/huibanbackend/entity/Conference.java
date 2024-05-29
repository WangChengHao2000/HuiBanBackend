package com.example.huibanbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Conference {
    @Id
    @Column(name = "c-id")
    private Long id;

    private String name;
    private String abbreviation;
    private String CCF;
    private String CORE;
    private String QUALIS;
    private String delay;
}
