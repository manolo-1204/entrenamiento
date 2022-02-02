package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = 0, suma = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            suma += numero;
            System.out.print("Dame un number (- para para): ");
            numero = entrada.nextInt();
        } while (numero >= 0);

        System.out.println(suma);

        entrada.close();
    }
}
