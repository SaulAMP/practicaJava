package org.example;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        /*String variable = 7 == 7 ? "es verdadero" : "es falso";
        System.out.println("variable = " + variable);*/
         /* estado = promedio >= 5.49 ? "Aprobado":"Perdiste";
        System.out.println("promedio = " + promedio);*/

        String estado = "";
        double promedio = 0.0 ;



        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Nota de matematicas : ");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la Nota de ciencias : ");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la Nota de historia : ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;

        estado = promedio >= 3.0 ? "Felicitaciones Aprovaste" : "Perdiste repite nuevamente!";

        System.out.println(estado.concat(" tu calificacion promedio fue " + promedio));



    }
}
