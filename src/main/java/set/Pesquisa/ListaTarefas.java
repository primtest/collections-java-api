package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefasSet;

    //HashSet vazio para ListaTarefas
    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefasParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefasParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirTarefas(){
        if (!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        }else {
            System.out.println("o conjunto está vazio");
        }
    }

    public int contarTarefas(){
        int quantidadeTarefas = 0;
        for (Tarefa t : tarefasSet) {
            quantidadeTarefas +=1;
        }
        return quantidadeTarefas;
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> setTarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()){
                setTarefasConcluidas.add(t);
            }
        }
        return setTarefasConcluidas;
    }


    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> setTarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.isConcluida()){
                    setTarefasPendentes.add(t);
                }
            }
            return setTarefasPendentes;
        }else {
            throw new RuntimeException("O conjunto está vazio.");
        }
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }




}
