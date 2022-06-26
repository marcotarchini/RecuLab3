package com.utn2022;

public class Bajo extends Cuerdas implements SonidoAmplificado,Aumento{
    private String nombreModelo;


    public Bajo(int cuerdas, String nombreModelo,double precios) {
        super(cuerdas,precios);
        this.nombreModelo = nombreModelo;
        }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public int validadorDeCuerdas(){
        if (super.getCuerdas()==4){
            return super.getCuerdas();
        }
        else{
            System.out.println("La cantidad de cuerdas es incorrecta");
        }
        return super.getCuerdas();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nnombreModelo='" + nombreModelo +
                "\nPrecio"+ super.getPrecios();
    }
    @Override
    public void sonidoAmplificado() {
        System.out.println(toString() +"SONIDO AMPLIFICADO");
    }

    @Override
    public double conAumento() {
        double precioAumento=super.getPrecios();
        super.setPrecios(precioAumento=precioAumento+precioAumento*0.2);
        return precioAumento;
    }
}
