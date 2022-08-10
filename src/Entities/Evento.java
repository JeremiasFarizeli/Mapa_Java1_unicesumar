/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeremias
 */
public class Evento extends Ingresso {

    private String nomeEvento;
    private String dataEvento;
    private double valorUnico;
    private int capacidadeMaxima;
    private int qtdIngressoVendido = 0;
    private List<IngressoPista> ingressoVendidoPista = new ArrayList<IngressoPista>();
    private List<IngressoVip> ingressoVendidoVip = new ArrayList<IngressoVip>();
    private List<IngressoCamarote> ingressoVendidoCamarote = new ArrayList<IngressoCamarote>();

    public Evento() {
    }

    public Evento(String nomeEvento, String dataEvento, double valorUnico, int capacidadeMaxima) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
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

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getQtdIngressoVendido() {
        return qtdIngressoVendido;
    }

    public void setQtdIngressoVendido(int qtdIngressoVendido) {
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    public List<IngressoVip> getIngressoVendidoVip() {
        return ingressoVendidoVip;
    }

    public void setIngressoVendidoVip(List<IngressoVip> ingressoVendidoVip) {
        this.ingressoVendidoVip = ingressoVendidoVip;
    }

    public List<IngressoPista> getIngressoVendidoPista() {
        return ingressoVendidoPista;
    }

    public void setIngressoVendidoPista(List<IngressoPista> ingressoVendidoPista) {
        this.ingressoVendidoPista = ingressoVendidoPista;
    }

    public List<IngressoCamarote> getIngressoVendidoCamarote() {
        return ingressoVendidoCamarote;
    }

    public void setIngressoVendidoCamarote(List<IngressoCamarote> ingressoVendidoCamarote) {
        this.ingressoVendidoCamarote = ingressoVendidoCamarote;
    }

    //  METODOS
    public String VenderIngresso(Ingresso ingresso, int getTipoIngresso, int capacidadeMaxima) {

        if (getQtdIngressoVendido() < getCapacidadeMaxima()) {

            switch (getTipoIngresso) {
                case 1 -> { // Pista 
                    //setIngressoVendidoPista(ingressoVendidoPista);
                    this.ingressoVendidoPista.add((IngressoPista) ingresso);
                    System.out.println("Valor do ingresso PISTA: " + getValorUnico());
                }
                case 2 -> { // VIP
                    //setIngressoVendidoVip(ingressoVendidoVip);
                    this.ingressoVendidoVip.add((IngressoVip) ingresso);
                    System.out.println("Valor do ingresso VIP: " + getValorUnico() * 1.3);
                }
                case 3 -> { // Camarote
                    this.ingressoVendidoCamarote.add((IngressoCamarote) ingresso);
                    setIngressoVendidoCamarote(ingressoVendidoCamarote);
                    System.out.println("Valor do ingresso CAMAROTE: " + getValorUnico() * 1.6);
                }
            }

            setQtdIngressoVendido(getQtdIngressoVendido() + 1);
        } else {
            System.out.println("Evento lotado ...");
        }

        return "";
    }

    @Override
    public String toString() {
        return "Evento: " + getNomeEvento() + " Data: " + getDataEvento();
    }

    public ArrayList<Ingresso> getIngressoVendido(String eventoRelacionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ValorIngresso(TipoIngresso tp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Resumo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getTipoIngresso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
