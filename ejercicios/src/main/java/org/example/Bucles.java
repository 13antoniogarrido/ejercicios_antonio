package org.example;

import java.util.Scanner;

public class Bucles {

    public void ejercicio1 (){

        Scanner teclado = new Scanner(System.in);

        String psw = "entornos";
        String psw_usuario;

        do {
            System.out.println("introduce tu contraseña: ");
            psw_usuario = teclado.next();
        }while (psw_usuario.equals(psw));



    }

    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce un número...");
        int numero = teclado.nextInt();

        for (int i=numero; i>=1 ; i--){
            System.out.println(i);
        }

    }

    public void ejercicio3(){


    }

}
