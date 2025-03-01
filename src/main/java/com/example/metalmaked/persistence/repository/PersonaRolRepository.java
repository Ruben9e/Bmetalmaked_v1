package com.example.metalmaked.persistence.repository;

import com.example.metalmaked.persistence.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRolRepository extends CrudRepository<PersonaRol, Integer> {}