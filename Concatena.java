
package Clase8;

public class Concatena {

    public static void main(String[] args) {

        int a = 5, b = 10;

        String hola = "¡HOLA ";
        String mundo = "MUNDO!";
        String conct = hola.concat(mundo);
        String conct2 = hola + mundo;

        System.out.println("Forma de Concatenar 1: " + hola + mundo);
        System.out.println("Forma de Concatenar 2: " + hola + "Mundo!");
        System.out.println("Forma de Concatenar 3: " + conct);
        System.out.println("Forma de Concatenar 4: " + conct2);

    }

}
