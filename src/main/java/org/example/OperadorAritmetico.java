package org.example;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5,j = 4,suma = i + j, resta = i - j,multiplicacion = i * j,resto = i % j;

        System.out.println("suma = "+suma);

        System.out.println("i + j = " + (i + j));

        System.out.println("resta = " + resta);
        System.out.println("(i -j) = " + (i -j));

        System.out.println("multiplicacion = " + multiplicacion);


        double divicion =(double) i / j;
        System.out.println("divicion = " + divicion);

        System.out.println("resto = " + resto);

    }
}
