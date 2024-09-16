package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();

    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        carrinhoList.remove(nome);
    }

    public double calcularValorTotal(){
        double ValorTotal = 0.00;
        for (Item i : carrinhoList) {
           ValorTotal += i.preco *i.quantidade;
           }
        return ValorTotal;
    }

    public void exibirItens(){
        for (Item i : carrinhoList) {
            System.out.println(i.getNome() + " - " + i.preco + " x " + i.quantidade + " = " + (i.preco*i.quantidade));;
        }
            return;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("Os itens no carrinho somam: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Pão", 0.25, 5);
        carrinhoDeCompras.adicionarItem("Melancia", 5.00, 5);
        carrinhoDeCompras.adicionarItem("Sabão em pó", 10.00, 5);
        System.out.println("Os itens no carrinho somam: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();


    }

}
