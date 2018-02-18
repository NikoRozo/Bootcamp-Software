package com.bootcamp.nico.juegoDeLaVida;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Niko
 */
public final class Archivo {
    private static final String PATH_FILE = "source/mundo.txt";

    public Archivo() {
        throw new IllegalAccessError("No puede ser Intnciada");
    }
    
    public static Path getPath(){
        return  Paths.get(PATH_FILE);
    }
    
    public static boolean existeArchivo(){
        return Files.exists(getPath(), new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
    }
    
    public static List<String> leerArchvo() throws IOException{
        return Files.readAllLines(getPath());
    }
}