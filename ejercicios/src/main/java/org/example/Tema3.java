package org.example;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3 {

    public void vectores(){

        int vector [];
        vector = new int[7];//se crea el vector, en este caso un int, se puede hacer con string
        vector [2] = 13;//se le da el valor al vector posicion 2
        vector [5] = vector [2] + 13;//se le da el valor al vector posicion 5
        System.out.println(vector[5]);//imprime 26
        for (int i=0; i<vector.length;i++){/*se tiene que poner siempre inferior a i, si se pone igual, da error de programación,
        length es para el tamaño del vector*/
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

    public void navidad(){

        Scanner teclado = new Scanner(System.in);
        final String palabra ="NAVIDAD";
        System.out.println("introduce la cantidad de letras a mostrar...");
        String cantidad = teclado.nextLine();
        String cantidades [] = cantidad.split(" ");
        String letras [] = palabra.split("");
        System.out.println(Arrays.toString(cantidades));
        System.out.println(Arrays.toString(letras));
        String resultado = "";
        for (int i=0;i<letras.length;i++){
            for (int j=0;j<Integer.parseInt(cantidades[i]);j++){
            resultado = resultado + letras[i];
        }
        }
        System.out.println(resultado);
    }

    public void buscar(){

        String colores[] = {"amarillo", "azul", "rojo", "naranja"};
        String color = "negro";
        boolean existe = Arrays.asList(colores).contains(color);
        if (existe){
            System.out.println("el color " + color + " existe en el vector.");
        }else{
            System.out.println("el color " + color + " no existe en el vector.");
        }

    }

    public void ruleta(){
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        String colores[] = {"rojo","negro"};
        Integer numeros[] = new Integer[37];
        String color = "";
        String par = "";
        for (int i=0;i<numeros.length;i++){
            numeros[i] = i;
        }
        String pares[]={"par","impar"};
        System.out.println("Número (0-36): ");
        int numero = teclado.nextInt();
        boolean numeroexiste = Arrays.asList(numeros).contains(numero);
        if (!numeroexiste){
            System.out.println("Error. El número no es válido.");
            return;
        }else {
            if (numero != 0) {
                System.out.println("Color (rojo o negro):");
                color = teclado.next();
                boolean colorexite = Arrays.asList(colores).contains(color);
                if (!colorexite){
                    System.out.println("Error. El color no es válido.");
                    return;
                }else{
                    System.out.println("Introduce la opción par o impar.");
                    par = teclado.next();
                    boolean parexiste = Arrays.asList(pares).contains(par);
                    if (!parexiste){
                        System.out.println("Error. La opción par o impar no es válido.");
                        return;
                    }
                }
            }
        }
        int numerosorteo = numeros[aleatorio.nextInt(37)];
        String colorsorteo = colores[aleatorio.nextInt(2)];
        String parsorteo = "";
        if (numerosorteo%2==0){
            parsorteo = "par";
        }else {
            parsorteo = "impar";
        }
        System.out.println("Ha tocado " + numerosorteo + " " + colorsorteo + " " + parsorteo);
        if(numerosorteo==numero && colorsorteo.equals(color) && parsorteo.equals(par)){
            System.out.println("Has ganado!!");
        } else if (numerosorteo!=0 && colorsorteo.equals(color)) {
            System.out.println("has acertado el color.");
        } else if (numerosorteo!=0 && parsorteo.equals(par)) {
            System.out.println("has acertado par/impar.");
        } else if (numerosorteo==numero && numero!=0) {
            System.out.println("has acertado el número");
        } else if (numero==0 && numerosorteo==0) {
            System.out.println("Has ganado y los demás han perdido");
        }else {
            System.out.println("has perdido");
        }
    }

    public void ordenar(){

        int numeros[] = {4,3,10,34,21};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int numero = 34;
        int posicion = Arrays.binarySearch(numeros,numero);
        System.out.println(posicion);



    }

    public void duplicados1(){

        int original[] = {3,3,5,10,16,25,25};
        int auxiliar[] = new int [original.length];
        int tamanyo = 0;
        for (int i=0; i < original.length; i++){
            if (i!=original.length-1 && original[i]==original[i+1]){
                System.out.println("duplicado: " + original[i]);
            }else {
                auxiliar[i] = original[i];
                tamanyo++;
            }
        }
            System.out.println(Arrays.toString(auxiliar));
        int limpio[] =new int[tamanyo];
        int pos = 0;
        for (int i = 0; i < auxiliar.length;i++){
            if (auxiliar[i]!=0){
                limpio[pos]=auxiliar[i];
                pos++;
            }
        }System.out.println(Arrays.toString(limpio));
    }

    public void duplicados3() {

        int original[] = {3, 3, 5, 10, 16, 25, 25};
        Random aleatorio = new Random();
        System.out.println(Arrays.toString(original));
        boolean repetir = true;
        while (repetir){
            repetir = false;
            for (int i = 0; i < original.length; i++) {
                if (i != original.length - 1 && original[i] == original[i+1]) {
                    System.out.println("duplicado: " + original[i]);
                    original[i] = aleatorio.nextInt(2) + 1;
                    repetir = true;
                }
            }
            Arrays.sort(original);
        }System.out.println(Arrays.toString(original));
    }

    public void duplicadoscortos(){

        int original[]= {3,3,5,10,16,25,25};
        System.out.println(Arrays.toString(original));
        int limpio []= Arrays.stream(original).distinct().toArray();
        System.out.println(Arrays.toString(limpio));

    }

    public void triangulo(){

        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();
        for (int i=0;i<=altura;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
    }
    }

    public void multiplicacion(){

        for (int i=1;i<=10;i++){
            System.out.println("tabla del " + i + ":");
            for (int j=1;j<=10;j++){
                System.out.print(i+ "x" +j + "=" +i*j +" ");
            }
            System.out.println("");
        }
    }
    }





