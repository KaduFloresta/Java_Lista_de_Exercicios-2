package listadois;

import java.util.Scanner;

public class ListaDoisExercicioDesafio {
    public static void main(String[] args) {
        Scanner Des4 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
         * ExercicioDesafio - DESAFIO TROCO 4 Crie um programa que receba um valor em
         * reais e determine qual o mínimo de notas necessárias para entregá-lo. <br>
         * Notas: R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$
         * 10 e 1 nota de R$ 5**
         */

        System.out.println("Informe o Valor: ");
        int valorD = Des4.nextInt();

        int notaD = 0;
        int valorND = 0;
        int qtdeND = 0;
        String msg = "";

        while (valorD != 0) {
            if (notaD == 0) {
                valorND = 100;
            } else if (notaD == 1) {
                valorND = 50;
            } else if (notaD == 2) {
                valorND = 10;
            } else if (notaD == 3) {
                valorND = 5;
            } else {
                valorND = 1;
            }
            qtdeND = valorD / valorND;

            if (qtdeND != 0) {
                if (msg.length() > 0) {
                    msg += " e ";
                }
                msg += qtdeND + " notas(s) de R$ " + valorND;
                valorD = valorD % valorND;
            }
            notaD++;
        }
        System.out.println(msg);
        Des4.close();
    }

}