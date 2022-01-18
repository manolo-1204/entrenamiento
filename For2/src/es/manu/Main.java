package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Hasta que número quieres sumar? ");
        n = entrada.nextInt();

        for(int i = 0; i < n; i++) {
            num += (i + 1);
            System.out.println("El resultado es " + num);
        }
        //System.out.println("El resultado es " + num);
    }
}
