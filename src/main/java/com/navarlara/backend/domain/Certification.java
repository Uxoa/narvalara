package com.navarlara.backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String certificateName;
    private String issuedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
}