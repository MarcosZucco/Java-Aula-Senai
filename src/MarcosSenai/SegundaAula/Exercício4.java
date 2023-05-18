package zucco.marcos.segundaula;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a temperatura em Fahrenheit: ");
        double F = scanner.nextDouble();

        double C = (5 * (F -32) / 9);

        System.out.println("A Temperatura em Fahrenheit é: " + F);
        System.out.println("A Temperatura em Celsius é: " + C);



    }

}
