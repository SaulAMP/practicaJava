package org.example;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Saul";

        System.out.println("nombre.length() = " + nombre.length());//sirve para mostrar la cantidad de letras en el string
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//pone en mayusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//pone en minusculas
        System.out.println("nombre.equals(\"Saul\") = " + nombre.equals("Saul")); //compata strinds sencible a mayusculas y minusculas
        System.out.println("nombre.equalsIgnoreCase(\"saul\") = " + nombre.equalsIgnoreCase("saul"));  // compara string ignorando mayusculas y minusvulas
        System.out.println("nombre.compareTo(\"Saul\") = " + nombre.compareTo("Saul")); // si el valor es cero significa que son iguales,y compara lexicograficamnete, returna un int
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));//imprime el caracter pocisionado en el valor que le dimos en los parentesis
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));//imprime el caracter pocisionado en el valor que le dimos en los parentesis
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));//imprime el caracter pocisionado en el valor que le dimos en los parentesis
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));//si adicionamos el length podemomos imprimir el careacter final restandole 1
        System.out.println("nombre.substring(1) = " + nombre.substring(1));//imprime apartir de la posicion la cual se marca en el parentesis
        System.out.println("nombre.substring(1) = " + nombre.substring(1,3));//imprime apartir de la posicion la cual se marca en el parentesis y hasta la opcion puesta despues de la coma

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));

}
}
