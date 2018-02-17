package com.bootcamp.nico.fraciones;

import com.bootcamp.nico.fracciones.Fraccion;
import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *
 * @author Niko
 */
public class FraccionTest {
    
    @Test
    public void simplificarFraccion(){
        assertThat(new Fraccion(24, 32).simplificar(), equalTo(new Fraccion(3, 4)));
    }
    
    @Test
    public void sumarFracciones(){
        assertThat(new Fraccion(3, 4).mas(new Fraccion(2, 4)), equalTo(new Fraccion(5, 4)));
    }
    
    @Test
    public void restarFracciones(){
        assertThat(new Fraccion(7, 9).menos(new Fraccion(2, 9)), equalTo(new Fraccion(5, 9)));
    }
    
    @Test
    public void MultiplicarFracciones(){
        assertThat(new Fraccion(1, 1).por(new Fraccion(1, 2)), equalTo(new Fraccion(1, 2)));
    }
    
    @Test
    public void dividirFracciones(){
        assertThat(new Fraccion(1, 1).divididoEn(new Fraccion(1, 2)), equalTo(new Fraccion(2, 1)));
    }
    
}
