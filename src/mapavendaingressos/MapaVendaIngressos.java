/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapavendaingressos;

import Entities.Evento;
import Entities.Ingresso;
import Entities.IngressoCamarote;
import Entities.IngressoPista;
import Entities.IngressoVip;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jeremias
 */
public class MapaVendaIngressos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //  Init do evento, informando nomeEvento, dataEvento, ValorIngresso, capacidadeMaxima.
        Evento showKatedral = new Evento("Show Katedral", "23/12/2022", 100, 50);
        Evento novoSom = new Evento("Novo Som ao vivo", "07/10/2022", 120.00 , 500);

        
        //  CRIAÇÃO DE INGRESSOS
        Ingresso Ingresso = new IngressoPista("Fulano de tal", 0000003265);
        Ingresso Ingresso2 = new IngressoVip("Cicrano Silva Sauro", 1236598);
        Ingresso Ingresso3 = new IngressoCamarote("Bertano Silva Sauro Junior", 1236598);

       
        
        System.out.println("*********** VENDA DE INGRESSOS ***********\n");
        showKatedral.VenderIngresso(Ingresso, Ingresso.getTipoIngresso());
        showKatedral.VenderIngresso(Ingresso2, Ingresso2.getTipoIngresso());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso());
        novoSom.VenderIngresso(Ingresso, Ingresso.getTipoIngresso());
        System.out.println("\n\n");

        
        
        System.out.println("*********** VALORES DOS INGRESSOS ***********\n");        
        //  Imprimir valor de Ingresso
        showKatedral.ImprimirValorIngresso(Ingresso.getTipoIngresso());
        showKatedral.ImprimirValorIngresso(Ingresso2.getTipoIngresso());
        showKatedral.ImprimirValorIngresso(Ingresso3.getTipoIngresso());
        System.out.println("\n\n");
        
        
        
        
        System.out.println("*********** QUANTIDADE DE INGRESSOS VENDIDOS ***********\n"); 
        //  Mostrar Quantidade de ingressos vendidos
        System.out.println("Quantidade de ingressos vendidos: " + showKatedral.getQtdIngressoVendido()); 
        System.out.println("\n\n");
        
        
        
        
        System.out.println("*********** RESUMO DO EVENTO E INGRESSO ***********\n"); 
        // Métodos para Mostrar Resumo e detalhes do evento e do ingresso.
        System.out.println(showKatedral.toString() + showKatedral.Resumo(Ingresso));

        
        
        
        input.close();
    }

}
