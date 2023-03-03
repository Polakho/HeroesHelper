package com.example.heroes.DTO;

import com.example.heroes.model.IncidentType;

import java.util.List;
import java.util.Set;


public class RegisterHero {

    private String email;
    private String password;
    private String name;
    private String phone;
    private Set<IncidentType> incidentTypes;
    private String lat;
    private String lng;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<IncidentType> getIncidentTypes() {
        return incidentTypes;
    }

    public void setIncidentTypes(Set<IncidentType> incidentTypes) {
        this.incidentTypes = incidentTypes;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
