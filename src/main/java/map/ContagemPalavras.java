package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasContadas;

    public ContagemPalavras() {
        this.palavrasContadas = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasContadas.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasContadas.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavrasContadas);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorFrequencia = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : palavrasContadas.entrySet()) {
            if (entry.getValue() > maiorFrequencia) {
                maiorFrequencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Pitanga", 2);
        contagemPalavras.adicionarPalavra("Manga", 5);
        contagemPalavras.adicionarPalavra("Uva", 2);
        contagemPalavras.adicionarPalavra("Mamão", 1);

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

    }
}
