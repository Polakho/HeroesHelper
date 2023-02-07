package com.heroes.service;

import com.heroes.model.Hero;
import com.heroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {
    private final HeroRepository heroRepository;

    @Autowired
    public HeroService(HeroRepository heroRepository){
        this.heroRepository = heroRepository;
    }

    public void addHero(Hero hero) {
        heroRepository.save(hero);
    }
}
