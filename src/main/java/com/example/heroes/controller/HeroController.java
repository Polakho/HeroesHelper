package com.example.heroes.controller;

import com.example.heroes.DTO.RegisterHero;
import com.example.heroes.DTO.SearchHero;
import com.example.heroes.model.Hero;
import com.example.heroes.service.HeroService;
import com.example.heroes.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@Controller
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;
    private final IncidentService incidentService;

    @Autowired
    public HeroController(HeroService heroService, IncidentService incidentService) {
        this.heroService = heroService;
        this.incidentService = incidentService;
    }

    @RequestMapping ("/login")
    public String Login(){
        //heroService.addHero(hero);
        return "hero/login";
    }

    @GetMapping("/register")
    public String registerViewHero(Model model){
        model.addAttribute("IncidentTypes", this.incidentService.getAllIncidentType());
        model.addAttribute("registerHero", new RegisterHero());
        return "hero/register";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerHeroSubmit(@ModelAttribute RegisterHero registerHero, Model model){
        Hero hero = this.heroService.addHero(registerHero);
        model.addAttribute("hero", hero);
        return "hero/registered";
    }

    @GetMapping("/listing")
    public String listing(Model model){
        List<Hero> list = this.heroService.FindAllHero();
        model.addAttribute("list", list);
        model.addAttribute("searchHero", new SearchHero());
        return "hero/listing";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String SearchListing(@ModelAttribute SearchHero searchHero, Model model){
        List<Hero> list = this.heroService.findWithSearch(searchHero);
        model.addAttribute("list", list);
        //model.addAttribute("searchHero", searchHero);
        return "hero/result";
        //return "HelloWorld";
    }

}
