/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author FARMACIA
 */
public class Tarefa {
//atributos
    private String titulo;
    private boolean concluida;
//construtor
    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }
//getters e setters
    public String getTitulo() {
        return titulo;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
//metodo
    @Override
    public String toString() {
        String status = concluida ? "[X]" : "[ ]";
        return status + " " + titulo;
    }
}


