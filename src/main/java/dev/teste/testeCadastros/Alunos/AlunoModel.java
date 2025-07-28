package dev.teste.testeCadastros.Alunos;

import dev.teste.testeCadastros.Aulas.AulasModel;
import jakarta.persistence.*;

import java.util.List;

//Transforma classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro_teste")

public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            
    private long id;
    private String nome;
    private String email;
    private int idade;

    //Muitos para um
    @ManyToOne
    @JoinColumn(name = "missoes_id")//Foreing Key 
    private AulasModel aulas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public AlunoModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
