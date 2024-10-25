package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

    public void aleatorios() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt();
        System.out.println(numero);

        int numero2 = aleatorio.nextInt(3) + 101;
        System.out.println(numero2);

        double numero3 = aleatorio.nextDouble() * 3 + 1;//esto es lo mismo, que el numero 4 SE USA ESTE
        System.out.println(numero3);

        double numero4 = Math.random();//esto es lo mismo, que el numero 3
        System.out.println(numero4);

        double numero5 = aleatorio.nextDouble() * 3 + 1;//esto es lo mismo, que el numero 4 SE USA ESTE
        System.out.println(numero5);


    }

    public void ejercicio1() {

        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(+6) + 1;
        System.out.println(dado1);
        int dado2 = aleatorio.nextInt(+6) + 1;
        System.out.println(dado2);

        System.out.println("la suma total de los dados es : " + (dado1 + dado2));
    }

    public void ejercicio2() {

        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contrasenya = "";

        int posicion;

        for (int i = 0; i < longitud; i++) {

            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);//+= es para que pueda usar numeros y letras
        }

        System.out.println("la contraseña es:" + contrasenya);
    }

    public void ejercicio3() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int min = 1;
        int max = 0;
        int num = 0;
        int nums = 0;
        boolean error = true;
        while (error = true) {
            try {
                while (min >= max) {
                    System.out.println("Dame un numero máximo");
                    max = entrada.nextInt();
                    System.out.println("Dame un numero minimo");
                    min = entrada.nextInt();
                }
                System.out.println("Dime cuantos numeros quieres que te muestre");
                nums = entrada.nextInt();
                for (int i = 0; i < nums; i++) {
                    num = aleatorio.nextInt(max - min + 1) + min;
                    System.out.println(num);
                }
                break;
            } catch (InputMismatchException e1) {
                System.out.println("has introducido un caracter mal, introduce un numero inutil" + e1);
                entrada.nextLine();
            }
        }
    }
}
