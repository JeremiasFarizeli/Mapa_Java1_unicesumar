/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapavendaingressos;

import Entities.Evento;
import Entities.Ingresso;
import Entities.TipoIngresso;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
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

        // Init do evento, informando nomeEvento, dataEvento, capacidadeMaxima.
        Evento evento = new Evento("Novo Som", "25/12/2022", 150.00, 2);

        Ingresso ingresso = new Ingresso(evento.getNomeEvento(), TipoIngresso.CAMAROTE, evento.getValorEvento());
        
        

        evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.CAMAROTE);
        evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.VIP);
        evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.PISTA);
        evento.VenderIngresso(evento.getNomeEvento(), TipoIngresso.PISTA);

        
        
        
       
        System.out.println(evento.toString());
        System.out.println(evento.ValorIngresso(TipoIngresso.PISTA));
        System.out.println(evento.getIngressoVendido());
        System.out.println(evento.Resumo());
        input.close();
    }

}
