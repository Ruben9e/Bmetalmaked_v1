package com.example.metalmaked.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.Set;

@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, unique = true, length = 50)
    @Email
    private String correo;

    @Column(nullable = false, length = 60)
    private String contraseña;

    @Column(length = 50)
    private String direccion;

    @Column(length = 20)
    private String telefono;

    @ManyToMany
    @JoinTable(
            name = "Persona_roles",
            joinColumns = @JoinColumn(name = "id_persona"),
            inverseJoinColumns = @JoinColumn(name = "id_rol")
    )
    private Set<Rol> roles;

    // Getters y Setters
}
