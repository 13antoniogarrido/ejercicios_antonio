package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tema2_actividad {

    public void actividad1(){

        System.out.println("Bienvenido a la clasificación de generaciones");
        System.out.println("Elige un modo: ");
        System.out.println("1. Año de nacimiento ");
        System.out.println("2. Edad ");

        Scanner teclado = new Scanner(System.in);

        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int ano_actual = hoy.getYear();
        int ano_nacimiento = 0;
        boolean error = false;

        if (modo.equals("1")){

            System.out.println("introduce tu año de nacimiento: ");
            String ano = teclado.next();

            try{
                ano_nacimiento = Integer.parseInt(ano);
            }catch (NumberFormatException e1){
                System.out.println("el formato del año no es correcto. " + e1.getMessage());
            }

            if (ano_nacimiento < 1900 || ano_nacimiento > ano_actual){
                System.out.println("el año introducido no es correcto.");
                error=true;
            }


        } else if (modo.equals("2")) {

            System.out.println("introduce tu edad: ");
            int edad = 0;
            if (teclado.hasNextInt()){
                edad = teclado.nextInt();
            }else {
                System.out.println("el formato es incorrecto");
            }

            if (edad < 0){
                System.out.println("la edad introudcida no es correcta.");
                error=true;
            }else {
                ano_nacimiento = ano_actual-edad;
                error=true;
            }

        }else {
            System.out.println("el modo no existe");
        }
        if (!error){
        if (ano_nacimiento>=1900 && ano_nacimiento<=1927){
            System.out.println("Eres de la generación sin bautizar.");
        } else if (ano_nacimiento>=1928 && ano_nacimiento<=1944) {
            System.out.println("Eres de la generación Silent.");
        } else if (ano_nacimiento>=1945 && ano_nacimiento<=1964) {
            System.out.println("Eres de la generación baby boomer.");
        } else if (ano_nacimiento>=1965 && ano_nacimiento<=1981) {
            System.out.println("Eres de la generación X.");
        } else if (ano_nacimiento>=1982 && ano_nacimiento<=1994) {
            System.out.println("Eres de la generación millenial.");
        } else if (ano_nacimiento>=1995 && ano_nacimiento<=ano_actual) {
            System.out.println("Eres de la generación Centenelials.");
        }else {
            System.out.println("no tienes generacion.");
        }}

    }
}
