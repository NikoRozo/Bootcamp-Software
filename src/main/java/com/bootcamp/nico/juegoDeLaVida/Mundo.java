package com.bootcamp.nico.juegoDeLaVida;

import java.util.List;

/**
 *
 * @author Niko
 */
public final class Mundo {

    public Mundo() {
        throw new IllegalAccessError("No puede ser Intnciada");
    }
    
    public static Celula sobrevive(Celula[][] vecinos){
        return new Celula.Builder().build();
    }
    
    public static Celula muere(Celula[][] vecinos){
        return new Celula.Builder().build();
    }
    
    public static Celula revive(Celula[][] vecinos){
        return new Celula.Builder().build();
    }
    
    public static Celula[][] obtenerVecinos(final List<List<Object>> mundo, final int ejex, final int ejeY) {
        Celula[][] vecinos = new Celula[3][3];
        return vecinos;
    }

}
