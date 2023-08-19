package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        TreeMap<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        eventosTreeMap.entrySet().stream()
                .filter(entry -> entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
                .findFirst()
                .ifPresent(entry -> {
                    LocalDate proximaData = entry.getKey();
                    Evento proximoEvento = entry.getValue();
                    System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                });
    }
}