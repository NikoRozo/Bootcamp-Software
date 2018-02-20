package com.bootcamp.nico.app;

import com.bootcamp.nico.figuras.Figuras;
import com.bootcamp.nico.juegoDeLaVida.Celula;
import com.bootcamp.nico.juegoDeLaVida.Mundo;
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
        Tablero tab = new Tablero();
        System.out.println(tab.toString());
        
        for (Celula[] obtenerVecino : Mundo.obtenerVecinos(tab.siguienteGeneracio(), 0, 0)) {
            for (Celula celula : obtenerVecino) {
                System.out.print(celula.getCaracter() + " ");
            }
            System.out.println("");
        }

        // Proyecto 1 Figuras
        //System.out.println(Figuras.cuadrado());
        //System.out.println(Figuras.piramide());
        //System.out.println(Figuras.rombo());
    }
    
}
