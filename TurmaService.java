package br.com.taskflow.repository;

import br.com.taskflow.model.Turma;
import br.com.taskflow.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
    List<Turma> findByInstrutor(Usuario instrutor);
    List<Turma> findByInstrutorId(Long instrutorId);
}