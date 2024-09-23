package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos:
    private String nome;
    private int numero;

    //constructor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    //getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    //setter para trocar o número
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //método_para não permitir dois itens com nomes iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    //toString para exibir uma String invés da localização dela na memória
    @Override
    public String toString() {
        return "*" + nome + " : " + numero;
    }

}

