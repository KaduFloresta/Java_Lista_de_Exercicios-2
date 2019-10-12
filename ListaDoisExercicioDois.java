package listadois;
import java.util.Scanner;

public class ListaDoisExercicioDois {
    public static void main(String[] args)
    {
    Scanner ent2 = new Scanner(System.in);
    System.out.println("Kadu Floresta");
        
    /*
    Exercicio2 - NUMERO e NOME do MÊS
    Crie um programa que receba um número e indique o mês que representa.
    */	
        
    int mes2;
    System.out.println("Digite o número do mês: ");
    mes2 = ent2.nextInt();
        
        if (mes2 <1 || mes2 >12) {
            System.out.println("ESSE MÊS NÃO EXISTE!!!");
        }
        else if (mes2 == 1) {
            System.out.println("1 = JANEIRO!");
        }
        else if(mes2 == 2) {
            System.out.println("2 = FEVEREIRO!");
        }
        else if (mes2 == 3) {
            System.out.println("3 = MARÇO!");
        }
        else if (mes2 == 4) {
            System.out.println("4 = ABRIL!");
        }
        else if (mes2 == 5) {
            System.out.println("5 = MAIO!");
        }
        else if (mes2 == 6) {
            System.out.println("6 = JUNHO!");
        }
        else if (mes2 == 7) {
            System.out.println("7 = JULHO!");
        }
        else if (mes2 == 8) {
            System.out.println("8 = AGOSTO!");
        }
        else if (mes2 == 9) {
            System.out.println("9 = SETEMBRO!");
        }
        else if (mes2 == 10) {
            System.out.println("10 = OUTUBRO!");
        }
        else if (mes2 == 11) {
            System.out.println("11 = NOVEMBRO!");
        }
        else if (mes2 == 12) {
            System.out.println("12 = DEZEMBRO!");
        }        
    ent2.close();
    }
    
}

