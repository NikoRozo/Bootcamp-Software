package com.bootcamp.nico.juegoDeLaVida;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;


/**
 *
 * @author Niko
 */
public class MundoTest {
    
    @Test
    public void Validar2MenosVecinosVivos_MuerePorBajaPoblacion(){
        Celula[][] subMundo = new Celula[3][3];
        subMundo[0][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][2] = new Celula.Builder().withEstaViva(false).build();
        subMundo[1][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[1][1] = new Celula.Builder().withEstaViva(true).build(); // Celula Evaluada
        subMundo[1][2] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][2] = new Celula.Builder().withEstaViva(false).build();
        assertThat(new Celula.Builder().withEstaViva(false).build(), equalTo(new Celula.Builder().withEstaViva(Mundo.isMuere(subMundo)).build()));
    }
    
    @Test
    public void Validar2o3VecinosVivos_sobrevivePoblacion(){
        Celula[][] subMundo = new Celula[3][3];
        subMundo[0][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][2] = new Celula.Builder().withEstaViva(true).build();
        subMundo[1][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[1][1] = new Celula.Builder().withEstaViva(true).build(); // Celula Evaluada
        subMundo[1][2] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][0] = new Celula.Builder().withEstaViva(true).build();
        subMundo[2][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][2] = new Celula.Builder().withEstaViva(true).build();
        assertThat(new Celula.Builder().withEstaViva(true).build(), equalTo(new Celula.Builder().withEstaViva(Mundo.isSobrevive(subMundo)).build()));
    }
    
    @Test
    public void ValidarMas3VecinosVivos_MuerePorSorepoblacion(){
        Celula[][] subMundo = new Celula[3][3];
        subMundo[0][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][2] = new Celula.Builder().withEstaViva(true).build();
        subMundo[1][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[1][1] = new Celula.Builder().withEstaViva(true).build(); // Celula Evaluada
        subMundo[1][2] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][0] = new Celula.Builder().withEstaViva(true).build();
        subMundo[2][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][2] = new Celula.Builder().withEstaViva(true).build();
        assertThat(new Celula.Builder().withEstaViva(false).build(), equalTo(new Celula.Builder().withEstaViva(Mundo.isMuere(subMundo)).build()));
    }
    
    @Test
    public void ValidarExactamente3VecinosVivos_RevivePorReproduccion(){
        Celula[][] subMundo = new Celula[3][3];
        subMundo[0][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[0][2] = new Celula.Builder().withEstaViva(true).build();
        subMundo[1][0] = new Celula.Builder().withEstaViva(false).build();
        subMundo[1][1] = new Celula.Builder().withEstaViva(false).build(); // Celula Evaluada
        subMundo[1][2] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][0] = new Celula.Builder().withEstaViva(true).build();
        subMundo[2][1] = new Celula.Builder().withEstaViva(false).build();
        subMundo[2][2] = new Celula.Builder().withEstaViva(true).build();
        assertThat(new Celula.Builder().withEstaViva(true).build(), equalTo(new Celula.Builder().withEstaViva(Mundo.isRevive(subMundo)).build()));
    }
    
}
