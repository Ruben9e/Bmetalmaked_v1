package com.example.metalmaked.persistence.entity;

import java.io.Serializable;
import java.util.Objects;

public class PersonaRolId implements Serializable {
    private Integer persona;
    private Integer rol;

    public PersonaRolId() {}

    public PersonaRolId(Integer persona, Integer rol) {
        this.persona = persona;
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaRolId that = (PersonaRolId) o;
        return Objects.equals(persona, that.persona) && Objects.equals(rol, that.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persona, rol);
    }
}
