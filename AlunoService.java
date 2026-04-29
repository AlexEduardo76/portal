package br.com.taskflow.repository;

import br.com.taskflow.model.Aluno;
import br.com.taskflow.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByTurma(Turma turma);
    List<Aluno> findByTurmaId(Long turmaId);
    Optional<Aluno> findByMatricula(String matricula);
    boolean existsByMatricula(String matricula);
}