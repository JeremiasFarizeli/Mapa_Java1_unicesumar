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
    //private Evento eventoRelacionado = new Evento();

    public Ingresso(String nomeCliente, int CPF) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
    }

    public Ingresso() {
    }

    public abstract String Resumo();

    public abstract int getTipoIngresso();

    /*
    public String ValorIngresso(TipoIngresso tp) {

        if (null != tp) {
            switch (tp) {
                case PISTA -> {
                    return "Valor do ingresso PISTA: " + getValorUnicoEvento();
                }
                case VIP -> {
                    return "Valor do ingresso VIP: " + (getValorUnicoEvento() * 1.3);
                }
                case CAMAROTE -> {
                    return "Valor do ingresso CAMAROTE: " + (getValorUnicoEvento() * 1.6);
                }
                default -> {
                }
            }
        }
        return "Opção inválida";
    }

    
    public String Resumo() {

        String resumo = "Titular: " + getNomeCliente() + "CPF: " + getCPF() + "Dados do Evento: " + getEventoRelacionado();

        return resumo;
    }
    
     */

}
