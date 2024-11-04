package org.example;

import java.util.Scanner;

public class Tema1 {
    public void aritmeticos() {

        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        String x = "Thank", y = "You";
        System.out.println("a + b = " + (a + b));// Operador + y -
        System.out.println("a - b = " + (a - b));// Operador + y -
        System.out.println("x + y = " + x + y); // El operador + si se usa con strings concatena las cadenas dadas.
        System.out.println("a * b = " + (a * b));// Operador * y /
        System.out.println("a / b = " + (a / b));// Operador * y /
        System.out.println("a % b = " + (a % b));// operador de módulo da el resto de dividir el primer operando con el segundo
        //System.out.println(a/c);// si el denominador es 0 en la división lanzaría una java.lang.ArithmeticException
    }

    public void asignacion() {
        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;
        c = b;// operador de asignación simple
        System.out.println("Valor de c = " + c);
        // Esta siguiente declaración arrojaría una exception porque el valor del operando derecho debe ser inicializado
        // antes de la asignación, entonces el programa no compila. c = d;
        a = a + 1;// operadores de asignación simples
        b = b - 1;// operadores de asignación simples
        e = e * 2;// operadores de asignación simples
        f = f / 2;// operadores de asignación simples
        System.out.println("a,b,e,f = " + a + "," + b + "," + e + "," + f);// operadores de asignación simples
        a += 1; // operados de asignación compuestos/cortos
        b -= 1; // operados de asignación compuestos/cortos
        e *= 2; // operados de asignación compuestos/cortos
        f /= 2; // operados de asignación compuestos/cortos
        System.out.println("a,b,e,f (usando operadores cortos)= " + a + "," + b + "," + e + "," + f);// operados de asignación compuestos/cortos
    }

    public void relacionales() {
        int a = 20, b = 10;
        String x = "Thank", y = "Thank";
        int ar[] = {1, 2, 3};
        int br[] = {1, 2, 3};
        boolean condicion = true;
        //varios operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));
        // Los Arrays no se pueden comparar con
        // operadores relacionales porque los objetos
        // almacenan referencias, mas no el valor
        System.out.println("x == y : " + (ar == br));
        System.out.println("condicion==true :" + (condicion == true));
    }

    public void logicos() {
        String x = "java";//variable con el nombre
        String y = "desdecero";//variable con el nombre
        Scanner s = new Scanner(System.in);//activamos el teclado
        System.out.print("Ingrese usuario:");//imprimimos el texto
        String usuario = s.next();//solicitamos que ingresen por teclado
        System.out.print("Ingrese contraseña:");//imprimimos el texto
        String contrasenya = s.next();//solicitamos que ingresen por teclado
        if ((usuario.equals(x) && contrasenya.equals(y)) || (usuario.equals(y) && contrasenya.equals(x))) {
            System.out.println("Bienvenido usuario.");// Verifique si el nombre de usuario y la contraseña coinciden o no.
        } else {
            System.out.println("usuario o contraseña son erroneos");//si no son correctos, imprimimos el texto
        }
    }
}


