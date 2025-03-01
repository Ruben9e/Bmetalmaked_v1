package com.example.metalmaked.domain.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class PersonaDTO {
    private Integer idPersona;
    private String nombre;
    private String correo;
    private String direccion;
    private String telefono;
    private Set<String> roles;
}

