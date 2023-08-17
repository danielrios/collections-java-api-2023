package list.Ordenacao;

import java.util.Comparator;

public record Pessoa(String nome, int idade, double altura) implements Comparable<Pessoa> {

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.idade());
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
        public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.altura(), p2.altura());
    }
}


