package com.heroes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.heroes.model.IncidentType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncidentTypeRepository extends JpaRepository<IncidentType, Integer> {


}
