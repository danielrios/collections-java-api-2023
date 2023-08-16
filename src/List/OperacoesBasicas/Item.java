package List.OperacoesBasicas;

import java.math.BigDecimal;

public record Item(String nome, double preco, int quantidade) {
    public double getValorTotal() {
        return preco * quantidade;
    }
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
