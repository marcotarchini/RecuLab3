package com.utn2022;

public class GElectricas extends Cuerdas implements SonidoAmplificado,Aumento{

    private String nombreModelo;


    public GElectricas(int cuerdas, String nombreModelo,double precios) {
        super(cuerdas,precios);
        this.nombreModelo = nombreModelo;
        validadorDeCuerdas();
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public int validadorDeCuerdas(){
        if (super.getCuerdas()==6){
            return super.getCuerdas();
        }
        else{
            System.out.println("La cantidad de cuerdas es incorrecta");
        }
        return super.getCuerdas();
    }

    @Override
    public String toString() {
        return  "\nNombre del Modelo=" + nombreModelo+
                "\nPrecio"+ super.getPrecios();
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println(toString() +"SONIDO AMPLIFICADO");
    }

    @Override
    public double conAumento() {
        double precioAumento=super.getPrecios();
        super.setPrecios(precioAumento=precioAumento+precioAumento*0.05);
        return precioAumento;
    }

}
