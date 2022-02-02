package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int num;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Dame 1 numerito");
        num = entrada.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("el numero es par");
            } else {
                System.out.println("el numerito es impar");
            }
            System.out.println("Dame otro numerito (0 para terminar)");
            num = entrada.nextInt();
        }
    }
}
