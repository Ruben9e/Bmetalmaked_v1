package com.example.metalmaked.domain.service;

import com.example.metalmaked.persistence.entity.Rol;
import com.example.metalmaked.persistence.repository.RolRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RolService {
    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> getAll() {
        return (List<Rol>) rolRepository.findAll();
    }

    public Optional<Rol> getById(Integer id) {
        return rolRepository.findById(id);
    }

    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }
}
