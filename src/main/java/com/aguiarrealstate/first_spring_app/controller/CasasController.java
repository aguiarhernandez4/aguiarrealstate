package com.aguiarrealstate.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CasasController {
    @GetMapping("/casas")
    public String lista() {
        return "casas";
    }
    @PostMapping("/casas")
    public String salvar(
        @RequestParam String endereco,
        @RequestParam String preco,
        @RequestParam String bairro,
        @RequestParam String cidade,
        @RequestParam String estado,
        @RequestParam String cep,
        @RequestParam String quartos,
        @RequestParam String banheiros,
        @RequestParam String garagem,
        @RequestParam String metragem,
        @RequestParam String descricao
    ) {

        System.out.println(endereco + " - " + preco);
        return "redirect:/casas";
    }


}
