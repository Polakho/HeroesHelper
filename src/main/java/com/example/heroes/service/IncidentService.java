package com.example.heroes.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.heroes.model.IncidentType;
import com.example.heroes.repository.IncidentTypeRepository;
@Service
public class IncidentService {
    private final IncidentTypeRepository incidentTypeRepository;

    public IncidentService(IncidentTypeRepository incidentTypeRepository){
        this.incidentTypeRepository = incidentTypeRepository;
    }
    public List<IncidentType> getAllIncidentType()
    {
        List<IncidentType> incidentTypes = incidentTypeRepository.findAll();

        return incidentTypes;
    }
    public void addIncidentType(IncidentType incidentType)
    {
        incidentTypeRepository.save(incidentType);
    }
}