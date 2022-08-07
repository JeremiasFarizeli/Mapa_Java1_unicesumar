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
public class Evento {

    private String nomeEvento;
    private Date dataEvento;
    private double valorUnicoEvento;
    private int capacidadeMaxima;
    ArrayList<Ingresso> ingressoVendido = new ArrayList();

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getValorUnicoEvento() {
        return valorUnicoEvento;
    }

    public void setValorUnicoEvento(double valorUnicoEvento) {
        this.valorUnicoEvento = valorUnicoEvento;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public ArrayList<Ingresso> getIngressoVendido() {
        return ingressoVendido;
    }

    public void setIngressoVendido(ArrayList<Ingresso> ingressoVendido) {
        this.ingressoVendido = ingressoVendido;
    }
    
    @Override
    public String toString(){
        return "Evento: " + getNomeEvento() + "Data: " + getDataEvento();
    }

    
    
    

}
