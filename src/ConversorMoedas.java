import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoConversor service = new ServicoConversor();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione a opção de conversão:");
            System.out.println("1. Real para Dollar");
            System.out.println("2. Dollar para Real");
            System.out.println("3. Euro para Dollar");
            System.out.println("4. Real para Euro");
            System.out.println("5. Peso Argentino para Real");
            System.out.println("6. Real para Peso Argentino");
            System.out.println("7. Iene Japonês para Real");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o programa.");
                continuar = false;
                break;
            }

            System.out.print("Informe o valor para conversão: ");
            double valor = scanner.nextDouble();

            switch (opcao) {
                case 1 -> service.converter("BRL", "USD", valor);
                case 2 -> service.converter("USD", "BRL", valor);
                case 3 -> service.converter("EUR", "USD", valor);
                case 4 -> service.converter("BRL", "EUR", valor);
                case 5 -> service.converter("ARS", "BRL", valor);
                case 6 -> service.converter("BRL", "ARS", valor);
                case 7 -> service.converter("JPY", "BRL", valor);
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Conversão Feita!");
            break;
        }

        scanner.close();
    }
}
