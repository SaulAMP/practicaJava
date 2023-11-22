package org.example;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        //Esta instancia nos ayuda a saber si un objeto hereda o es hijo de una clase abstracta o interface

        String texto = "Creando un objeto de la clase String";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es de el tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es de el tipo Object? " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es de el tipo ------? g{" + b1);

        b1 = num instanceof Number;
        System.out.println("num es de el tipo String? " + b1);
    }
}
