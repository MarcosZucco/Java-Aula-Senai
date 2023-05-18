package zucco.marcos.TerceiraAula;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a sua idade: ");
        int i = scanner.nextInt();

        if (i > 18){
            System.out.println("Você está apto a tirar a carteira de motorista");
        } else if(i < 18){
            System.out.println("Você não está apto a tirar a carteira de motorista");
        }


    }
}
