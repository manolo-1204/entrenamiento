package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, count = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un numerito entre 1 y 100: ");
            numero = entrada.nextInt();
        } while (numero < 1 || numero > 100);

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }

        entrada.close();
    }
}
