package com.heroes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "incident_type")
public class IncidentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public IncidentType(){

    }
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
}
