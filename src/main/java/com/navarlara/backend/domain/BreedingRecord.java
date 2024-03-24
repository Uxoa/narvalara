package com.navarlara.backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class BreedingRecord {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String offspringName;
    
    @ManyToOne
    private Dog dog;
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setOffspringName(String offspringName) {
        this.offspringName = offspringName;
    }
}