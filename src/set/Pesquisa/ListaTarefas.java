package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean statusTarefa) {
        tarefaSet.add(new Tarefa(descricao,statusTarefa));
    }

    public void removerTarefa(String descricao) {
        tarefaSet.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return tarefaSet.stream().filter(Tarefa::isStatus).collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return tarefaSet.stream().filter(t -> !t.isStatus()).collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(false);
                break;
            }
        }
    }


    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "tarefaSet=" + tarefaSet +
                '}';
    }
}
