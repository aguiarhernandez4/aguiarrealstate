package com.aguiarrealstate.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CasasController {
    @GetMapping("/casas")
    public String lista() {
        return "casas";
    }
    
    public class casa {
        String endereco;
        int preco;
        String bairro;
        String cidade;
        String estado;
        String cep;
        String quartos;
        String banheiros;
        String garagem;
        String metragem;
        String descricao;

        public void conferir_dados() {
            if (endereco.length() == 0 || preco <= 200 || bairro.isEmpty() == true || cidade.isEmpty() == true || estado.isEmpty() == true || cep.isEmpty() == true || quartos.isEmpty() == true || banheiros.isEmpty() == true || garagem.isEmpty() == true || metragem.isEmpty() == true || descricao.isEmpty() == true) {
                System.out.println("Dados inválidos, por favor verifique os campos.");

                } 
                else {
                System.out.println("Dados válidos, casa cadastrada com sucesso!");

                }
        }
        
    }
}
