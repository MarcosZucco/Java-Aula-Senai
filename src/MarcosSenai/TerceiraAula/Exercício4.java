package zucco.marcos.TerceiraAula;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual foi a sua média esse ano: ");
        int media = scanner.nextInt();

        if (media < 3) {
            System.out.println("Seu conceito é: E ");
        } else if (media == 3 || media <= 5) {
            System.out.println(" Seu Conceito é: D");
        } else if (media == 6 || media == 7 ) {
            System.out.println("Seu Conceito é: C");
        } else if (media == 8 || media == 9) {
            System.out.println("Seu Conceito é: B");
        } else if ( media == 10) {
            System.out.println("Seu conceito é: A");
        } else {
            System.out.println("Tentativa inválida");
        }

    }
}
