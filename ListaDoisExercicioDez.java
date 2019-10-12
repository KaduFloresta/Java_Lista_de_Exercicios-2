package exerciciosdois;

import java.util.Scanner;

public class ListaDoisExercicioDez {
    public static void main(String[] args) {
        Scanner entrada10 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio10 - 4 OPERAÇÕES MATEMÁTICAS
        Crie um programa que receba dois valores e solicite a operação
        a ser realizada (+ - * /). Ao final imprima o resultado.
        */

        int valorA = 0, valorB = 0;
        int adicao, subtracao;
        int multiplicacao, divisao;
        int menu = 0;

        System.out.println("Informe o primeiro valor");
        valorA = entrada10.nextInt();
        System.out.println("Informe o segundo valor");
        valorB = entrada10.nextInt();

        do {
            System.out.println("DIgite: 1 para Adição");
            System.out.println("        2 para Subtração");
            System.out.println("        3 para Multiplicação");
            System.out.println("        4 para Divisão ");
            menu = entrada10.nextInt();
            switch (menu) {
            case 1:
                adicao = (valorA + valorB);
                System.out.println("\n" + valorA + " + " + valorB + " = " + adicao);
                break;

            case 2:
                subtracao = (valorA - valorB);
                System.out.println(+valorA + " - " + valorB + " = " + subtracao);
                ;
                break;

            case 3:
                multiplicacao = (valorA * valorB);
                System.out.println(+valorA + " * " + valorB + " = " + multiplicacao);
                break;

            case 4:
                divisao = (valorA / valorB);
                System.out.println(+valorA + " / " + valorB + " = " + divisao);
                break;

            default:
                System.out.println("Você digitou um comando inválido!!!");
                break;

            case 5:
                System.exit(0);
                break;
            }
        } while (menu != 5);
        entrada10.close();
    }
}
