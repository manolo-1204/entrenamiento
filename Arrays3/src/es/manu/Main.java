package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros1 = new int[5], numeros2 = new int[5];
        int contador = 0;
        boolean sonIguales = true;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros1.length; i++) {
            System.out.print("Dame el número " + (i + 1) + " para el primer array: ");
            numeros1[i] = entrada.nextInt();
        }
        System.out.println();

        for (int i = 0; i < numeros2.length; i++) {
            System.out.print("Dame el número " + (i + 1) + " para el segundo array: ");
            numeros2[i] = entrada.nextInt();
        }
        System.out.println();


        for (int i = 0; i < numeros1.length && sonIguales; i++) {
            sonIguales = numeros1[i] == numeros2[i];
        }

        if (sonIguales) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }

        entrada.close();
    }
}
