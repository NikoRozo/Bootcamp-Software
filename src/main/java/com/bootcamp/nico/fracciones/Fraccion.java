package com.bootcamp.nico.fracciones;

/**
 *
 * @author Niko
 */
public class Fraccion {

    private final int numerador;
    private final int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no Puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion simplificar() {
        int mcd = Operaciones.mcd(this.numerador, this.denominador);
        return new Fraccion(this.numerador / mcd, this.denominador / mcd);
    }

    public Fraccion mas(final Fraccion fraccion) {
        int nuevoDenominador = Operaciones.mcm(this.denominador, fraccion.denominador);
        int nuevoNumerador = nuevoDenominador / fraccion.denominador * this.numerador + nuevoDenominador / this.denominador * fraccion.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion menos(final Fraccion fraccion) {
        return this.mas(inverso(fraccion));
    }

    public Fraccion por(final Fraccion fraccion) {
        return new Fraccion(this.numerador * fraccion.numerador, this.denominador * fraccion.denominador);
    }

    public Fraccion divididoEn(final Fraccion fraccion) {
        return this.por(reciproco(fraccion));
    }

    private Fraccion inverso(final Fraccion fraccion) {
        return new Fraccion(-fraccion.numerador, fraccion.denominador);
    }

    public Fraccion reciproco(final Fraccion fraccion) {
        return new Fraccion(fraccion.denominador, fraccion.numerador);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numerador;
        hash = 89 * hash + this.denominador;
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
        final Fraccion other = (Fraccion) obj;
        if (this.numerador != other.numerador) {
            return false;
        }
        return this.denominador == other.denominador;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

}
