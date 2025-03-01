package com.example.metalmaked.web.controller;

import com.example.metalmaked.domain.service.*;
import com.example.metalmaked.persistence.entity.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RolController {
    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public List<Rol> getAll() {
        return rolService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Rol> getById(@PathVariable Integer id) {
        return rolService.getById(id);
    }

    @PostMapping
    public Rol save(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        rolService.delete(id);
    }
}
