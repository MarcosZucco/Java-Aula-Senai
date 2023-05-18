package zucco.marcos.segundaula;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escreva o ano do seu nascimento: ");
        double n1 = scanner.nextDouble();

        System.out.println("Em qual ano você está?: ");
        double n2 = scanner.nextDouble();

        double ano = n2 - n1;

        System.out.println("A sua idade é: " + ano + " anos");



    }


}
