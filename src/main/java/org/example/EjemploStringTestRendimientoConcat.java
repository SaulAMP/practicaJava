package org.example;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder stringBuilder = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
//           c = c.concat(a).concat(b).concat("\n");
//            c += a + b +"\n";
//            stringBuilder.append(a).append(b).append("\n");
        }


        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("stringBuilder = " + stringBuilder.toString());
    }
}
