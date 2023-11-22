package org.example;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero :");
        int numUno = scanner.nextInt();

        System.out.println("Ingrese un segundo numero :");
        int numDos = scanner.nextInt();

        System.out.println("Ingrese un tercer numero :");
        int numTres = scanner.nextInt();

        System.out.println("Ingrese un cuarto numero :");
        int numCuatro = scanner.nextInt();

        max = (numUno > numDos)? numUno : numDos;
        max = (max > numTres)? max : numTres;
        max = (max > numCuatro)? max : numCuatro;

        System.out.println("numUno = " + numUno);
        System.out.println("numDos = " + numDos);
        System.out.println("numTres = " + numTres);
        System.out.println("numCuatro = " + numCuatro);

        System.out.println("El numero mayor es : " + max);


    }
}
