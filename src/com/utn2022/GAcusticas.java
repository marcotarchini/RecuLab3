package com.utn2022;

public class GAcusticas extends Cuerdas implements Aumento {

    private String tipoMadera;

    public GAcusticas(int cuerdas, String tipoMadera,double precios) {
        super(cuerdas,precios);
        this.tipoMadera = tipoMadera;
        validacionTipoMadera();
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
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

    public String validacionTipoMadera() {
        String maderaFinal = null;

        if (getTipoMadera() == "caoba") {
            maderaFinal = getTipoMadera();
            return maderaFinal;
        } else if (getTipoMadera() == "nogal") {
            maderaFinal = getTipoMadera();
            return maderaFinal;
        } else {
            maderaFinal="Error de madera";
        }
        setTipoMadera(maderaFinal);
        return maderaFinal;
    }


    @Override
    public String toString() {
        return  "\nTipo de Madera=" + tipoMadera +
                "\nPrecio"+ super.getPrecios();

    }
    @Override
    public double conAumento() {
        double precioAumento=super.getPrecios();
        super.setPrecios(precioAumento=precioAumento+precioAumento*0.1);
        return precioAumento;
    }
}
