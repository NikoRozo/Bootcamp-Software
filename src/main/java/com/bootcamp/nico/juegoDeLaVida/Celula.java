package com.bootcamp.nico.juegoDeLaVida;

import static com.google.common.base.Preconditions.checkArgument;
/**
 *
 * @author Niko
 */
public class Celula {

    private char caracter;
    private boolean estaViva;

    private Celula(final Builder builder) {
        this.caracter = builder.caracter;
        this.estaViva = builder.estaViva;
    }
    
    public char getCaracter(){
        return this.caracter;
    }
    
    public void setCaracter(final boolean estaviva){
        this.caracter = (estaviva) ? '*' : '.';
    }

    public boolean isEstaViva() {
        return estaViva;
    }

    public void setEstaViva(final boolean estaViva) {
        this.estaViva = estaViva;
    }
    
    public static boolean estaViva(final char valor) {
        return (valor == '*');
    }

    @Override
    public String toString() {
        return "Celula{" + "caracter=" + caracter + ", estaViva=" + estaViva + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.caracter;
        hash = 97 * hash + (this.estaViva ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Celula other = (Celula) obj;
        if (this.caracter != other.caracter) {
            return false;
        }
        if (this.estaViva != other.estaViva) {
            return false;
        }
        return true;
    }
    
    
    
    public static class Builder {

        private char caracter;
        private boolean estaViva;

        public Builder withCaracter(final char caracter) {
            checkArgument(caracter == '*' || caracter == '.' , "Una Celula solo puede estar Viva (*) o Muerta (.)");
            this.caracter = caracter;
            this.estaViva = false;
            return this;
        }

        public Builder withEstaViva(final boolean estaViva) {
            this.estaViva = estaViva;
            return this;
        }

        public Celula build() {
            return new Celula(this);
        }
    }
}
