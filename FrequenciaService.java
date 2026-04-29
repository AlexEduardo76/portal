package br.com.taskflow.repository;

import br.com.taskflow.model.Frequencia;
import br.com.taskflow.model.Aluno;
import br.com.taskflow.model.UnidadeCurricular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FrequenciaRepository extends JpaRepository<Frequencia, Long> {

    // Buscar frequências por aluno
    List<Frequencia> findByAluno(Aluno aluno);

    // Buscar frequências por UC
    List<Frequencia> findByUnidadeCurricular(UnidadeCurricular uc);

    // Buscar frequências por aluno e UC
    List<Frequencia> findByAlunoAndUnidadeCurricular(Aluno aluno, UnidadeCurricular uc);

    // Buscar frequência específica
    Optional<Frequencia> findByAlunoIdAndUnidadeCurricularIdAndAulaNumero(Long alunoId, Long ucId, Integer aulaNumero);

    // Buscar frequências por data
    List<Frequencia> findByData(LocalDate data);

    // Buscar frequências por UC e data
    List<Frequencia> findByUnidadeCurricularIdAndData(Long ucId, LocalDate data);

    // Contar presenças de um aluno em uma UC
    @Query("SELECT COUNT(f) FROM Frequencia f WHERE f.aluno.id = :alunoId AND f.unidadeCurricular.id = :ucId AND f.presente = true")
    Integer countPresencasByAlunoAndUc(@Param("alunoId") Long alunoId, @Param("ucId") Long ucId);

    // Contar faltas consecutivas de um aluno
    @Query("SELECT f.aulaNumero FROM Frequencia f WHERE f.aluno.id = :alunoId AND f.unidadeCurricular.id = :ucId AND f.presente = false ORDER BY f.aulaNumero")
    List<Integer> findFaltasAulasByAlunoAndUc(@Param("alunoId") Long alunoId, @Param("ucId") Long ucId);

    // Buscar todas as frequências de uma turma
    @Query("SELECT f FROM Frequencia f WHERE f.aluno.turma.id = :turmaId")
    List<Frequencia> findByTurmaId(@Param("turmaId") Long turmaId);
}