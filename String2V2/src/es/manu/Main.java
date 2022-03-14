package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico;
        char letrica;
        boolean pertenece = false;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un texto: ");
        textico = entrada.nextLine();

        System.out.print("Dame una letrica: ");
        letrica = entrada.nextLine().charAt(0);

        for (int i = 0; i < textico.length() && !pertenece; i++) {
            if (textico.toLowerCase().charAt(i) == letrica) {
                System.out.print(textico.charAt(i));
            } else if (textico.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print("_");
            }
        }
    }
}
