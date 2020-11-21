package com.github.primeiroprojetospringbatch.dominio;

public class Transacao {

    public String id;
    public String descricao;
    public double valor;

    @Override
    public String toString() {
        return "Transacao{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
