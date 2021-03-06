package listadois;

import java.util.Scanner;

public class ListaDoisExercicioNove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
         * Crie um programa que receba a altera e o peso9 e calcule o IMC:
         *        IMC        |  Classificação
         *  ---------------- | ----------------
         * Abaixo de 18,5    | Abaixo do peso9 
         * Entre 18,6 e 24,9 | peso9 Ideal
         * Entre 25,0 e 29,9 | Levemente acima do peso9
         * Entre 30,0 e 34,9 | Obesidade Grau I
         * Entre 35,0 e 39,9 | Obesidade Grau II
         * Acima de 40       | Obesidade Grau III (mórbida)
         */

        float peso9, altura9, imc9;

        System.out.println("\nDigite o peso (Kg): ");
        peso9 = entrada.nextFloat();
        System.out.println("Digite a Altura (Mt) ");
        altura9 = entrada.nextFloat();

        imc9 = (peso9) / (altura9 * altura9);
        System.out.println("SEU IMC É: " + imc9 + " %");

        if (imc9 < 16.99) {
            System.out.println("====================");
            System.out.println("MUITO ABAIXO DO PESO");
            System.out.println("====================");
        } else if ((imc9 >= 17) && (imc9 <= 18.60)) {
            System.out.println("==============");
            System.out.println("ABAIXO DO PESO");
            System.out.println("==============");
        } else if ((imc9 >= 18.61) && (imc9 <= 24.99)) {
            System.out.println("==========");
            System.out.println("PESO IDEAL");
            System.out.println("==========");
        } else if ((imc9 >= 25) && (imc9 <= 29.99)) {
            System.out.println("=============");
            System.out.println("ACIMA DO PESO");
            System.out.println("=============");
        } else if ((imc9 >= 30) && (imc9 <= 34.99)) {
            System.out.println("================");
            System.out.println("OBESIDADE GRAU I");
            System.out.println("================");
        } else if ((imc9 >= 35) && (imc9 <= 39.99)) {
            System.out.println("==========================");
            System.out.println("OBESIDADE MODERADA GRAU II");
            System.out.println("==========================");
        } else if (imc9 >= 40) {
            System.out.println("==========================");
            System.out.println("OBESIDADE MÓRBIDA GRAU III");
            System.out.println("==========================");
        }
        entrada.close();
    }
}
