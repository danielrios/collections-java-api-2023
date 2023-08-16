package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numberList;

    public SomaNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numberList.add(numero);
    }

    public int calcularSoma() {
        return numberList.stream().mapToInt(Integer::intValue).sum();
    }

    public int encontrarMaiorNumero(){
           return numberList.stream().max(Integer::compareTo).orElse(0);
    }

    public int encontrarMenorNumero(){
        return numberList.stream().min(Integer::compareTo).orElse(0);
    }

    public void exibirNumeros(){
        System.out.println(numberList);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numberList=" + numberList +
                '}';
    }
}
