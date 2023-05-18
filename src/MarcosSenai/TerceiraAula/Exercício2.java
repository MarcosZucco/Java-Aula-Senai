package zucco.marcos.TerceiraAula;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é sua massa");
        double n1 = scanner.nextDouble();

        System.out.println("Qual é sua altura");
        double n2 = scanner.nextDouble();

        double soma = n1 / (n2 * 2);

        System.out.printf("O seu IMC é: %.2f " , soma);

        if (soma < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (soma >= 18.5 && soma <= 25) {
            System.out.println("Você está no peso ideal.");
        } else {
            System.out.println("Você está acima do peso." );
        }


    }
}
