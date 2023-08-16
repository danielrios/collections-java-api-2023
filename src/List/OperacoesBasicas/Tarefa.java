package List.OperacoesBasicas;

public record Tarefa(String descricao) {

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
