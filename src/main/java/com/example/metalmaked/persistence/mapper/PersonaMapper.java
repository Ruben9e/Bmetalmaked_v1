package com.example.metalmaked.persistence.mapper;

import com.example.metalmaked.domain.dto.PersonaDTO;
import com.example.metalmaked.persistence.entity.Persona;
import com.example.metalmaked.persistence.entity.Rol;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);

    @Mapping(target = "roles", source = "roles", qualifiedByName = "rolesToStrings")
    PersonaDTO toPersonaDTO(Persona persona);

    @Mapping(target = "roles", source = "roles", qualifiedByName = "stringsToRoles")
    @Mapping(target = "contraseña", ignore = true) // Ignorar la contraseña al mapear de DTO a entidad
    Persona toPersona(PersonaDTO personaDTO);

    List<PersonaDTO> toPersonaDTOs(List<Persona> personas);

    @Named("rolesToStrings")
    static Set<String> rolesToStrings(Set<Rol> roles) {
        if (roles == null) return null;
        return roles.stream().map(Rol::getNombre).collect(Collectors.toSet());
    }

    @Named("stringsToRoles")
    static Set<Rol> stringsToRoles(Set<String> roles) {
        if (roles == null) return null;
        return roles.stream().map(rolNombre -> {
            Rol rol = new Rol();
            rol.setNombreRol(rolNombre);
            return rol;
        }).collect(Collectors.toSet());
    }
}
