import map.OperacoesBasicas.AgendaContatos;
import map.OperacoesBasicas.Dicionario;
import map.Pesquisa.ContagemPalavras;
import map.Pesquisa.EstoqueProdutos;

import static java.lang.System.out;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Metodo para testar os exercicios */
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 8);
        contagemPalavras.adicionarPalavra("Palavra 3", 1);
        contagemPalavras.adicionarPalavra("Palavra 4", 6);
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}