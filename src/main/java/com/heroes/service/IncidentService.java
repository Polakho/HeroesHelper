package com.heroes.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroes.model.IncidentType;
import com.heroes.repository.IncidentTypeRepository;
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