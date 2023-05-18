package zucco.marcos.TerceiraAula;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        System.out.print("Escreva o quarto número: ");
        double n4 = scanner.nextDouble();

        double soma = (n1 + n2 + n3 + n4) / 4;

        if(soma > 6){
            System.out.println("Você está aprovado");
        } else if (5 <= soma) {
            System.out.println("Você está de recuperação");
        } else if (soma <= 4) {
            System.out.println("Você está reprovado");
        }


    }


}
