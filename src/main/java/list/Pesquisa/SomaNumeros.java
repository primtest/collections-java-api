package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numeros;

    //constructor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }


    //métodos
    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista ainda está vazia.");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista ainda está vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()){
            System.out.println(numeros);
        }else {
            throw new RuntimeException("A lista ainda está vazia.");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.encontrarMenorNumero());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.calcularSoma());
    }
}

