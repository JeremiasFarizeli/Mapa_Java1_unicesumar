/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jeremias
 */
public class Ingresso extends Pessoa {
      
    private String EventoRelacionado;
    private TipoIngresso TipoIngresso;
    //private double valorUnicoEvento;

    public Ingresso(String EventoRelacionado, TipoIngresso TipoIngresso, double valorUnicoEvento) {
        this.EventoRelacionado = EventoRelacionado;
        this.TipoIngresso = TipoIngresso;
        this.valorUnicoEvento = valorUnicoEvento;
    }

    public Ingresso() {
    }

    public String getEventoRelacionado() {
        return EventoRelacionado;
    }

    public void setEventoRelacionado(String EventoRelacionado) {
        this.EventoRelacionado = EventoRelacionado;
    }

    public TipoIngresso getTipoIngresso() {
        return TipoIngresso;
    }

    public void setTipoIngresso(TipoIngresso TipoIngresso) {
        this.TipoIngresso = TipoIngresso;
    }

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

}
