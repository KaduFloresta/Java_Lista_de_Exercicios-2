package exerciciosdois;

import java.util.Scanner;

public class ListaDoisExercicioNove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio9 - CALCULO DO IMC
        Crie um programa que receba a altera e o peso e calcule o IMC:

        GABARITO
        IMC               | Classificação
        ----------------- | ----------------
        Abaixo de 18,5    | Abaixo do peso9 
        Entre 18,6 e 24,9 | peso9 Ideal
        Entre 25,0 e 29,9 | Levemente acima do peso9
        Entre 30,0 e 34,9 | Obesidade Grau I
        Entre 35,0 e 39,9 | Obesidade Grau II
        Acima de 40       | Obesidade Grau III (mórbida)
         */

        float peso9, altura9, imc9;

        System.out.println("Digite o peso9 (Kg): ");
        peso9 = entrada.nextFloat();
        System.out.println("Digite a Altura (Mt) ");
        altura9 = entrada.nextFloat();

        imc9 = (peso9) / (altura9 * altura9);
        System.out.println("SEU IMC É: " + imc9 + " %");

            if (imc9 < 16.99) {
                System.out.println("MUITO ABAIXO DO PESO");
            } else if ((imc9 >= 17) && (imc9 <= 18.60)) {
                System.out.println("ABAIXO DO PESO");
            } else if ((imc9 >= 18.61) && (imc9 <= 24.99)) {
                System.out.println("PESO IDEAL");
            } else if ((imc9 >= 25) && (imc9 <= 29.99)) {
                System.out.println("ACIMA DO PESO");
            } else if ((imc9 >= 30) && (imc9 <= 34.99)) {
                System.out.println("OBESIDADE GRAU I");
            } else if ((imc9 >= 35) && (imc9 <= 39.99)) {
                System.out.println("OBESIDADE MODERADA GRAU II");
            } else if (imc9 >= 40) {
                System.out.println("OBESIDADE MÓRBIDA GRAU III");
            }
        entrada.close();
    }
}
