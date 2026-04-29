package br.com.taskflow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "unidades_curriculares")
public class UnidadeCurricular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(name = "total_aulas", nullable = false)
    private Integer totalAulas;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @OneToMany(mappedBy = "unidadeCurricular", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Frequencia> frequencias = new ArrayList<>();
}