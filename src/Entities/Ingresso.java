/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jeremias
 */
public class Ingresso extends Evento {

    private String nomeCliente;
    private int CPF;
    private String EventoRelacionado;
    private TipoIngresso TipoIngresso;

    public Ingresso(String nomeCliente, int CPF, String EventoRelacionado, TipoIngresso TipoIngresso) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.EventoRelacionado = EventoRelacionado;
        this.TipoIngresso = TipoIngresso;
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

    public double ValorIngresso(TipoIngresso tp) {

        if (null != tp) {
            switch (tp) {
                case PISTA -> {
                    double valor = getVa
                    return get;
                }
                case VIP -> {
                    return getValorUnicoEvento() * (30*100);
                }
                case CAMAROTE -> {
                    return getValorUnicoEvento() * (60*100);
                }
                default -> {
                }
            }
        }
        return 0;
    }
    
    public String Resumo(){
        
        String resumo = "Titular: " + getNomeCliente() + "CPF: " + getCPF() + "Dados do Evento: ..." ;
        
        return resumo;
    }


}
