package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        carrinho.removeIf(i -> i.nome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        return carrinho.stream().mapToDouble(e -> e.preco() * e.quantidade()).sum();
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }
}
