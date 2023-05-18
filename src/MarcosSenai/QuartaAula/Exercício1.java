package zucco.marcos.QuartaAula;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu sexo?");
        System.out.print("Selecione: (1) Para Masculino ou (2) para Feminino: ");
        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                opcao = 1;
                System.out.println("O seu sexo foi registrado como Masculino!");
                break;

            case 2:
                    opcao = 2;
                    System.out.println("O seu sexo foi registrado como Feminino");
                    break;

        }

        if(opcao < 1 || opcao > 2){
            System.out.println("Sexo inválido");
        }


    }
}
