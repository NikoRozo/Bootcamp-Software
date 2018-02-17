package com.bootcamp.nico.fracciones;

/**
 *
 * @author Niko
 */
public final class Operaciones {
    
    public Operaciones(){
        throw new IllegalAccessError("Clase Utilitaria, no se puede instanciar");
    }
    
    public static int mcd(final int a, final int b){
        return  b == 0 ? a : mcd(b, a % b);
    }
    
    public static int mcm(final int a, final int b){
        return (a * b) / mcd(a, b);
    }
}
