/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea alimentar a su perro 1-Si/2-No");
        int opc = leer.nextInt();
        if(opc==1){
         System.out.println("El perro se ha alimentado");   
        }else{
            System.out.println("Se alimentara mas tarde al perro");
        }
        
    }
    
    
}
