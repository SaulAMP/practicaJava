package org.example;

import java.util.Scanner;

public class ProgramaManejoNombres {
    public static void main(String[] args) {
        String nombreUno,nombreDos,nombreTres;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre?");
        nombreUno = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre?");
        nombreDos = scanner.nextLine();
        System.out.println("Ingrese el tercer nombre?");
        nombreTres = scanner.nextLine();

        String tresNombres = nombreUno.toUpperCase().charAt(1)+"."+nombreUno.substring(nombreUno.length()-2)+"_"+
                nombreDos.toUpperCase().charAt(1)+"."+nombreDos.substring(nombreDos.length()-2)+"_"+
                nombreTres.toUpperCase().charAt(1)+"."+nombreTres.substring(nombreTres.length()-2);
        System.out.println(tresNombres);

    }
}
