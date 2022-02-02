package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número positivo: ");
        num = entrada.nextInt();

        while (num < 0) {
            System.out.println("No no, " + num + " no es un número positivo");
            System.out.print("Dame un número positivo: ");
            num = entrada.nextInt();
        }
        System.out.println("Mu bien " + num + " es un número positivo");
    }
}
