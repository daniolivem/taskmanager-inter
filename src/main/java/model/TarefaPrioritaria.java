/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author FARMACIA
 */
public class TarefaPrioritaria extends Tarefa {
//atributo extra pra n ficar igual tarefa
    private String prioridade;
//construtor e super
    public TarefaPrioritaria(String titulo, String prioridade) {
        super(titulo);
        this.prioridade = prioridade;
    }
//metodo
    @Override
    public String toString() {
        return super.toString() + " (Prioridade: " + prioridade + ")";
    }
}
