package com.example.metalmaked.persistence.mapper;

import com.example.metalmaked.domain.dto.PersonaDTO;
import com.example.metalmaked.persistence.entity.Persona;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);

    PersonaDTO toPersonaDTO(Persona persona);
    Persona toPersona(PersonaDTO personaDTO);
    List<PersonaDTO> toPersonaDTOs(List<Persona> personas);
}
