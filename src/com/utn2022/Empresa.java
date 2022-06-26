package com.utn2022;

import java.util.List;

public class Empresa {

    public Empresa() {
    }

    public void recorrerConinstancia(List<Instrumentos> lista) {

        for (Instrumentos instrumentos : lista) {

            if (instrumentos != null) {
                if (instrumentos instanceof Baterias) {
                    System.out.println("\n=======BATERIAS======");
                    System.out.println(instrumentos);
                }
                if (instrumentos instanceof Bajo) {
                    System.out.println("\n=======BAJOS======");
                    System.out.println(instrumentos);
                }
                if (instrumentos instanceof GElectricas) {
                    System.out.println("\n=======GUITARRAS ELECTRICAS======");
                    System.out.println(instrumentos);
                }
                if (instrumentos instanceof GAcusticas) {
                    System.out.println("\n=======GUITARRAS ACUSTICAS======");
                    System.out.println(instrumentos);
                }
            }
        }
    }

    public void aumento(List<Instrumentos> lista) {
        float aumento = 0;
        System.out.println("\nGuitarras Eléctricas = 5%\n" +
                "● Acústicas = 10%\n" +
                "● Baterias = 15%\n" +
                "● Bajos = 20%");
        for (Instrumentos instrumentos : lista) {
            if (instrumentos != null) {
                if (instrumentos instanceof Baterias) {
                    instrumentos.setPrecios(((Baterias)instrumentos).conAumento());
                }
                if (instrumentos instanceof Bajo) {
                    instrumentos.setPrecios(((Bajo)instrumentos).conAumento());
                }
                if (instrumentos instanceof GAcusticas) {
                    instrumentos.setPrecios(((GAcusticas)instrumentos).conAumento());
                }
                if (instrumentos instanceof GElectricas) {
                    instrumentos.setPrecios(((GElectricas)instrumentos).conAumento());
                }
            } } }

}
