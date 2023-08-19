package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    public Map<String, Integer> palavrasMap;

    public ContagemPalavras(){
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public Integer exibirContagemPalavras() {
        return palavrasMap.values().stream()
                .mapToInt(Integer::intValue).sum();
    }

    public String encontrarPalavraMaisFrequente() {
        return palavrasMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

    }
}
