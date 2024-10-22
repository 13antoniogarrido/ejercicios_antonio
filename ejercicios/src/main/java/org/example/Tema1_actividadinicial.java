package org.example;

import java.util.Scanner;

public class Tema1_actividadinicial {

    public void actividad (){

    System.out.println("hola \n");//\n es para un salto de línea, println muestra el mensaje

        for (int i = 1; i <= 5; i++) {

        System.out.println("i = " + i);
        }
    }

    public void actividad1 (){//mi primer proyecto de desarrollo.
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println("¿Cómo te llamas?: "); //preguntamos el nombre al usuario
        String nombre = entradaEscaner.next(); //el usuario introduce su nombre por teclado

        System.out.println("¿A qué curso vas: "); //preguntamos a qué curso va el usuario
        String curso = entradaEscaner.next(); //el usuario introduce su curso por teclado

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + "."); //saludamos al usuario con un mensaje personalizado con su nombre y curso

        System.out.println("Introduce un número: "); //le pedimos el primer sumando al usuario por teclado
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro número: "); //pedimos el segundo sumando
        int num2 = entradaEscaner.nextInt();

        int resultado = num1 + num2; //realizamos la operación suma y la guardamos en la variable resultado

        System.out.println("El resultado de sumar los dos números es: " + resultado); //mostramos el resultado de la suma por pantalla

    }

    public void actividad_inicial(){

        System.out.println("¿Cómo te llamas?");

        Scanner entrada = new Scanner(System.in);
        //System.in

        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " +  nombre + ",bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;


        while (num1==num2){

            System.out.println("Introduce un número...");
            num1 = entrada.nextInt();

            System.out.println("Introduce otro número...");
            num2 = entrada.nextInt();

            if (num1==num2){
                System.out.println("ERROR. Los números son iguales.");
            }
        }
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);


    }

    public void ejercicio3(){


    }
}
