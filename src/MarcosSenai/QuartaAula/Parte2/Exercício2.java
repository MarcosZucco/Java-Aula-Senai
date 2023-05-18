package zucco.marcos.segundaula.Parte2;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Escreva o segundo número: ");
        double n2 = scanner.nextDouble();



        System.out.println(" Digite qual operação você deseja realizar : (1 - Soma) (2 - Subtração) (3 - Multiplicação) (4 - Divisão)");
        int cal = scanner.nextInt();

        double soma = 0;

        if (cal == 1){

            soma = n1 + n2;
            System.out.println("A soma é: " + soma);

        } else if (cal == 2) {

            soma = n1 - n2;

            System.out.println("A Subtração é: " + soma);

        } else if (cal == 3) {

            soma = n1 * n2;
            System.out.println("A multiplicação é: " + soma);

        } else if (cal == 4) {
            soma = n1 % 2;
            System.out.println("A divisão é: " + soma);

        }

    }
}
