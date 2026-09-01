package com.alexiadev.agendador_tafera.infrastructure.repository;

import com.alexiadev.agendador_tafera.infrastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends MongoRepository<TarefasEntity, String> {
}
