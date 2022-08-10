/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author reggiani
 */
public class IngressoCamarote extends Ingresso{
    
    private final int tipoIngresso = 3;

    public IngressoCamarote(String nomeCliente, int CPF) {
        super(nomeCliente, CPF);
    }

    public IngressoCamarote() {
    }
    

    @Override
    public int getTipoIngresso() {
        return tipoIngresso;
    }
    
    @Override
    public String ValorIngresso(TipoIngresso tp) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Resumo() {
        
        return "Valor do ingresso CAMAROTE: ";
       
    }
    
}
