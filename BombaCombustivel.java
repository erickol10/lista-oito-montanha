import java.util.Scanner;

class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecimento concluído. Foram colocados " + litrosAbastecidos + " litros no veículo.");
        } else {
            System.out.println("Não há combustível suficiente na bomba para abastecer essa quantidade.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecimento concluído. Valor a ser pago: R$" + valorPagar);
        } else {
            System.out.println("Não há combustível suficiente na bomba para abastecer essa quantidade.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
        System.out.println("Valor do litro de combustível alterado para R$" + novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
        System.out.println("Tipo de combustível alterado para " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
        System.out.println("Quantidade de combustível restante na bomba alterada para " + novaQuantidade + " litros");
    }
}

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.5, 1000);

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar valor do litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Alterar quantidade de combustível na bomba");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser abastecido: ");
                    double valorAbastecer = scanner.nextDouble();
                    bomba.abastecerPorValor(valorAbastecer);
                    break;
                case 2:
                    System.out.print("Digite a quantidade em litros de combustível a ser abastecida: ");
                    double litrosAbastecer = scanner.nextDouble();
                    bomba.abastecerPorLitro(litrosAbastecer);
                    break;
                case 3:
                    System.out.print("Digite o novo valor do litro de combustível: ");
                    double novoValor = scanner.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Digite o novo tipo de combustível: ");
                    String novoCombustivel = scanner.next();
                    bomba.alterarCombustivel(novoCombustivel);
                    break;
                case 5:
                    System.out.print("Digite a nova quantidade de combustível na bomba: ");
                    double novaQuantidade = scanner.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
