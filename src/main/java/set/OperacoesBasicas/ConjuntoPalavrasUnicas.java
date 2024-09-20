package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public Set<String> getPalavrasSet() {
        return palavrasSet;
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra (String palavra){
        String palavraParaRemover = null;
        if (!palavrasSet.isEmpty()){
            for (String p : palavrasSet) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavrasSet.remove(p);
                    System.out.println("Removendo a palavra: " + palavra);
                    break;
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }
    public void verificarPalavra(String palavra) {
        if (!palavrasSet.isEmpty()){
            for (String p : palavrasSet){
                if (palavra.equalsIgnoreCase(p)) {
                System.out.println("A palavra " + palavra + " está no set");
                break;
                }
            }
            System.out.println("A palavra " + palavra + " não está no set");
        }else {
            throw new RuntimeException("Alista está vazia.");
        }
    }
    public String exibirPalavrasUnicas(){
        return palavrasSet.toString();
    }

    public static void main(String[] args) {
        //criando instância da classe ConnjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        // adicionando palavras ao set
        palavrasUnicas.adicionarPalavra("Pleroma");
        palavrasUnicas.adicionarPalavra("Pitoresco");
        palavrasUnicas.adicionarPalavra("Emenda");
        palavrasUnicas.adicionarPalavra("Tapira");

        //exibindo as palavras do set
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());

        //removendo palavra do set
        palavrasUnicas.removerPalavra("Pitoresco");

        //verificando se a palavra está no set
        palavrasUnicas.verificarPalavra("Pitoresco");

        //exibindo as palavras do set novamente
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());


    }
}
