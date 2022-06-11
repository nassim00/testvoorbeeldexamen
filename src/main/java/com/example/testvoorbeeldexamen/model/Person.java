package com.example.testvoorbeeldexamen.model;


import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Person {

    @Id
    private String veiligingspersoonnummer;

    @NotBlank
    private String naam;

    @UniqueElements
    @Email
    private String email;


    public Person() {
    }


    public Person(String veiligingspersoonnummer, String naam, String email) {
        this.veiligingspersoonnummer = veiligingspersoonnummer;
        this.naam = naam;
        this.email = email;
    }

    public String getVeiligingspersoonnummer() {
        return veiligingspersoonnummer;
    }

    public void setVeiligingspersoonnummer(String veiligingspersoonnummer) {
        this.veiligingspersoonnummer = veiligingspersoonnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
