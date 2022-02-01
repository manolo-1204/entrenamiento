package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner entrada = new Scanner(System.in);

        /*System.out.print("Dame un número: ");
        num = entrada.nextInt();

        while (num >= 0) {
            sum += num;
            System.out.print("Dame otro número: ");
            num = entrada.nextInt();
        }*/
        do {
            sum += num;
            System.out.print("Dame otro número: ");
            num = entrada.nextInt();
        } while (num >= 0);

        //sum -= num;
        System.out.println("Suma: " + sum);
    }
}
