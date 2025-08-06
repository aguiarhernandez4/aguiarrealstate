package com.aguiarrealstate.first_spring_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class casa_para_vender {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    String endereco;
    int preco;
    String bairro;
    String cidade;
    String estado;
    String cep;
    int quartos;
    int banheiros;
    boolean garagem;
    int metragem;
    String descricao;

    
}
