package com.aguiarrealstate.first_spring_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class imovel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    String endereco;
    int preco;
    String bairro;
    String cidade;
    String estado;
    int cep;
    int quartos;
    int banheiros;
    boolean garagem;
    int metragem;
    String descricao;



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getPreco() {
        return preco;
    }


    public void setPreco(int preco) {
        this.preco = preco;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getCep() {
        return cep;
    }


    public void setCep(int cep) {
        this.cep = cep;
    }


    public int getQuartos() {
        return quartos;
    }


    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }


    public int getBanheiros() {
        return banheiros;
    }


    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }


    public boolean isGaragem() {
        return garagem;
    }


    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }


    public int getMetragem() {
        return metragem;
    }


    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    
    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
