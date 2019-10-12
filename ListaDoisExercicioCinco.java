package exerciciosdois;

import java.util.Scanner;

public class ListaDoisExercicioCinco {
    public static void main(String[] args) {
        Scanner ent5 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio5 - STRING LETRA POR LETRA
        Crie um programa que receba uma String e imprima linha a linha suas letras.
        */

        System.out.println("Informe a Palavra: ");
        String palavra5 = ent5.nextLine();

        for (int i = 0; i < palavra5.length(); i++) {
            System.out.println("Palavra :" + palavra5.charAt(i));
        }
        ent5.close();
    }
}
