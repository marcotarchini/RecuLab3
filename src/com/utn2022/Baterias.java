package com.utn2022;

public class Baterias extends Instrumentos implements Aumento{

    private String marca;
    private int cantPlatillos;
    private int cantTambores;

    public Baterias(String marca, int cantPlatillos, int cantTambores,double precios) {
        super(precios);
        this.marca = marca;
        this.cantPlatillos = cantPlatillos;
        this.cantTambores = cantTambores;
    }


    public Baterias setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public int getCantPlatillos() {
        return cantPlatillos;
    }

    public void setCantPlatillos(int cantPlatillos) {
        this.cantPlatillos = cantPlatillos;
    }

    public int getCantTambores() {
        return cantTambores;
    }

    public void setCantTambores(int cantTambores) {
        this.cantTambores = cantTambores;
    }

    public double calculaPrecio(){
        double precioFinal=0;

        if (this.cantTambores>=3){
            precioFinal=super.getPrecios()+ 3000 * this.cantTambores;
        }
        else {
            System.out.println("La cantidad de tambores es incorrecta");
        }
        if (this.cantPlatillos<=5&&this.cantPlatillos>=1){
            precioFinal=super.getPrecios() +2000*this.cantPlatillos;
        }
        else {
            System.out.println("La cantidad de platillos es incorrecta");
        }
        super.setPrecios(precioFinal);
        return precioFinal;
    }

    @Override
    public String toString() {
        return  "\nprecio=" + calculaPrecio() +
                "\nmarca='" + marca +
                "\ncantPlatillos=" + cantPlatillos +
                "\ncantTambores=" + cantTambores;
    }
    @Override
    public double conAumento() {
        double precioAumento=super.getPrecios();
        super.setPrecios(precioAumento=precioAumento*0.15);
        return precioAumento;
    }
}