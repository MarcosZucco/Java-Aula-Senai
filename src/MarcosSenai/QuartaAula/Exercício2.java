package zucco.marcos.QuartaAula;

import java.util.Locale;
import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Qual é o seu salário: ");
        double sal = scanner.nextDouble();

        System.out.println("Qual é seu nível?: (1) - (2) - (3)");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:

                sal = sal * 12;
                System.out.println("O Seu salário nível 1 é: " + sal);
                break;

            case 2:
                sal = sal * 17;
                System.out.println("O seu salário nível 2 é: " + sal);
                break;

            case 3:
                sal = sal * 25;
                System.out.println("O seu salário nível 3 é: " + sal);
                break;

            default:
                System.out.println("Algo de errado não está certo!");

        }

    }
}
