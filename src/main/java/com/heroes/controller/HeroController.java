package com.heroes.controller;

import com.heroes.model.Hero;
import com.heroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @RequestMapping ("/register")
    public String registerHero(Hero hero){
        //heroService.addHero(hero);

        return "HelloWorld";
    }

    @RequestMapping ("/test")
    public String test(Model model){
        //heroService.addHero(hero);
        model.addAttribute("test", "test");
        return "HelloWorld.html";
    }
}
