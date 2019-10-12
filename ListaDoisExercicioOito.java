package exerciciosdois;

import java.util.Scanner;

public class ListaDoisExercicioOito {
    public static void main(String[] args) {
        Scanner ent8 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio8 - FATORIAL DO VALOR INSERIDO
        Crie um programa que receba um valor e imprima o fatorial desse número.
        Ex.: 3! = 3 x 2 x 1 = 6.
        */

        int fat8 = 1;
        int valor8;

        System.out.println("Informe o Valor: ");
        valor8 = ent8.nextInt();

        for (int i = 2; i <= valor8; i++) {
            fat8 *= i;
        }

        System.out.println("O Fatorial de " + valor8 + " é igual a " + fat8);
        ent8.close();
    }
}
