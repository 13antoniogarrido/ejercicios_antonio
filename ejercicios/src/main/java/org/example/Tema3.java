package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3 {

    public void vectores(){

        int vector [];
        vector = new int[7];//se crea el vector, en este caso un int, se puede hacer con string
        vector [2] = 13;//se le da el valor al vector posicion 2
        vector [5] = vector [2] + 13;//se le da el valor al vector posicion 5
        System.out.println(vector[5]);//imprime
        for (int i=0; i<vector.length;i++){//se tiene que poner siempre inferior a i, si se pone igual, da error de programación, length es para el tamaño del vector
            System.out.println(" " + vector[i] + " ");
        }
    }

    public void ejercicio1(){

        Random aleatorio = new Random();//se crea random, numeros aleatorios
        int numeros [] = new int[8];//se crea el vector de 8 numeros
        int suma = 0;
        for (int i=0; i<numeros.length;i++){//se tiene que poner siempre inferior a i, si se pone igual, da error de programación, length es para el tamaño del vector
            numeros[i] = aleatorio.nextInt(501);//imprimir un numero aleatorio del 0 al 500
            System.out.println(" " + numeros[i] + " ");
        }
        for (int i=0;i<numeros.length;i++){
            suma+=numeros[i];
        }
    System.out.println("la suma de los elementos es: " + suma);
    }

    public void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        int numeros [] = new int[5];
        System.out.println("introduce los 5 números a invertir...");
        for (int i=0; i<numeros.length;i++){
            numeros[i] =  teclado.nextInt();
        }
        for (int i= numeros.length-1; i>=0;i--){
            System.out.println( numeros[i]);
        }
    }

    public void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();//se crea random, numeros aleatorios
        int numeros [] = new int[25];
        int numeroteclado = 0;
        int contador = 0;
        for (int i=0; i<numeros.length;i++){
            numeros[i]=aleatorio.nextInt(101);
        }
        System.out.println("introduce un número para saber cuantas veces está en la array del 0 al 100");
        numeroteclado = teclado.nextInt();
        for (int i=0; i<numeros.length;i++){
            if (numeroteclado==numeros[i]){
                contador++;
            }
        }
        System.out.println("el número " + numeroteclado + " aparece " + contador + " veces");
    }

    public void ejercicio5(){

        int num [] =  {1,2,3,4,5};
        int ultimaposicion = num[num.length-1];//aqui guardamos el ultimo numero 5
        for (int i=num.length-1;i>=0;i--){
            if (i==0){
                num[i] = ultimaposicion;
            }else {
                num[i] = num[i-1];
            }
        }
        for (int i=0; i< num.length;i++)
            System.out.println(" " + num[i] + " ");
    }

    public void vector(){
        String palabras[] ={"aa", "bb", "cc"};
        String textovector = Arrays.toString(palabras);
        System.out.println(textovector);
    }


    }



