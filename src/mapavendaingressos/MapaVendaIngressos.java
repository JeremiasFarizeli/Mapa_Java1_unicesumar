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
        Evento novoSom = new Evento("Novo Som ao vivo", "07/10/2022", 120.00, 500);

        
        //  CRIAÇÃO DE INGRESSOS
        Ingresso ingressoPista1 = new IngressoPista("Fulano de tal", 0000003265);
        Ingresso ingressoPista2 = new IngressoPista("Adalberto Simão Nader", 0000003265);
        Ingresso ingressoPista3 = new IngressoPista("Jucelino Quadrado", 326512365);
        //Ingresso ingressoPista4 = new IngressoPista("Fulano de tal", 12365987);
        Ingresso ingressoVip1 = new IngressoVip("Cicrano Silva Sauro", 45621);
        Ingresso ingressoVip2 = new IngressoVip("Cicrano Sauro", 1236598);
        Ingresso ingressoVip3 = new IngressoVip("Bolsonaro Presidente Reeleito", 12398);
        //Ingresso ingressoVip4 = new IngressoVip("Paulo Guedes", 1236598);
        Ingresso ingressoCamarote1 = new IngressoCamarote("Thomas Manfredine", 1236598);
        Ingresso ingressoCamarote2 = new IngressoCamarote("Bertano Silva Sauro Junior", 1236598);

        
        System.out.println("*********** VALORES DOS INGRESSOS ***********\n");        
        showKatedral.ImprimirValorIngresso(ingressoPista1.getTipoIngresso());
        showKatedral.ImprimirValorIngresso(ingressoVip1.getTipoIngresso());
        showKatedral.ImprimirValorIngresso(ingressoVip1.getTipoIngresso());
        System.out.println("\n\n");
        
       
        
        System.out.println("*********** VENDA DE INGRESSOS ***********\n");
        showKatedral.VenderIngresso(ingressoPista1, ingressoPista1.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoPista2, ingressoPista2.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoPista3, ingressoPista3.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoVip1, ingressoVip1.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoVip2, ingressoVip2.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoVip3, ingressoVip3.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoCamarote1, ingressoCamarote1.getTipoIngresso());
        showKatedral.VenderIngresso(ingressoCamarote2, ingressoCamarote2.getTipoIngresso());
        novoSom.VenderIngresso(ingressoPista1, ingressoPista1.getTipoIngresso());
        System.out.println("\n\n");

        
   
        
        
        System.out.println("*********** QUANTIDADE DE INGRESSOS VENDIDOS ***********\n"); 
        
        showKatedral.quantidadeIngressoVendido(showKatedral, ingressoPista1, ingressoVip1, ingressoCamarote1);
        //System.out.println("Quantidade de ingressos vendidos: " + showKatedral.getQtdIngressoVendido()); 
        System.out.println("\n\n");
        
        
        
        
        System.out.println("*********** RESUMO DO EVENTO E INGRESSO ***********\n"); 
        System.out.println(showKatedral.toString() + showKatedral.Resumo(ingressoPista1));

        
        
        
        input.close();
    }

}
