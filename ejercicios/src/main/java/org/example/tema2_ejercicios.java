package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class tema2_ejercicios {
//bien
    public void ejercicio1 (){
        Scanner entrada = new Scanner(System.in);

    }

    public void ejercicio3() {

        Scanner teclado = new Scanner(System.in);
        boolean err = true;
        int n = 0;
        int m = 0;

        try {
            System.out.printf("Introduce un número...");
            n = teclado.nextInt();
            System.out.printf("Introduce un número para quitar las cifras al anterior...");
            m = teclado.nextInt();
            if (n > m) {
                err = false;
            } else {
                System.out.printf("No se pueden quitar más cifras de las que hay.");
            }

        } catch (InputMismatchException e) {
            System.out.printf("El formato no es correcto(númerico)");
            teclado.nextLine();
        }

        String n_string = Integer.toString(n);
        int tamanyo = n_string.length();

        n_string = n_string.substring(0, tamanyo - m);

        System.out.printf("El número sin las " + m + " cifras es " + n_string);

    }

    public  void ejercicio4 (){
        Scanner entrada = new Scanner(System.in);

        String text = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";

        String subcadena = "Mundo";


    }

}
