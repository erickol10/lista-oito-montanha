import java.util.Scanner;

class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimirPonto() {
        System.out.println("Coordenadas do Ponto: (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Retangulo {
    private Ponto pontoInicial;
    private int largura;
    private int altura;

    public Retangulo(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto encontrarCentro() {
        int centroX = pontoInicial.getX() + (largura / 2);
        int centroY = pontoInicial.getY() + (altura / 2);
        return new Ponto(centroX, centroY);
    }

    public void imprimirCentro() {
        Ponto centro = encontrarCentro();
        System.out.println("Centro do Retângulo: (" + centro.getX() + ", " + centro.getY() + ")");
    }

    public void alterarRetangulo(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ponto pontoInicial = new Ponto(0, 0);
        Retangulo retangulo = new Retangulo(pontoInicial, 5, 3);

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Alterar valores do retângulo");
            System.out.println("2 - Imprimir centro do retângulo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite as coordenadas do ponto inicial (x, y): ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    pontoInicial = new Ponto(x, y);
                    System.out.print("Digite a largura do retângulo: ");
                    int largura = scanner.nextInt();
                    System.out.print("Digite a altura do retângulo: ");
                    int altura = scanner.nextInt();
                    retangulo.alterarRetangulo(pontoInicial, largura, altura);
                    break;
                case 2:
                    retangulo.imprimirCentro();
                    break;
                case 3:
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
