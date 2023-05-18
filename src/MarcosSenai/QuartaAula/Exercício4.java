package zucco.marcos.QuartaAula;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N°  Planeta   Gravidade Relativa");
        System.out.println("1   Mercúrio  0,37");
        System.out.println("2   Vênus     0,88");
        System.out.println("3   Marte     0,38");
        System.out.println("4   Júpiter   2,64");
        System.out.println("5   Saturno   1,15");
        System.out.println("6   Urano     1,17");

        System.out.print("Qual é seu peso: ");
        int n1 = scanner.nextInt();

        System.out.print("Escolha uma opção na tabela acima para descobrir seu peso lá: ");

        int opcao = scanner.nextInt();

        double valorTotal =  0;

        switch (opcao) {

            case 1:
                valorTotal = (n1 / 10) * 0.37;
                System.out.println("Esse é seu peso no planeta: " + valorTotal);
                break;

            case 2:
                valorTotal = (n1 / 10) * 0.88;
                System.out.println("Esse é seu peso no planeta: " + valorTotal);
                break;

            case 3:
                valorTotal = (n1 / 10) * 0.38;
                System.out.println("Esse é seu peso no planeta: " + valorTotal);
                break;

            case 4:
                valorTotal = (n1 / 10) * 2.64;
                System.out.println("Esse é seu peso no planeta: " + valorTotal);
                break;

            case 5:
                valorTotal = (n1 / 10) * 1.15;
                System.out.println("Esse é seu peso no planeta: " + valorTotal);
                break;

            case 6:
                valorTotal = (n1 / 10) * 1.17;
                System.out.println("Esse é seu peso no planeta: " + valorTotal);
                break;

        }








    }
}
