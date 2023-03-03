package com.example.heroes.repository;

import com.example.heroes.model.Hero;
import com.example.heroes.model.IncidentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
    Hero findByEmail(String email);
    List<Hero> findAllByIncidentTypesIn(Set<IncidentType> incidentType);

    List<Hero> findAllByEmailContainingIgnoreCaseOrNameContainingIgnoreCaseOrPhoneContainingIgnoreCase(String email, String name,String phone);

    List<Hero> findAllByNameIsContainingIgnoreCase(String name);
}
