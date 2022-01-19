package es.manu;

import java.util.Scanner;

public class Main {
    // 1409286144
    public static void main(String[] args) {
        int n;
        long num = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿De qué número quieres que haga el factorial?: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            num *= i;
        }

        System.out.println(num);
    }
}
