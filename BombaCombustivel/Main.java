package BombaCombustivel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.00, 1000);

        System.out.println("Escolha a forma de abastecimento: ");
        System.out.println("1 - Abastecer por valor");
        System.out.println("2 - Abastecer por litros");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Informe o valor que deseja abastecer: ");
            double valor = scanner.nextDouble();
            bomba.abastecerPorValor(valor);
        } else if (escolha == 2) {
            System.out.println("Informe a quantidade de litros que deseja abastecer: ");
            double litros = scanner.nextDouble();
            bomba.abastecerPorLitro(litros);
        }

        System.out.println("Combustível restante na bomba: " + bomba.getQuantidadeCombustivel() + " litros.");
        scanner.close();
    }
}
