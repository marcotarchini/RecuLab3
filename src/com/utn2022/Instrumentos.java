package com.utn2022;

public abstract class Instrumentos {
    private double precios;

    public Instrumentos(double precios) {
        this.precios = precios;
    }

    public double getPrecios() {
        return precios;
    }

    public void setPrecios(double precios) {
        this.precios = precios;
    }

    @Override
    public String toString() {
        return "precio=" + precios + ", ";
    }

}
