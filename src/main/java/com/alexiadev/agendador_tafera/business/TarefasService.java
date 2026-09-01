package com.alexiadev.agendador_tafera.business;

import com.alexiadev.agendador_tafera.business.dto.TarefasDTO;
import com.alexiadev.agendador_tafera.business.mapper.TarefasConverter;
import com.alexiadev.agendador_tafera.infrastructure.entity.TarefasEntity;
import com.alexiadev.agendador_tafera.infrastructure.enums.StatusNotificacaoEnum;
import com.alexiadev.agendador_tafera.infrastructure.repository.TarefaRepository;
import com.alexiadev.agendador_tafera.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefaRepository tarefaRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;


    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);
        return tarefaConverter.paraTarefaDTO(
                tarefaRepository.save(entity));
    }
}
