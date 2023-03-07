/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */

package com.mycompany.herencia1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author 54343
 */
public class Herencia1 {

    public static void main(String[] args) {
        
     //Declaracion del objeto Perro
     Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        System.out.println(perro1.toString());
     perro1.alimentarse();
     
     //Declaracion de otro objeto Perro
     Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        System.out.println(perro2.toString());
     perro2.alimentarse();
     
     //Declaracion del objeto Gato
     Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        System.out.println(gato1.toString());
     gato1.alimentarse();
     
     //Declaracion del objeto Caballo
     Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        System.out.println(caballo1.toString());
     caballo1.alimentarse();
    }
}
