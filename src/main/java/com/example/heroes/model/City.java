package com.example.heroes.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne(targetEntity = Location.class)
    private Location location;
    @OneToMany(targetEntity = Incident.class)
    private Set<Incident> incidents;
    private String passwordHash;
    private String passwordCrypt;
}
