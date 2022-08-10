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

        //  Init do evento, informando nomeEvento, dataEvento, capacidadeMaxima.
        Evento showKatedral = new Evento("Show Katedral", "23/12/2022", 100, 50);

 
        //  CRIAÇÃO DE INGRESSOS
        Ingresso Ingresso = new IngressoVip("Daveco", 1236598);
        Ingresso Ingresso2 = new IngressoPista("Daveco2", 1236598);
        Ingresso Ingresso3 = new IngressoCamarote("Daveco2", 1236598);

        
        //  VENDA DE INGRESSOS
        showKatedral.VenderIngresso(Ingresso, Ingresso.getTipoIngresso());
        showKatedral.VenderIngresso(Ingresso2, Ingresso2.getTipoIngresso());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso());
        System.out.println("");
        
        //  Impreimir valor de Ingresso
        showKatedral.ImprimirValorIngresso(Ingresso.getTipoIngresso());
        
        
        //  Mostrar Quantidade de ingressos vendidos
        System.out.println("Quantidade de ingressos vendidos: " + showKatedral.getQtdIngressoVendido());
     
       

        
        
        
        

        input.close();
    }

}
