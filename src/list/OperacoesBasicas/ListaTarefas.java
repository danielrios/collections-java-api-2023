package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }


    public void removerTarefa(String descricao){
        tarefaList.removeIf(t -> t.descricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "tarefaList=" + tarefaList +
                '}';
    }
}
