package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        Collections.sort(pessoas);
        return pessoas;
    }

    public List<Pessoa> ordenarPorAltura(){
        pessoas.sort(new ComparatorPorAltura());
        return pessoas;
    }
    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "pessoas=" + pessoas +
                '}';
    }
}
