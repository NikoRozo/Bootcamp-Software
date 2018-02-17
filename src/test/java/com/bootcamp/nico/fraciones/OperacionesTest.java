package com.bootcamp.nico.fraciones;

import com.bootcamp.nico.fracciones.Operaciones;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.equalTo;

/**
 *
 * @author Niko
 */
public class OperacionesTest {
    
    @Test
    public void calcularElMaximoCumunDivisor(){
        assertThat(Operaciones.mcd(4, 12), is(4));
    }
    
    @Test
    public void calcularElMinimoCumunMultiplo(){
        assertThat(Operaciones.mcm(3, 9), is(9));
    }
    
}
