package listadois;

import java.util.HashMap;
import java.util.Scanner;

public class ListaDoisExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kadu Floresta\n");

        /*
         * Exercicio2 - NUMERO MÊS X NOME 2) Crie um programa que receba um número e
         * indique o mês que representa.
         */

        HashMap<Integer, String> mes2 = new HashMap<>();

        mes2.put(1, "1 = JANEIRO!");
        mes2.put(2, "2 = FEVEREIRO!");
        mes2.put(3, "3 = MARÇO!");
        mes2.put(4, "4 = ABRIL!");
        mes2.put(5, "5 = MAIO!");
        mes2.put(6, "6 = JUNHO!");
        mes2.put(7, "7 = JULHO!");
        mes2.put(8, "8 = AGOSTO!");
        mes2.put(9, "9 = SETEMBRO!");
        mes2.put(10, "10 = OUTUBRO!");
        mes2.put(11, "11 = NOVEMBRO!");
        mes2.put(12, "12 = DEZEMBRO!");

        System.out.println("Digite o Número do Mês: ");
        int getValor = scanner.nextInt();
        System.out.println(mes2.get(getValor));

        scanner.close();
    }

}
