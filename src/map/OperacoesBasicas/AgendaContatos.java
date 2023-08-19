package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    public Map<String, Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        contatoMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        return contatoMap.get(nome);
    }

}
