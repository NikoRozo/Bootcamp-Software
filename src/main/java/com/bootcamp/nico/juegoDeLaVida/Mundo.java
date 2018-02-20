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

    public static Celula sobrevive(final Celula[][] vecinos) {
        int noVecinos = vecinosVivos(vecinos);
        boolean estaviva = vecinos[1][1].isEstaViva() && (noVecinos >= 2 && noVecinos <= 3);
        return new Celula.Builder().withEstaViva(estaviva).build();
    }

    public static Celula muere(final Celula[][] vecinos) {
        int noVecinos = vecinosVivos(vecinos);
        boolean estaviva = (vecinos[1][1].isEstaViva() && (noVecinos < 2 && noVecinos > 3));
        return new Celula.Builder().withEstaViva(estaviva).build();
    }

    public static Celula revive(final Celula[][] vecinos) {
        int noVecinos = vecinosVivos(vecinos);
        boolean estaviva = !vecinos[1][1].isEstaViva() && (noVecinos == 3);
        return new Celula.Builder().withEstaViva(estaviva).build();
    }

    public static boolean isSobrevive(final Celula[][] vecinos) {
        int noVecinos = vecinosVivos(vecinos);
        boolean estaviva = vecinos[1][1].isEstaViva() && (noVecinos >= 2 && noVecinos <= 3);
        return estaviva;
    }

    public static boolean isMuere(final Celula[][] vecinos) {
        int noVecinos = vecinosVivos(vecinos);
        boolean estaviva = (vecinos[1][1].isEstaViva() && (noVecinos < 2 && noVecinos > 3));
        return estaviva;
    }

    public static boolean isRevive(final Celula[][] vecinos) {
        int noVecinos = vecinosVivos(vecinos);
        boolean estaviva = !vecinos[1][1].isEstaViva() && (noVecinos == 3);
        return estaviva;
    }

    private static int vecinosVivos(final Celula[][] vecinos) {
        int contador = 0;
        for (int hilera = 0; hilera < vecinos.length; hilera++) {
            for (int columna = 0; columna < vecinos[hilera].length; columna++) {
                if (!celulaEvaluada(hilera, columna)) {
                    contador += (vecinos[hilera][columna].isEstaViva()) ? 1 : 0;
                }
            }
        }
        return contador;
    }

    private static boolean celulaEvaluada(int hilera, int columna) {
        return hilera == 1 && columna == 1;
    }

    public static Celula[][] obtenerVecinos(final List<List<Celula>> mundo, final int ejeX, final int ejeY) {
        Celula[][] vecinos = new Celula[3][3];
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] posicionX = {0, 0, 0, 1, 1, 2, 2, 2};
        int[] posicionY = {0, 1, 2, 0, 2, 0, 1, 2};
        
        for (int i = 0; i < 8; ++i) {
            int nx = ejeX + dx[i];
            int ny = ejeY + dy[i];
            if (ny >= 0 && nx >= 0) {
                vecinos[posicionX[i]][posicionY[i]] = mundo.get(nx).get(ny);
            } else {
                vecinos[posicionX[i]][posicionY[i]] =  new Celula.Builder().withEstaViva(false).build();
            }
        }
        
        vecinos[1][1] = mundo.get(ejeX).get(ejeY);
        
        return vecinos;
    }

}
