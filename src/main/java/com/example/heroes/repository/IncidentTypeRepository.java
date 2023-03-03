package com.example.heroes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.heroes.model.IncidentType;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentTypeRepository extends JpaRepository<IncidentType, Integer> {


}
