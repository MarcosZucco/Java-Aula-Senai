package zucco.marcos.QuartaAula;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("----------Cardápio----------");
        System.out.println("Especificação        Preço unitário");
        System.out.println("100 Cachorro quente       1,10");
        System.out.println("101 Bauro simples         1,30");
        System.out.println("102 Bauru c/ovo           1,50");
        System.out.println("103 Hamburguer            1,10");
        System.out.println("104 Cheeseburger          1,30");
        System.out.println("105 Refrigerante          1,00");

        System.out.print("Escreva o número do seu pedido: ");
        int opcao = scanner.nextInt();

        System.out.println("Quantos você deseja comprar: ");
        int qtd = scanner.nextInt();

        double valorTotal = 0;

        switch (opcao){
            case 100:
              valorTotal = 1.10  * qtd;
                System.out.println("Aqui está o valor total: " + valorTotal + " R$");
                break;

            case 101:
                valorTotal = 1.30 * qtd;
                System.out.println(" Aqui está o valor total: " + valorTotal + " R$");
                break;

            case 102:
                valorTotal = 1.50 * qtd;
                System.out.println("Aqui está o valor total: " + valorTotal + " R$");
                break;

            case 103:
                 valorTotal = 1.10 * qtd;
                System.out.println("Aqui está o valor total: " + valorTotal + " R$");
                break;

            case 104:
                valorTotal = 1.30 * qtd;
                System.out.println("Aqui está o valor total: " + valorTotal + " R$");
                break;

            case 105:
                valorTotal = 1.00 * qtd;
                System.out.println("Aqui está o valor total: " + valorTotal + " R%");
                break;

            default:
                System.out.println("Número inválido");

        }






    }
}
