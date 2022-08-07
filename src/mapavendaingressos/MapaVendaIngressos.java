/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapavendaingressos;

import Entities.Evento;
import java.time.Instant;
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
        
        Evento evento = new Evento();
        
        System.out.println("Nome do evento:");
      
        
        
        System.out.println(evento.toString());
     
        
        
        
         input.close();
    }
    
}
