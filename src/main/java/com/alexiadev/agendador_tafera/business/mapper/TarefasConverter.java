package com.alexiadev.agendador_tafera.business.mapper;

import com.alexiadev.agendador_tafera.business.dto.TarefasDTO;
import com.alexiadev.agendador_tafera.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
