package zucco.marcos.segundaula.Parte2;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0){
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }


    }
}
