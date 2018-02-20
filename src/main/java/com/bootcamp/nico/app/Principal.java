package com.bootcamp.nico.app;

import com.bootcamp.nico.figuras.Figuras;
import com.bootcamp.nico.juegoDeLaVida.StartGame;
import com.bootcamp.nico.juegoDeLaVida.Tablero;

/**
 *
 * @author Niko
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartGame game = new StartGame(3);
        game.startGame();
//        Tablero tab = new Tablero();
//        System.out.println(tab.toString());
//        System.out.println("-------------------------------------------------------------------------------");
//        System.out.println(tab.siguienteGeneracion().toString());
//        System.out.println("-------------------------------------------------------------------------------");
//        System.out.println(tab.siguienteGeneracion().siguienteGeneracion().toString());
//        
//        for (Celula[] obtenerVecino : Mundo.obtenerVecinos(tab.siguienteGeneracion(), 0, 0)) {
//            for (Celula celula : obtenerVecino) {
//                System.out.print(celula.getCaracter() + " ");
//            }
//            System.out.println("");
//        }

        // Proyecto 1 Figuras
        //System.out.println(Figuras.cuadrado());
        //System.out.println(Figuras.piramide());
        //System.out.println(Figuras.rombo());
    }
    
}
