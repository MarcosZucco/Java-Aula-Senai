package zucco.marcos.segundaula;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scanner.next();

        System.out.println("Escreva sua primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Escreva sua segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escreva sua terceira nota: ");
        double n3 = scanner.nextDouble();

        System.out.println("Escreva sua quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Essa é sua média" + media);


    }

}
