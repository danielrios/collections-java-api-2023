package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public final List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        return catalogo.stream().filter(livro -> livro.autor().equalsIgnoreCase(autor)).toList();

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        return catalogo.stream().filter(livro -> livro.anoPublicacao() >= anoInicial && livro.anoPublicacao() <= anoFinal).toList();
    }

    public Livro pesquisarPorTitulo(String titulo) {
        return catalogo.stream().filter(livro -> livro.titulo().equalsIgnoreCase(titulo)).findAny().orElse(null);
    }
}
