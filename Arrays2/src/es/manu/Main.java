package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] elementos = new int[10];
        int numero, repetidos = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cargando numeritos...");
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = (int) (Math.random() * 10) + 1 ;
        }
        System.out.println();

        System.out.print("Escribe un número: ");
        numero = entrada.nextInt();

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == numero) repetidos++;
        }

        if (repetidos == 1) {
            System.out.println("El número " + numero + " está repetio una ve, mira mira");
        } else {
            System.out.println("El número " + numero + " está repetio " + repetidos + " vece, mira mira");
        }

        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }

        entrada.close();
    }
}
