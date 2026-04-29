package br.com.taskflow.repository;

import br.com.taskflow.model.UnidadeCurricular;
import br.com.taskflow.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UnidadeCurricularRepository extends JpaRepository<UnidadeCurricular, Long> {
    List<UnidadeCurricular> findByTurma(Turma turma);
    List<UnidadeCurricular> findByTurmaId(Long turmaId);
    boolean existsByNomeAndTurmaId(String nome, Long turmaId);
}