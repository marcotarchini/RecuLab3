package com.utn2022;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empresa empresa=new Empresa();

        Baterias bateria1= new Baterias("Tama",5,5,0);
        Baterias bateria2= new Baterias("Mapex",7,4,0);
        Baterias bateria3= new Baterias("Sonor",4,2,0);
        GElectricas gElectrica1 =new GElectricas(6,"Fender",50000);
        GAcusticas gAcustica1= new GAcusticas(6,"caoba",40000);
        GAcusticas gAcustica2= new GAcusticas(6,"abedul",35000);

        List<Instrumentos> instrumentos=new ArrayList<>();

        instrumentos.add(bateria1);
        instrumentos.add(bateria2);
        instrumentos.add(bateria3);
        instrumentos.add(gElectrica1);
        instrumentos.add(gAcustica1);
        instrumentos.add(gAcustica2);

        empresa.recorrerConinstancia(instrumentos);

        empresa.aumento(instrumentos);

        empresa.recorrerConinstancia(instrumentos);



    }
}
/*
Un comercio se dedica a la venta de instrumentos musicales. Ofrece dos grandes grupos de
instrumentos, los instrumentos de cuerdas y las baterías. Todos los instrumentos tienen un precio y
una marca como general, pero existen distintos datos entre todos.
Por un lado tenemos las baterías que cuentan con un número específico de tambores
(mínimo 3) y una cantidad de platillos (mínimo 1 o hasta 5). Cada precio de batería es distinto ya
que depende de la cantidad de tambores y platillos que tenga. Cada tambor cuesta 3000 pesos y
cada platillo 2000 pesos. El cálculo del precio se debe cargar al momento de generar una nueva
batería.
Mientras que para los instrumentos de cuerda encontramos tres tipos. Las guitarras
eléctricas, guitarras acústicas y bajos. Todos los instrumentos de cuerda saben cuantas cuerdas
poseen (6 para las guitarras y 4 para los bajos).
Solo las guitarras eléctricas y los bajos comparten la misma información: nombre del
modelo. Y para las guitarras acústicas sólo se debe especificar el tipo de madera (caoba o nogal).
1) Crear las distintas clases respetando nombres y atributos.
2) Sobrescribir el método ToString de cada clase para mostrar la información de cada una.
3) Crear distintas instancias de estos instrumentos, juntarlos en un ArrayList y recorrer cada uno
con su método ToString.
4) Crear una interfaz para las guitarras eléctricas y los bajos donde se pueda utilizar un método
“SonidoAmplificado”. Donde este método retorne por pantalla: “ (Tipo de Clase): SONIDO
AMPLIFICADO”
5) Se solicita actualizar el valor de los precios del array del ejercicio 3. Esto se debe realizar a
través de un método de la clase. Cree un bucle en donde se actualizan con los siguientes valores e
imprima ambos valores(sin aumento y con aumento):
● Guitarras Eléctricas = 5%
● Acústicas = 10%
● Baterias = 15%
● Bajos = 20%
 */