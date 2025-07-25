package dev.teste.testeCadastros;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controler_teste {
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Primeira Mensagem";
    }
}
