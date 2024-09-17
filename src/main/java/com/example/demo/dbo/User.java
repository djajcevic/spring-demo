package com.example.demo.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    public Long id;
    public String name;
}
