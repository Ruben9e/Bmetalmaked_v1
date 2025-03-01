package com.example.metalmaked.domain.service;

import com.example.metalmaked.persistence.entity.Persona;
import com.example.metalmaked.persistence.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAll() {
        return (List<Persona>) personaRepository.findAll();
    }

    public Optional<Persona> getById(Integer id) {
        return personaRepository.findById(id);
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void delete(Integer id) {
        personaRepository.deleteById(id);
    }
}
