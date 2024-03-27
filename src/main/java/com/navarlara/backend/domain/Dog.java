package com.navarlara.backend.domain;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "dog")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String pedigreeNumber;

    private LocalDate dateOfBirth;
    
    private String gender;
    
    private String color;
    
    private String breed;

    @OneToOne(cascade = CascadeType.ALL)
    private Dog parent;

    @OneToOne(cascade = CascadeType.ALL)
    private Dog mother;

    private String breeder;

    private String awards;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health_record_id")
    private HealthRecord healthRecord;

    private String microchip;

    @OneToMany(mappedBy = "dog", cascade = CascadeType.ALL)
    private List<Certification> certifications;

    private String temperament;

    @OneToMany(mappedBy = "dog", cascade = CascadeType.ALL)
    private List<BreedingRecord> breedingHistory;

    @Lob
    private byte[] photo;

    public Dog(Long id, String name, String pedigreeNumber, String breed, String gender, LocalDate dateOfBirth, String color, Dog parent, Dog mother, String breeder, String awards, HealthRecord healthRecord, String microchip, List<Certification> certifications, String temperament, List<BreedingRecord> breedingHistory, byte[] photo) {
        this.id = id;
        this.name = name;
        this.pedigreeNumber = pedigreeNumber;
        this.breed = breed;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
        this.parent = parent;
        this.mother = mother;
        this.breeder = breeder;
        this.awards = awards;
        this.healthRecord = healthRecord;
        this.microchip = microchip;
        this.certifications = certifications;
        this.temperament = temperament;
        this.breedingHistory = breedingHistory;
        this.photo = photo;
    }

    public Dog() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPedigreeNumber(String pedigreeNumber) {
        this.pedigreeNumber = pedigreeNumber;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParent(Dog parent) {
        this.parent = parent;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public void setHealthRecord(HealthRecord healthRecord) {
        this.healthRecord = healthRecord;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public void setBreedingHistory(List<BreedingRecord> breedingHistory) {
        this.breedingHistory = breedingHistory;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Dog{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", pedigreeNumber='" + pedigreeNumber + '\'' +
              ", breed='" + breed + '\'' +
              ", gender='" + gender + '\'' +
              ", dateOfBirth=" + dateOfBirth +
              ", color='" + color + '\'' +
              ", parent=" + parent +
              ", mother=" + mother +
              ", breeder='" + breeder + '\'' +
              ", awards='" + awards + '\'' +
              ", healthRecord=" + healthRecord +
              ", microchip='" + microchip + '\'' +
              ", certifications=" + certifications +
              ", temperament='" + temperament + '\'' +
              ", breedingHistory=" + breedingHistory +
              ", photo=" + Arrays.toString(photo) +
              '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(id, dog.id) && Objects.equals(name, dog.name) && Objects.equals(pedigreeNumber, dog.pedigreeNumber) && Objects.equals(breed, dog.breed) && Objects.equals(gender, dog.gender) && Objects.equals(dateOfBirth, dog.dateOfBirth) && Objects.equals(color, dog.color) && Objects.equals(parent, dog.parent) && Objects.equals(mother, dog.mother) && Objects.equals(breeder, dog.breeder) && Objects.equals(awards, dog.awards) && Objects.equals(healthRecord, dog.healthRecord) && Objects.equals(microchip, dog.microchip) && Objects.equals(certifications, dog.certifications) && Objects.equals(temperament, dog.temperament) && Objects.equals(breedingHistory, dog.breedingHistory) && Arrays.equals(photo, dog.photo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, pedigreeNumber, breed, gender, dateOfBirth, color, parent, mother, breeder, awards, healthRecord, microchip, certifications, temperament, breedingHistory);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

}
