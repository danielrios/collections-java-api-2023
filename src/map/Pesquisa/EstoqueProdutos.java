package map.Pesquisa;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    public Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque() {
        return produtoMap.values().stream().mapToDouble(p -> p.getQuantidade() * p.getPreco()).sum();
    }

    public Produto obterProdutoMaisCaro() {
        return produtoMap.values().stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null);

    }

    public Produto obterProdutoMaisBarato() {
        return produtoMap.values().stream()
                .min(Comparator.comparing(Produto::getPreco))
                .orElse(null);
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        return produtoMap.values().stream()
                .max(Comparator.comparing(p -> p.getPreco() * p.getQuantidade()))
                .orElse(null);
    }

}
