package com.example.voorbeeldexamen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persoon {

    @NotBlank
  private String naam;

 @Id
 private String veiligheidsnummer;

 @UniqueElements
    @Email
    private String email;

 public Persoon(){

 }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVeiligheidsnummer() {
        return veiligheidsnummer;
    }

    public void setVeiligheidsnummer(String veiligheidsnummer) {
        this.veiligheidsnummer = veiligheidsnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persoon(String naam, String veiligheidsnummer, String email) {
        this.naam = naam;
        this.veiligheidsnummer = veiligheidsnummer;
        this.email = email;
    }
}
