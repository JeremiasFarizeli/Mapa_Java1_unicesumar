/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author reggiani
 */
public class IngressoPista extends Ingresso {

    private final int tipoIngresso = 1;

    public IngressoPista(String nomeCliente, int CPF) {
        super(nomeCliente, CPF);
    }

    public IngressoPista() {
    }
    
    

    @Override
    public int getTipoIngresso() {
        return tipoIngresso;
    }

    @Override
    public String ValorIngresso(TipoIngresso tp) {

        return "Valor do ingresso PISTA: ";

    }

    @Override
    public String Resumo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
