/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author reggiani
 */
public class IngressoVip extends Ingresso{
    
    private final int tipoIngresso = 2;

    public IngressoVip(String nomeCliente, int CPF) {
        super(nomeCliente, CPF);
    }

    public IngressoVip() {
    }
     

    @Override
    public int getTipoIngresso() {
        return tipoIngresso;
    }

    @Override
    public String ValorIngresso(TipoIngresso tp) {
        
        return "Valor do ingresso VIP: ";
        
    }

    @Override
    public String Resumo() {
        return "";
    }
    
}
