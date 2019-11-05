package listadois;

import java.util.Scanner;

public class ListaDoisExercicioOito {
    public static void main(String[] args) {
        Scanner ent8 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
         * Crie um programa que receba um valor e imprima o fatorial desse número. Ex.:
         * 3! = 3 x 2 x 1 = 6.
         */
        int fat8 = 1;
        int valor8;

        System.out.println("\nInforme o Valor: ");
        valor8 = ent8.nextInt();

        for (double i = 2; i <= valor8; i++) {
            fat8 *= i;
        }

        System.out.println("O FATORIAL DE " + valor8 + " É IGUAL A " + fat8);
        ent8.close();
    }
}
