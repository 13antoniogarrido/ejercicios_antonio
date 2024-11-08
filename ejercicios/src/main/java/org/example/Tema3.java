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

    public void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        int num [] =  {1,2,3,4,5};
        int num2 [] = new int[num.length-1];
        int posicionaborrar;
        System.out.println("ingresa la posicion que quieres eliminar del 0-4");
        posicionaborrar = teclado.nextInt();
        for (int i = 0; i < num.length-1; i++) {
            if (i < posicionaborrar){
                num2[i] = num[i];
            }else {
                num2[i] = num[i+1];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
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

    public void ejercicio6(){

        Scanner teclado = new Scanner(System.in);
        int numeros [] = new int[5];
        System.out.println("introduce 5 números...");
        for (int i=0; i<numeros.length;i++){
            numeros[i] =  teclado.nextInt();
        }
        if (numeros[0]==numeros[4]&&numeros[1]==numeros[3]){
            System.out.println("el array es simétrico");
        } else {
            System.out.println("el array NO es simétrico");
        }


    }

    public void ejercicio7(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce de que tamañano quieres la array...");
        int tamanyo = teclado.nextInt();
        System.out.println("introduce de que tamañano quieres la 2 array...");
        int tamanyo2 = teclado.nextInt();
        int numeros [] = new int[tamanyo];
        int numeros2 [] = new int[tamanyo2];
        System.out.println("introduce " + tamanyo +  " números...");
        for (int i=0; i<numeros.length;i++){
            numeros[i] =  teclado.nextInt();
        }
        System.out.println("introduce otros " + tamanyo2 +  " números...");
        for (int i=0; i<numeros2.length;i++){
            numeros2[i] =  teclado.nextInt();
        }
        System.out.println(numeros);

    }

    public void vector(){
        String palabras[] ={"aa", "bb", "cc"};
        String textovector = Arrays.toString(palabras);
        System.out.println(textovector);
    }


    }



