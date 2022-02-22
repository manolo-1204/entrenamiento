package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] elementos = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Dame un numerito (" + (i + 1) + "): ");
            elementos[i] = entrada.nextInt();
        }
        System.out.println();

        System.out.println("Estos son los números que me has dado: ");
        for (int i = 0; i < elementos.length; i++) {
            if (elementos.length - i == 1) {
                System.out.print(" y " + elementos[i] + ".");
            } else if (elementos.length - i == 2){
                System.out.print(elementos[i]);
            } else {
                System.out.print(elementos[i] + ", ");
            }
        }

        entrada.close();
    }
}
