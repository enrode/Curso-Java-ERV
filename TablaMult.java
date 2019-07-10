package Clase8;

import java.util.Scanner;

public class TablaMult {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int x = S.nextInt();

        System.out.println("Tabla de Multiplicar del: " + x);

        for (int i = 1; i <= 10;) {
            int y = x * i;
            System.out.println(x + " X " + i + " = " + y);
            i = ++i;
        }
    }
}
