package zucco.marcos.segundaula;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a base o triângulo: ");
        double b1 = scanner.nextDouble();

        System.out.println("Qual é a altura do triângulo: ");
        double a1 = scanner.nextDouble();

        double area = (b1 * a1) /2;

        System.out.println("A área do triângulo é: " + area);


    }
}
