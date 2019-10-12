package exerciciosdois;

import java.util.Scanner;

public class ListaDoisExercicioQuatro {
    public static void main(String[] args) {
        Scanner ent4 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio4 - TABUADA INICIO e FIM
        Crie um programa que imprima a tabuada.
        */

        int Num; // Valor da Variável
        int inicio, fim;

        System.out.println("Informe a Tabuada: ");
        Num = ent4.nextInt();
        System.out.println("Informe o inicio da tabuada: ");
        inicio = ent4.nextInt();
        System.out.println("Informe o fim da tabuada: ");
        fim = ent4.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.println(" " + Num + " x " + i + " = " + Num * i);
        }
        ent4.close();
    }

}
