package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean concluida;

    //constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }


    //getters
    public String getDescricao() {
        return descricao;
    }

    public Boolean isConcluida() {
        return concluida;
    }

    //setter
    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefas = (Tarefa) o;
        return Objects.equals(descricao, tarefas.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "→→→" +
                descricao +
                ", concluida?{" + concluida +
                '}';
    }
}
