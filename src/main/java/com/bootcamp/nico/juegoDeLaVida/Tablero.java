package com.bootcamp.nico.juegoDeLaVida;

import static com.google.common.base.Preconditions.checkArgument;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Niko
 */
public class Tablero {
    public static final String SALTO_LINEA = String.format("%n");
    private static final String ESPACIO = " ";
    private List<List<Celula>> tablero;
    
    public Tablero() {
        checkArgument(Archivo.existeArchivo(), "Error: El archivo Mundo no Existe");
        try {
            this.tablero = cargarTablero();
        } catch (IOException ex) {
            throw new IllegalArgumentException("Error leyendo el Archivo");
        }
    }
    
    private static List<List<Celula>> cargarTablero() throws IOException{
        List<List<Celula>> tablero = new ArrayList<>();
        for (String file : Archivo.leerArchvo()) {
            tablero.add(leerHilera(file));
        }
        return tablero;
    }

    private static List<Celula> leerHilera(String file) {
        List<Celula> hilera = new ArrayList<>();
        for (char valor : file.toCharArray()) {
            hilera.add(new Celula.Builder().withCaracter(valor).withEstaViva(Celula.estaViva(valor)).build());
        }
        return hilera;
    }
    
    public List<List<Celula>> siguienteGeneracio(){
        return tablero;
    }

    @Override
    public String toString() {
        StringBuilder buider = new StringBuilder();
        for (List<Celula> list : tablero) {
            for (Celula celula : list) {
                buider.append(celula.getCaracter())
                      .append(ESPACIO);
            }
            buider.append(SALTO_LINEA);
        }
        return buider.toString();
    }
    
    
}
