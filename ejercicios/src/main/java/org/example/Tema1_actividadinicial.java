package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema1_actividadinicial {

    public void actividad() {

        System.out.println("hola \n");//\n es para un salto de línea, println muestra el mensaje

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }

    public void actividad1() {//mi primer proyecto de desarrollo.
        Scanner entradaEscaner = new Scanner(System.in); //ESTO ES PARA ACTIVAR EL TECLADO

        System.out.println("¿Cómo te llamas?: "); //ESTO ES PARA IMPRIMIR EN PANTALLA
        String nombre = entradaEscaner.next(); //ESTO ES PARA ESCRIBIR POR TECLADO EN TEXTO

        System.out.println("¿A qué curso vas: ");
        String curso = entradaEscaner.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + "."); //saludamos al usuario con un mensaje personalizado con su nombre y curso

        System.out.println("Introduce un número: ");
        int num1 = entradaEscaner.nextInt(); //ESTO ES PARA ESCRIBIR POR TECLADO EN NUMERO

        System.out.println("Introduce otro número: ");
        int num2 = entradaEscaner.nextInt();

        int resultado = num1 + num2; //realizamos la operación suma y la guardamos en la variable resultado

        System.out.println("El resultado de sumar los dos números es: " + resultado); //mostramos el resultado de la suma por pantalla

    }

    public void actividad_inicial() {

        System.out.println("¿Cómo te llamas?");

        Scanner entrada = new Scanner(System.in);
        //System.in

        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ",bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {

            System.out.println("Introduce un número...");
            num1 = entrada.nextInt();

            System.out.println("Introduce otro número...");
            num2 = entrada.nextInt();

            if (num1 == num2) {
                System.out.println("ERROR. Los números son iguales.");
            }
        }
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
    }

//    public void ejercicio1(){
//        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
//        boolean numerovalido = false;
//        while (!numerovalido) {
//            try {
//                System.out.println("Introduce un número"); //preguntamos el nombre al usuario
//                String nombre = entradaEscaner.next(); //el usuario introduce su nombre por teclado
//            }


}

