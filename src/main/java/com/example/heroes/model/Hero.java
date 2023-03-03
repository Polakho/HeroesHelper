package com.example.heroes.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "hero")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    @ManyToMany(targetEntity=IncidentType.class)
    private Set<IncidentType> incidentTypes;
    private String phone;
    @OneToOne(targetEntity = Location.class, cascade = CascadeType.ALL)
    private Location location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telephone) {
        this.phone = telephone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
