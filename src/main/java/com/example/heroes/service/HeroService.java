package com.example.heroes.service;

import com.example.heroes.DTO.IncidentRegister;
import com.example.heroes.DTO.RegisterHero;
import com.example.heroes.DTO.SearchHero;
import com.example.heroes.config.Constante;
import com.example.heroes.model.Hero;
import com.example.heroes.model.IncidentType;
import com.example.heroes.model.Location;
import com.example.heroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository){
        this.heroRepository = heroRepository;
    }

    public Hero addHero(RegisterHero registerHero) {
            Hero hero = new Hero();
            hero.setName(registerHero.getName());
            hero.setEmail(registerHero.getEmail());
            hero.setPassword(registerHero.getPassword());
            hero.setPhone(registerHero.getPhone());
            hero.setIncidentTypes(registerHero.getIncidentTypes());
            hero.setLocation(new Location(registerHero.getLng(), registerHero.getLat()));
            heroRepository.save(hero);
            return hero;
    }

    public List<Hero> FindAllHeroByIncidentAndLocation(IncidentRegister incidentRegister) {
        Set<IncidentType> incidentTypes = new HashSet<>();
        incidentTypes.add(incidentRegister.getIncidentType());
        List<Hero> list = this.heroRepository.findAllByIncidentTypesIn(incidentTypes);
        List<Hero> heroes = new ArrayList<>();
        Double lat = Double.parseDouble(incidentRegister.getLat());
        Double lng = Double.parseDouble(incidentRegister.getLng());
        list.forEach(hero -> {
            double dist = org.apache.lucene.util.SloppyMath.haversinMeters(lat,
                                                                           lng,
                                                                           Double.parseDouble(hero.getLocation().getLatitude()),
                                                                           Double.parseDouble(hero.getLocation().getLongitude())
            );
            dist = dist/1000;
            if (dist <= Constante.searchKm){
                heroes.add(hero);
            }
        });
        return heroes;
    }

    public List<Hero> FindAllHero() {
        List<Hero> list = this.heroRepository.findAll();
        return list;
    }

    public List<Hero> findWithSearch(SearchHero searchHero) {
        List<Hero> list = this.heroRepository.findAllByEmailContainingIgnoreCaseOrNameContainingIgnoreCaseOrPhoneContainingIgnoreCase(searchHero.getName(), searchHero.getName(), searchHero.getName());
        //List<Hero> list = this.heroRepository.findAllByNameIsContainingIgnoreCase(searchHero.getName());
        return list;
    }
}
