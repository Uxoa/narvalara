package com.navarlara.backend.domain;

import jakarta.persistence.*;

@Entity
public class Permission {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
}