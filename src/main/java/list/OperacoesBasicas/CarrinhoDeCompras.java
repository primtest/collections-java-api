package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia.");
        }
    }

    public double calcularValorTotal(){
        double ValorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuantidade();
                ValorTotal += valorItem;
            }
            return ValorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else {
            System.out.println("A lista está vazia.");
        }

    }

    public static void main(String[] args) {
        //criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Pão", 0.25, 5);
        carrinhoDeCompras.adicionarItem("Melancia", 5.00, 5);
        carrinhoDeCompras.adicionarItem("Sabão em pó", 10.00, 5);
        carrinhoDeCompras.adicionarItem("Sabão em pó", 10.00, 5);
        System.out.println("Os itens no carrinho somam: " + carrinhoDeCompras.calcularValorTotal());

        //Removendo itens no carrinho
        carrinhoDeCompras.removerItem("Sabão em pó");
        System.out.println("Os itens no carrinho somam: " + carrinhoDeCompras.calcularValorTotal());

        //Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        //Calculando e exibindo o valor total de compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());


    }

}
