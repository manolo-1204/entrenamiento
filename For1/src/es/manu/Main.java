package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        num = entrada.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.println(i + 1);
        }
    }
}

