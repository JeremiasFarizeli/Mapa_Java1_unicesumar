/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 *
 * @author jeremias
 */
public abstract class Ingresso {

    private String nomeCliente;
    private int CPF;
    private Evento eventoRelacionado;

    public Ingresso(String nomeCliente, int CPF) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.eventoRelacionado = new Evento();
        
    }

    public Ingresso() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Evento getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(Evento eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }
    
    
    
    //public abstract String toString();

    public abstract String Resumo(Ingresso ingresso);

    public abstract int getTipoIngresso();

}
