package com.example.huibanbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Journal {
    @Id
    @Column(name = "j-id")
    private Long id;

    private String name;
    private String specialIssue;
    private String CCF;
}
