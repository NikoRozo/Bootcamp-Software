package com.bootcamp.nico.juegoDeLaVida;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;


/**
 *
 * @author Niko
 */
public class StartGameTest {
    
    @Test
    public void Generacion3(){
        StartGame game = new StartGame(3);
        assertThat(game.startGame().toString(), equalTo(new StringBuilder().append(". . . . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
                                                                           .append(". . . . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
                                                                           .append("* * * . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
                                                                           .append(". . . . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
                                                                           .append(". . . . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
                                                                           .append(". . . . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
                                                                           .append(". . . . . . . . . . . . . . . . . . . . . . . . . . . . ").append(Tablero.SALTO_LINEA)
        )
        );
    }
    
}
