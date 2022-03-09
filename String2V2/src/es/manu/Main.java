package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico;
        char letrica;
        Boolean pertenece = false;
        Scanner entrada = new Scanner(System.in);

        System.out.println("dame un texto: ");
        textico = entrada.nextLine();

        System.out.println("dame una letrica: ");
        letrica = entrada.nextLine().charAt(0);

        for (int i = 0; i < textico.length() && !pertenece; i++) {
            if (textico.charAt(i) == letrica) {
                pertenece = true;
            }
        }
        if (pertenece) {
            System.out.println("buena esa pertenece");
        } else {
            System.out.println("panoli, no pertenece");
        }
    }
}
