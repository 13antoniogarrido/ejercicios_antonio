package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tema2_ejercicios {
    public void repaso1() {
        Scanner entrada = new Scanner(System.in);
        int numinto = 0;
        int num = 0;
        int mayor = 0;
        int menor = 0;
        int igual = 0;
        boolean error = true;
        while (error = true) {
            try {
                System.out.println("Dime la cantidad de numeros que quieres introducir: ");
                numinto = entrada.nextInt();
                for (int i = 0; i < numinto; i++) {
                    System.out.println("Dime un numero: ");
                    num = entrada.nextInt();
                    if (num < 0) {
                        menor++;
                    }
                    if (num > 0) {
                        mayor++;
                    }
                    if (num == 0) {
                        igual++;
                    }
                }
                System.out.println("Hay " + mayor + " numeros mayores a 0 " + "Hay " + menor + " numeros menores a 0 " + "Hay " + igual + " numeros iguales a 0 ");
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracater");
                entrada.nextLine();
            }
        }

    }

    public void repaso2() {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int base = 0;
        int expo = -1;
        int res = 0;
        while (error = true) {
            try {
                System.out.println("Introduce un numero (base): ");
                base = entrada.nextInt();
                while (expo < 0) {
                    System.out.println("Introduceme un numero (exponente): ");
                    expo = entrada.nextInt();
                }
                if (expo==0){
                   if (base > 0){
                       res = 1;
                       System.out.println("El resultado es: " + res);
                       break;
                   } else if (base < 0) {
                       res = -1;
                       System.out.println("El resultado es: " + res);
                       break;
                   }
                }
                for (int i = 1; i < expo; i++) {
                    int x = base;
                    res += base * x;
                }
                System.out.println("El resultado es: " + res);
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracater");
                entrada.nextLine();
            }
        }
    }

    public void repaso3() {

        Scanner entrada = new Scanner(System.in);
        int meses = 0 ;
        int res = 0;
        int mes = 10;
        boolean error = true;
        while (error = true) {
            try {
                System.out.println("dime cuantos meses vas a pagarlos ");
                meses = entrada.nextInt();
                for (int i = 1; i <= meses; i++){
                    if (i == 1) {
                        System.out.println("mes 1:" + mes);
                    }else {
                        res += mes;
                        mes = mes * 2;
                        System.out.println("mes " + i + ": " + mes);
                    }
                }res += mes;
            System.out.println("total a pagar " + res + "€");
                break;
            }catch (InputMismatchException e1){
                System.out.println("Error de caracter");
                entrada.nextLine();
            }

        }
    }

    public void repaso4() {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int nota = 0;
        int i = 0;
        while (error = true) {
            try {
                System.out.println("Dime tu nota: ");
                nota = entrada.nextInt();
                switch (nota) {
                    case 0, 1, 2, 3, 4:
                        System.out.println("INSUFICIENTE");
                        i = 1;
                        break;
                    case 5:
                        System.out.println("SUFICIENTE");
                        i = 1;
                        break;
                    case 6:
                        System.out.println("BIEN");
                        i = 1;
                        break;
                    case 7, 8:
                        System.out.println("NOTABLE");
                        i = 1;
                        break;
                    case 9, 10:
                        System.out.println("SOBRESALIENTE");
                        i = 1;
                        break;
                    default:
                        System.out.println("Nota no valida");
                        break;
                }
                if (i == 1) {
                    break;
                }
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void repaso5() {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int sueldo = 0;
        int mayor = 0;
        int masmil = 0;
        while (error = true) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Dime tu sueldo");
                    sueldo = entrada.nextInt();
                    if (sueldo <= 0) {
                        System.out.println("mete el sueldo en positivo, no puede ser negativo ");
                        i--;
                        continue;
                    }
                    if (sueldo > mayor) {
                        mayor = sueldo;
                    }
                    if (sueldo > 1000) {
                        masmil++;
                    }
                }
                System.out.println("El sueldo mas alto es: " + mayor);
                System.out.println("Hay mas de " + masmil + " personas ganando mas de 1000 euros");
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void repaso6() {
        Scanner entrada = new Scanner(System.in);
        int numalum = 0;
        int mayor = 0;
        int altos = 0;
        int altura = 0;
        int edad = 0;
        int edadtotal = 0;
        int alturatotal = 0;
        int mediaedadd = 0;
        int mediaalt = 0;
        boolean error = true;
        while (error = true) {
            while (numalum <= 0) {
                System.out.println("Dime la cantidad de alumnos ");
                numalum = entrada.nextInt();
            }
            try {
                for (int i = 0; i < numalum; i++) {
                    System.out.println("Dime la edad de tu alumno ");
                    edad = entrada.nextInt();
                    System.out.println("Dime la altura (cm) de tu alumno");
                    altura = entrada.nextInt();
                    if (edad <= 0 || altura <= 0) {
                        System.out.println("Eres gilipollas");
                        i--;
                        continue;
                    }
                    if (altura > 175) {
                        altos++;
                    }
                    if (edad > 18) {
                        mayor++;
                    }
                    edadtotal += edad;
                    alturatotal += altura;
                }
                mediaedadd = edadtotal / numalum;
                mediaalt = alturatotal / numalum;
                System.out.println("La media de edad es: " + mediaedadd);
                System.out.println("La media de altura es: " + mediaalt);
                System.out.println("Hay " + mayor + " mayores de 18");
                System.out.println("Hay " + altos + " que miden mas de 175 cm");
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void repaso7() {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        String secuencia = "";
        boolean error = true;
        while (error = true) {
            try {
                while (num <= 0) {
                    System.out.println("Dime un numero");
                    num = entrada.nextInt();
                }
                System.out.println("La secuencia de Numeros:");
                int anterior = 0, actual = 1;

                for (int i = 0; i < num; i++) {
                    if (i == 0) {
                        System.out.print(anterior);
                    } else if (i == 1) {
                        System.out.print(" " + actual);
                    } else {
                        int siguiente = anterior + actual;
                        System.out.print(" " + siguiente);
                        anterior = actual;
                        actual = siguiente;
                    }
                }
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void examen(){
            Scanner entrada = new Scanner(System.in);
            Random aleatorio = new Random();
            int numero = 0;
            int intentos = 9;//números de intentos
            int numeroaleatorio = aleatorio.nextInt(100);//números aleatorios que coge
            //System.out.println(numeroaleatorio);
            boolean error = true;
            while (error = true) {
                try {//es para que introduzcan un numero si o si
                    System.out.println("introduce un número, prueba suerte");// pido un número
                    numero = entrada.nextInt();//introduce un numero por teclado
                    for (int i = 0; i < 9; i++) {//se hace un bucle para que pueda escribir 10 veces si el numero aleatorio no es acertado
                        if (numeroaleatorio == numero) {
                            System.out.println("has acertado el numero aleatorio" + numero);//si el número aleatorio es acertado, te imprime esto en pantalla
                        } else {
                            System.out.println("no has tenido suerte, prueba con otro numero, tienes " + intentos--);//si el número no es acertado, imprime que vuelva a probar y los intentos que te quedan
                            numero = entrada.nextInt();
                        }
                    }break;
                } catch (InputMismatchException e1) {
                    System.out.println("has introducido un caracter mal, introduce un numero" + e1);//esto es cuando escribes un texto en vez de un número y te pide que introduzcas un número
                    entrada.nextLine();
                }
            }System.out.println("has perdido todas las oportunidades, otro dia será");//imprime el texto al acabar los 10 intentos y estan todos fallados

        }
    }
