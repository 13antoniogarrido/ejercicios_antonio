package org.example;

import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial(){
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1==num2){
            System.out.println("Introduce un número 1");
            num1 = entrada.nextInt();

            System.out.println("Introduce un número 2");
            num2 = entrada.nextInt();

            if (num1==num2){
            System.out.println("ERROR LOS NUMERO SON IGUALES");
            }
        }
            int resultado = num1 + num2;
            System.out.println("El resultado de la suma es " + resultado);
    }
}
