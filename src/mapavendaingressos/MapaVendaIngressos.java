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
        Evento showKatedral = new Evento("Show Katedral", "23/12/2022", 100, 3);

        //IngressoPista ingressoPista = new IngressoPista("Jeremias", 123456987);
        //IngressoVip ingressoVip = new IngressoVip();
        //IngressoCamarote ingressoCamarote = new IngressoCamarote();
        
        
        //  CRIAÇÃO DE INGRESSOS
        Ingresso Ingresso = new IngressoVip("Daveco", 1236598);
        Ingresso Ingresso2 = new IngressoPista("Daveco2", 1236598);
        Ingresso Ingresso3 = new IngressoCamarote("Daveco2", 1236598);

        
        //  VENDA DE INGRESSOS
        showKatedral.VenderIngresso(Ingresso, Ingresso.getTipoIngresso(), showKatedral.getCapacidadeMaxima());
        showKatedral.VenderIngresso(Ingresso2, Ingresso2.getTipoIngresso(), showKatedral.getCapacidadeMaxima());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso(), showKatedral.getCapacidadeMaxima());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso(), showKatedral.getCapacidadeMaxima());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso(), showKatedral.getCapacidadeMaxima());
        showKatedral.VenderIngresso(Ingresso3, Ingresso3.getTipoIngresso(), showKatedral.getCapacidadeMaxima());
        System.out.println("");
     
       

        
        
        
        
        //Ingresso ingresso = new Ingresso(evento.getNomeEvento(), TipoIngresso.CAMAROTE, evento.getValorEvento());
        //evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.CAMAROTE);
        //evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.VIP);
        //evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.PISTA);
        //evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.PISTA);
        //System.out.println(evento.toString());
        //System.out.println(evento.ValorIngresso(TipoIngresso.PISTA));
        //System.out.println(evento.getIngressoVendido());
        //System.out.println(evento.Resumo());
        input.close();
    }

}
