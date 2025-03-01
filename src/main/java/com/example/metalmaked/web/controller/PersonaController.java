package com.example.metalmaked.web.controller;

import com.example.metalmaked.domain.service.PersonaService;
import com.example.metalmaked.persistence.entity.Persona;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getAll() {
        return personaService.getAll();
    }
}
