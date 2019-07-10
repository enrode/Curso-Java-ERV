package Clase8;

import java.util.Scanner;

public class Iniciales {

    public static void main(String[] args) {
        String Nombre;
        Scanner S = new Scanner(System.in);
        System.out.println("Introduzca su Nombre completo: ");
        Nombre = S.nextLine();
//        System.out.println("Su Nombre es: " + Nombre);
        String[] mlArray = Nombre.split(" ");
        String name1 = mlArray[0];
        String name2 = mlArray[1];
        String name3 = mlArray[2];
        String name4 = mlArray[3];
        System.out.println("Su nombre es: " + name1 + " " + name2 + " " + name3 + " " + name4);
        String ini1 = name1.substring(0, 1);
        String ini2 = name2.substring(0, 1);
        String ini3 = name3.substring(0, 1);
        String ini4 = name4.substring(0, 1);
        System.out.println("Sus iniciales son: " + ini1 + ini2 + ini3 + ini4);

    }

}
