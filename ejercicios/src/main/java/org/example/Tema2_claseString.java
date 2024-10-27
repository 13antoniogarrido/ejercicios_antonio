package org.example;

public class Tema2_claseString {

    public void clases(){

        String texto = new String("Javadesdecero");
        System.out.println(texto.length()); //retorna "13", la cantidad de letras que hay en texto
        System.out.println(texto.charAt(4)); //retorna la letra de la posicion 4 "d"
        System.out.println(texto.substring(4)); //retorna el texto a partir de la 4 letra "desdecero"
        System.out.println(texto.substring(4,9)); //retorna el texto a partir de la 4 letra hasta la 9 "desde"
        String s1= "Java";
        String s2= "desdecero";
        String salida = s1.concat(s2);//Concatena dos Strings
        System.out.println(salida);
        System.out.println(texto.indexOf("cero"));//Retorna la posición donde se encuentra la palabra
        System.out.println(texto.indexOf("desde",1));//Retorna la posición donde se encuentra la palabra o letra a partir de la posición que indicas
        System.out.println(texto.lastIndexOf("a"));//retorna la ultima posición de la letra indicada
        System.out.println(texto.toUpperCase());//retorna el texto en mayusculas el texto
        System.out.println(texto.toLowerCase());//retorna el texto en minusculas el texto



    }
}
