package com.heroes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.heroes.model.IncidentType;
import com.heroes.service.IncidentService;
import java.util.List;
@RestController
@RequestMapping("/incident")
public class IncidentController
{

    private final IncidentService incidentService;

    @Autowired

    public IncidentController(IncidentService incidentService){
        this.incidentService = incidentService;
    }
    @GetMapping("/type/getAll")
    public List<IncidentType> getAllIncidentType()
    {
        return incidentService.getAllIncidentType();
    }

    /*@RequestMapping(value="/add-user", method=RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord)
    {
        userService.addUser(userRecord);
    }*/
}