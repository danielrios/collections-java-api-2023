package map.Ordenacao;

import java.util.*;
import java.util.stream.Collectors;

public class LivrariaOnline {
    // atributos
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    public void removerLivro(String titulo) {
        livros.entrySet().removeIf(entry -> entry.getValue().getTitulo().equals(titulo));
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return livros.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Livro::getPreco)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        return livros.entrySet().stream()
                .filter(entry -> entry.getValue().getAutor().equals(autor))
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    public Livro obterLivroMaisCaro() {
        return livros.values().stream()
                .max(Comparator.comparingDouble(Livro::getPreco))
                .orElse(null);
    }

    public Livro exibirLivroMaisBarato() {
        return livros.values().stream()
                .filter(livro -> livro.getPreco() >= 0)
                .min(Comparator.comparingDouble(Livro::getPreco))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "{" + livros +
                '}';
    }
}
