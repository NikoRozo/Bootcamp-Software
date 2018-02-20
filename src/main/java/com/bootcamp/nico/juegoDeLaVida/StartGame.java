package com.bootcamp.nico.juegoDeLaVida;

/**
 *
 * @author Niko
 */
public class StartGame {
    private final int noGeneraciones;

    public StartGame(int noGeneraciones) {
        this.noGeneraciones = noGeneraciones;
    }
    
    public Tablero startGame(){
        Tablero tablero = new Tablero();
        System.out.println("Generación Inicial");
        System.out.println(tablero.toString());
        for (int generacion = 1; generacion <= noGeneraciones; generacion++) {
            tablero = tablero.siguienteGeneracion();
            System.out.println("Generación " + generacion);
            System.out.println(tablero.toString());
        }
        return tablero;
    }
}
