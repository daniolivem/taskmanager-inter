package controller;

import java.util.ArrayList;
import java.util.List;
import model.Tarefa;

/**
 *
 * @author danie
 * @param <T>
 */
public class TaskManager <T extends Tarefa> {

    private final List<T> tarefas = new ArrayList<>();

    public void criarTarefa(T novaTarefa) {
        tarefas.add(novaTarefa);

    }
    public List<T> getTarefas() {
        return tarefas;
    }

    public void listarTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            for (T t : tarefas) {
                System.out.println(t);
            }

        }
    }

    public void excluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);

            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Indice inválido.");
        }
    }

    public void concluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            T t = tarefas.get(indice);
            t.setConcluida(true);
            System.out.println("Tarefa '" + t.getTitulo() + "' marcada como concluída! ✅");
        } else {
            System.out.println("Erro: Índice inválido!");
        }
    }

}




