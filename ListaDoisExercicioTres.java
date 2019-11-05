package listadois;

import java.util.Scanner;

public class ListaDoisExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
         * Exercicio3 - FORCA
         * 
         * Crie um programa que simule um jogo da forca, com a entrada da palavra
         * oculta, a quantidade de tentativas para acerto e depois solicite a entrada da
         * palavra. A cada erro deve imprimir a quantidade de tentativas
         */

        System.out.println("\n::: Jogo da Forca :::\nConfigurando...\n\nDigite a Palavra-Chave:");
        String palavraOculta = scanner.next();
        int tentativas = 6;

        for (int contador = 0; contador < tentativas; contador++) {
            System.out.println("Digite a Palavra: ");
            String resposta = scanner.next();

            if (palavraOculta.equals(resposta)) {
                System.out.printf("Você Ganhou!!!");
                System.out.printf("Acertou na Tentativa: " + contador + 1);
                break;
            } else {
                System.out.println("Você Errou! Tem Ainda " + (tentativas - (contador + 1)));

                switch (contador) {
                case 0:
                    System.out.println(" ____");
                    System.out.println("|    :");
                    System.out.println("|    :");
                    System.out.println("|    O ");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 1:
                    System.out.println(" ____");
                    System.out.println("|    :");
                    System.out.println("|    :");
                    System.out.println("|    O ");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 2:
                    System.out.println(" ____");
                    System.out.println("|    :");
                    System.out.println("|    :");
                    System.out.println("|    O ");
                    System.out.println("|  --|");
                    System.out.println("|    | ");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 3:
                    System.out.println(" ____");
                    System.out.println("|    :");
                    System.out.println("|    :");
                    System.out.println("|    O ");
                    System.out.println("|  --|--");
                    System.out.println("|    | ");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 4:
                    System.out.println(" ____");
                    System.out.println("|    :");
                    System.out.println("|    :");
                    System.out.println("|    O ");
                    System.out.println("|  --|--");
                    System.out.println("|    | ");
                    System.out.println("|   |");
                    System.out.println("|");
                    break;
                case 5:
                    System.out.println(" ____");
                    System.out.println("|    :");
                    System.out.println("|    :");
                    System.out.println("|    O ");
                    System.out.println("|  --|--");
                    System.out.println("|    | ");
                    System.out.println("|   | |");
                    System.out.println("|");
                    break;
                }

                if (contador + 1 == tentativas) {
                    System.out.println("\n==================================");
                    System.out.println("       VOCÊ ERROU!!! " + contador + " VEZES");
                    System.out.println("==================================");
                    System.out.println("VOCÊ PERDEU! FIM DO JOGO, LOSER!!!");
                    System.out.println("==================================");
                }
            }

        }
        scanner.close();
    }
}
