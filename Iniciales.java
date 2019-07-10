
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
        String name = mlArray[0];
        String apellido1 = mlArray[1];
        String apellido2 = mlArray[2];
        System.out.println("Su nombre es: " + name + " "+ apellido1 + " " + apellido2);
        String ini1 = name.substring(0,1);
        String ini2 = apellido1.substring(0,1);
        String ini3 = apellido2.substring(0,1);
        System.out.println("Sus iniciales son: " + ini1+ini2+ini3);
               
    }
    
}
