package dev.teste.testeCadastros.Alunos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controler_aluno {
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Primeira Mensagem";
    }
}
