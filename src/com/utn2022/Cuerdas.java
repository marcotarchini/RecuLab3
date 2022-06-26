package com.utn2022;

public abstract class Cuerdas extends Instrumentos{

    private int cuerdas;

    public Cuerdas(int cuerdas,double precios) {
        super(precios);
        this.cuerdas = cuerdas;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public String toString() {
        return "\ncuerdas=" + cuerdas +
                "\n, ";
    }
}
