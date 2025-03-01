package com.example.metalmaked.persistence.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Persona_roles")
@IdClass(PersonaRolId.class) // Usamos una clase para representar la clave compuesta
public class PersonaRol {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    // Getters y Setters
}
