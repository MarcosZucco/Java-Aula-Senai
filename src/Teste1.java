import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        double n1 = scanner.nextByte();

        System.out.println("Digite o segundo número");
        double n2 = scanner.nextDouble();

        double valorTotal = n1 + n2;

        System.out.println("O resultado é: " + valorTotal);




    }
}
