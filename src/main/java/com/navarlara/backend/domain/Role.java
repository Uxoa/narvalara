package com.navarlara.backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Role {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @ManyToMany
    private Set<Permission> permissions = new HashSet<>();
    public void addPermission(Permission permission) {
        permissions.add(permission);
    }
    public void removePermission(Permission permission) {
        permissions.remove(permission);
    }
    
}