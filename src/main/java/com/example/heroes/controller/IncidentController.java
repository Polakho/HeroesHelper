package com.example.heroes.controller;
import com.example.heroes.DTO.IncidentRegister;
import com.example.heroes.DTO.RegisterHero;
import com.example.heroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.heroes.service.IncidentService;

@Controller
@RequestMapping("/incident")
public class IncidentController
{
    private final HeroService heroService;
    private final IncidentService incidentService;

    @Autowired
    public IncidentController(HeroService heroService, IncidentService incidentService) {
        this.heroService = heroService;
        this.incidentService = incidentService;
    }
    @GetMapping("/type/getAll")
    public String getAllIncidentType(Model model)
    {
        model.addAttribute("list", this.incidentService.getAllIncidentType());
        return "incident/incidentType/list";
    }

    @GetMapping("/register")
    public String IncidentRegister(Model model)
    {
        model.addAttribute("list", this.incidentService.getAllIncidentType());
        model.addAttribute("incidentRegister", new IncidentRegister());
        return "incident/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerIncidentSubmit(@ModelAttribute IncidentRegister incidentRegister, Model model){
        model.addAttribute("heroes", this.heroService.FindAllHeroByIncidentAndLocation(incidentRegister));
        model.addAttribute("incidentRegister", incidentRegister);
        return "incident/result";
    }
}