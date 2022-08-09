/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jeremias
 */
public class Evento extends Ingresso {

    private String nomeEvento;
    private String dataEvento;
    private double valorEvento;
    private int capacidadeMaxima;
    private int ingressoVendido;

    public Evento(String nomeEvento, String dataEvento, double valorEvento, int capacidadeMaxima) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.valorEvento = valorEvento;
        this.capacidadeMaxima = capacidadeMaxima;
    }


    public double getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(double valorEvento) {
        this.valorEvento = valorEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getIngressoVendido() {
        return "Ingressos vendido: " + ingressoVendido;
    }

    public void setIngressoVendido(int ingressoVendido) {
        this.ingressoVendido = ingressoVendido;
    }

    public void VenderIngresso(String EventoRelacionado, TipoIngresso TipoIngresso) {

        if (this.ingressoVendido < this.capacidadeMaxima) {

            setEventoRelacionado(EventoRelacionado);
            setTipoIngresso(TipoIngresso);
            this.ingressoVendido++;

        } else {
            System.out.println("Desculpe, evento lotado...");
        }
    }

    @Override
    public String toString() {
        return "Evento: " + getNomeEvento() + " Data: " + getDataEvento();
    }

    public ArrayList<Ingresso> getIngressoVendido(String eventoRelacionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
