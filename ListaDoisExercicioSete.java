package listadois;

import java.util.Scanner;

public class ListaDoisExercicioSete {
    public static void main(String[] args) {
        Scanner ent7 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
         * Crie um programa que tenha como entrada as notas de um aluno. Somente se
         * encerrará quando for inserida uma nota negativa. Ao final deverá informar a
         * média das notas.
         */

        int cont7 = 0;
        double nota7;
        double soma7 = 0;

        do {
            System.out.println("\nInforme a Nota " + (cont7 + 1));
            nota7 = ent7.nextDouble();

            if (nota7 >= 0) { // >0 = Continua o laço...
                soma7 += nota7;
                cont7++;
            }
        } while (nota7 >= 0); // <0 = Encerra o laço...

        System.out.println("A MÉDIA É: " + (soma7 / cont7));
        ent7.close();
    }
}
