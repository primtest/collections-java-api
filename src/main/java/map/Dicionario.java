package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }else {
            System.out.println("O dicionário está vazio.");
        }
    }
    public void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        }else {
            System.out.println("O dicionário está vazio.");
        }
    }
    public String pesquisarPorPalavra(String palavra) {
        String resultadoBusca = null;
        if (!dicionario.isEmpty()) {
            resultadoBusca = dicionario.get(palavra);
            if (resultadoBusca == null){
                System.out.println("Palavra não encontrada");
            }
        }else {
            System.out.println("O dicionário está vazio.");
        }
        return resultadoBusca;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("java");

        dicionario.pesquisarPorPalavra("java");

        String definicaoType = dicionario.pesquisarPorPalavra("typescript");
        System.out.println(definicaoType);
    }
}
