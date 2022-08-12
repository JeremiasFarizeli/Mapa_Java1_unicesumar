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
    private List<Ingresso> ingressoVendidoPista = new ArrayList<>();
    private List<Ingresso> ingressoVendidoVip = new ArrayList<>();
    private List<Ingresso> ingressoVendidoCamarote = new ArrayList<>();

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

    public List<Ingresso> getIngressoVendidoVip() {
        return ingressoVendidoVip;
    }

    public void setIngressoVendidoVip(List<Ingresso> ingressoVendidoVip) {
        this.ingressoVendidoVip = ingressoVendidoVip;
    }

    public List<Ingresso> getIngressoVendidoPista() {
        return ingressoVendidoPista;
    }

    public void setIngressoVendidoPista(List<Ingresso> ingressoVendidoPista) {
        this.ingressoVendidoPista = ingressoVendidoPista;
    }

    public List<Ingresso> getIngressoVendidoCamarote() {
        return ingressoVendidoCamarote;
    }

    public void setIngressoVendidoCamarote(List<Ingresso> ingressoVendidoCamarote) {
        this.ingressoVendidoCamarote = ingressoVendidoCamarote;
    }

    //  METODOS
    public String ImprimirValorIngresso(int getTipoIngresso) {
        switch (getTipoIngresso) {
            case 1 -> { // Pista 
                System.out.println("Valor do ingresso PISTA: " + String.format("%.2f", this.valorUnico));
                break;
            }
            case 2 -> { // VIP
                System.out.println("Valor do ingresso VIP: " + String.format("%.2f", this.valorUnico * 1.3));
                break;
            }
            case 3 -> { // Camarote
                System.out.println("Valor do ingresso CAMAROTE: " + String.format("%.2f", this.valorUnico * 1.6));
                break;
            }
            default -> {
                return "";
            }
        }
        return null;
    }

    public String VenderIngresso(Ingresso ingresso, int getTipoIngresso) {

        if (getQtdIngressoVendido() < getCapacidadeMaxima()) {

            switch (getTipoIngresso) {
                case 1 -> { // Pista 
                    this.ingressoVendidoPista.add(ingresso);
                    System.out.println("Vendido ingresso PISTA: " + String.format("%.2f", this.valorUnico) + " | Evento: " + this.nomeEvento);
                    break;
                }
                case 2 -> { // VIP
                    this.ingressoVendidoVip.add(ingresso);
                    System.out.println("Vendido ingresso VIP: " + String.format("%.2f", this.valorUnico * 1.3) + " | Evento: " + this.nomeEvento);
                    break;
                }
                case 3 -> { // Camarote
                    this.ingressoVendidoCamarote.add(ingresso);
                    System.out.println("Vendido ingresso CAMAROTE: " + String.format("%.2f", this.valorUnico * 1.6) + " | Evento: " + this.nomeEvento);
                    break;
                }
            }

            setQtdIngressoVendido(getQtdIngressoVendido() + 1);
        } else {
            System.out.println("Evento " + this.nomeEvento + " lotado ...");
        }

        return "";
    }

    public void quantidadeIngressoVendido(Evento evento, Ingresso Pista, Ingresso Vip, Ingresso Camarote) {

        System.out.println("Ingressos tipo PISTA vendidos do Evento " + this.nomeEvento + ": -> " + ingressoVendidoPista.size());
        for (int i = 0; i < ingressoVendidoPista.size(); i++) {
            System.out.println(evento.toString() + evento.Resumo(Pista));
        }
        
        System.out.println("Ingressos tipo VIP vendidos do Evento " + this.nomeEvento + ": -> " + ingressoVendidoVip.size());
        for (int i = 0; i < ingressoVendidoVip.size(); i++) {
            System.out.println(evento.toString() + evento.Resumo(Vip));
        }

        System.out.println("Ingressos tipo CAMAROTE vendidos do Evento " + this.nomeEvento + ": -> " + ingressoVendidoCamarote.size());
        for (int i = 0; i < ingressoVendidoCamarote.size(); i++) {
            System.out.println(evento.toString() + evento.Resumo(Camarote));
        }

    }

    @Override
    public String toString() {
        return "\n##################################\nDados do Evento:\n" + getNomeEvento() + ", Data: " + getDataEvento() + "\n\n";
    }

    @Override
    public String Resumo(Ingresso ingresso) {
        String resumo = "Dados do imgresso: \n" + "Nome Cliente: " + ingresso.getNomeCliente() + "\nCPF: " + ingresso.getCPF() + "\n##################################\n\n";
        return resumo;
    }

    public ArrayList<Ingresso> getIngressoVendido(String eventoRelacionado) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getTipoIngresso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
