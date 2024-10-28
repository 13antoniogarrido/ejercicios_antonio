package org.example;

import java.util.Scanner;

public class Tema2 {

    public void clasesString(){
        String texto = new String("Javadesdecero");
        System.out.println(texto.length()); //retorna "13", la cantidad de letras que hay en texto
        System.out.println(texto.charAt(4)); //retorna la letra de la posicion 4 "d"
        System.out.println(texto.substring(4)); //retorna el texto a partir de la 4 letra "desdecero"
        System.out.println(texto.substring(4,9)); //retorna el texto a partir de la 4 letra hasta la 9 "desde"
        String s1= " Java";
        String s2= "desdecero ";
        String salida = s1.concat(s2);//Concatena dos Strings
        System.out.println(salida);
        System.out.println(texto.indexOf("cero"));//Retorna la posición donde se encuentra la palabra
        System.out.println(texto.indexOf("desde",1));//Retorna la posición donde se encuentra la palabra o letra a partir de la posición que indicas
        System.out.println(texto.lastIndexOf("a"));//retorna la ultima posición de la letra indicada
        System.out.println(texto.toUpperCase());//retorna el texto en mayusculas el texto
        System.out.println(texto.toLowerCase());//retorna el texto en minusculas el texto
        System.out.println(salida.trim());//quita los espacios del principio y del final
        System.out.println(texto.replace("d","c"));//sustituye la primera letra por la segunda
        System.out.println(s1.equals(" Java"));//Compara si el texto es igual o no, y te devuelve true o false
        System.out.println(s1.equalsIgnoreCase(" java"));//Compara si el texto es igual ignorando las mayusculas
    }

    public void excepciones(){
    }
}
