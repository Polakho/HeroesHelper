package com.heroes.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "hero")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(targetEntity=IncidentType.class)
    private Set<IncidentType> incidentTypes;
    private String telephone;
    @OneToOne
    private Location location;
    private String passwordHash;
    private String passwordCrypt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<IncidentType> getIncidentTypes() {
        return incidentTypes;
    }

    public void setIncidentTypes(Set<IncidentType> incidentTypes) {
        this.incidentTypes = incidentTypes;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordCrypt() {
        return passwordCrypt;
    }

    public void setPasswordCrypt(String passwordCrypt) {
        this.passwordCrypt = passwordCrypt;
    }


}
