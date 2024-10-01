package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1==num2){
            System.out.println("Introduce un número 1");
            num1 = entrada.nextInt();

            System.out.println("Introduce un número 2");
            num2 = entrada.nextInt();

            if (num1==num2){
            System.out.println("ERROR LOS NUMERO SON IGUALES");
            }
        }
            int resultado = num1 + num2;
            System.out.println("El resultado de la suma es " + resultado);
    }

    public void excepciones(){
        Scanner entrada = new Scanner(System.in);

        int numero;

        boolean error=true;

        while (error==true){

            try {
                System.out.println("introduce un numero...");
                numero = entrada.nextInt();
                error=false;
            }catch (InputMismatchException er){
                System.out.println("error, introduce un valor");
                entrada.nextLine();
            }
        }
    }

    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        int aux = 0;

        while (aux==0) {
                try {
                    System.out.println("introduce el dividendo...");
                    num1 = entrada.nextInt();
                    System.out.println("introduce el divisor...");
                    num2 = entrada.nextInt();
                    aux = 1;
                } catch (InputMismatchException er) {
                    System.out.println("error. introduce un valor valido...");
                    entrada.nextLine();
                }
        }
        if (num2==0){
            System.out.println("el divisor no puede ser 0.");
        }else {
            resultado = (num1/num2);
            System.out.println("el ersultado es " + resultado);
        }
    }

    public void ejercicio4(){
        Scanner entrada = new Scanner(System.in);




    }

    public void practica3(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String nombre = entrada.next();

        int edad=0;

        boolean error=true;

        while (error==true){

            try {
                System.out.println("Hola " + nombre + " ¿Que edad tienes?");
                edad = entrada.nextInt();
                error=false;
            }catch (InputMismatchException er){
                System.out.println("error, introduce la edad en número");
                entrada.nextLine();
            }
        }

            if (edad>=18)
            {System.out.println(nombre + ", puedes votar");
            }
                else {
                    System.out.println(nombre + ", No puedes votar");
                    int nopuedevotar = 18 - edad;
                    System.out.println("Te faltan " + nopuedevotar + " años.");
                }
        }

    }





