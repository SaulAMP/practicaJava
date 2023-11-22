package org.example;

import java.util.Scanner;

public class OperadoresLogicoLogin {
    public static void main(String[] args) {

        String [] usernames = {"saul","andres","liam"};
        String [] passwords = {"12345","1234567","123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario : ");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese la contrasena : ");
        String contrasena = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(usuario) && passwords[i].equals(contrasena)) {
                esAutenticado = true;
                break;
            }
        }if (esAutenticado) {
            System.out.println("Bienvenido " .concat(usuario).concat("!").concat(" has iniciado sesion correctamente."));
        }else {
            System.out.println("Usuario o Contrasena incorrecto!");
            System.out.println("Para poder ingresar intente nuevamente");
        }

    }
}
