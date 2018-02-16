package com.bootcamp.nico.figuras;

/**
 *
 * @author Niko
 */
public class Figuras {
    public static final String SALTO_LINEA = String.format("%n");
    private static final String CARACTER = "*";
    private static final String ESPACIO = " ";
    
    public static String cuadrado(){
        return cuadrado(3);
    }
    
    public static String cuadrado(final int tamaño){
        return figura(tamaño, 0, tamaño, 0, 0).toString();
    }
    
    public static String piramide(){
        return piramide(3);
    }
    
    public static String piramide(final int tamaño){
        return figura(tamaño, tamaño-1, 1, 2, -1).toString();
    }
    
    public static String rombo(){
        return rombo(3);
    }
    
    public static String rombo(final int tamaño){
        return figura(tamaño, tamaño-1, 1, 2, -1)
                .append(figura(tamaño-1, 1, tamaño, -2, 1))
                .toString();
    }

    public static StringBuilder figura(final int tamaño, int espacios, int caracteres, final int modificadorCaracteres, final int modificadorEspacio){
        StringBuilder buider = new StringBuilder();
        for (int hilera = 1; hilera <= tamaño; ++hilera) {
            buider.append(consruirColumna(espacios, ESPACIO))
                  .append(consruirColumna(caracteres, CARACTER))
                  .append(SALTO_LINEA);
            espacios += modificadorEspacio;
            caracteres += modificadorCaracteres;
        }
        return buider;
    }
    
    private static String consruirColumna(final int tamaño, final String caracter) {
        StringBuilder buider = new StringBuilder();
        for (int columna = 1; columna <= tamaño; ++columna) {
            buider.append(caracter);
        }
        return buider.toString();
    }
}
