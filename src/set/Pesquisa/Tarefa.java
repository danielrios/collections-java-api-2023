package set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private final String descricao;
    private boolean status;

    public Tarefa(String descricao, boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + descricao + ',' + status + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa1)) return false;
        return Objects.equals(getDescricao(), tarefa1.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }
}
