package com.example.heroes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthController {

    @RequestMapping ("/")
    public String Home(){

        return "Home";
    }

    @RequestMapping ("/login_hero")
    public String HeroLogin(){

        return "hero/login";
    }
}
