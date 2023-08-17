package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> set = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().contains(nome)) {
                set.add(c);
            }
        }
        return set;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatoSet=" + contatoSet +
                '}';
    }
}
