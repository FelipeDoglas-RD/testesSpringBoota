package dev.teste.testeCadastros.Aulas;

import dev.teste.testeCadastros.Alunos.AlunoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_aulas")

public class AulasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nomeAula;
    private String dificuldade;

    //Um para muitos @OneToMany
    @OneToMany(mappedBy = "aluno")
    private AlunoModel aluno;

    public AulasModel(long id, String nomeAula, String dificuldade) {
        this.id = id;
        this.nomeAula = nomeAula;
        this.dificuldade = dificuldade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
