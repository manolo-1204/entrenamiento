package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un número (- para parar): ");
            num = entrada.nextInt();
        } while (num >= 0);

        entrada.close();
    }
}
