package com.example.metalmaked.persistence.mapper;

import com.example.metalmaked.domain.dto.RolDTO;
import com.example.metalmaked.persistence.entity.Rol;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RolMapper {
    RolMapper INSTANCE = Mappers.getMapper(RolMapper.class);

    @Mapping(target = "idRol", source = "idRol")
    @Mapping(target = "nombreRol", source = "nombreRol")
    RolDTO toRolDTO(Rol rol);

    @Mapping(target = "idRol", source = "idRol")
    @Mapping(target = "nombreRol", source = "nombreRol")
    Rol toRol(RolDTO rolDTO);

    List<RolDTO> toRolDTOs(List<Rol> roles);
}
