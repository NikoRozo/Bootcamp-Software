package com.bootcamp.nico.figuras;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *
 * @author Niko
 */
public class FigurasTest {

    @Test
    public void figuraCuadrado(){
        assertThat(Figuras.cuadrado(), equalTo(new StringBuilder().append("***").append(Figuras.SALTO_LINEA)
                                                                  .append("***").append(Figuras.SALTO_LINEA)
                                                                  .append("***").append(Figuras.SALTO_LINEA)
                                                                  .toString()));
    }
    
    @Test
    public void figuraPiramide(){
        assertThat(Figuras.piramide(), equalTo(new StringBuilder().append("  *").append(Figuras.SALTO_LINEA)
                                                                  .append(" ***").append(Figuras.SALTO_LINEA)
                                                                  .append("*****").append(Figuras.SALTO_LINEA)
                                                                  .toString()));
    }
    
    @Test
    public void figuraRombo(){
        assertThat(Figuras.rombo(), equalTo(new StringBuilder().append("  *").append(Figuras.SALTO_LINEA)
                                                               .append(" ***").append(Figuras.SALTO_LINEA)
                                                               .append("*****").append(Figuras.SALTO_LINEA)
                                                               .append(" ***").append(Figuras.SALTO_LINEA)
                                                               .append("  *").append(Figuras.SALTO_LINEA)
                                                               .toString()));
    }
}
