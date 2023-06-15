public class Carro {
    private double consumo;
    private double combustivel;

    public Carro(double consumo) {
        this.consumo = consumo;
        this.combustivel = 0;
    }

    public void andar(double distancia) {
        double combustivelNecessario = distancia / this.consumo;
        if (combustivelNecessario <= this.combustivel) {
            this.combustivel -= combustivelNecessario;
            System.out.println("O carro percorreu " + distancia + " quilômetros.");
        } else {
            System.out.println("Não há combustível suficiente para percorrer essa distância.");
        }
    }

    public double obterGasolina() {
        return this.combustivel;
    }

    public void adicionarGasolina(double quantidade) {
        this.combustivel += quantidade;
    }

    public static void main(String[] args) {
        Carro meuFusca = new Carro(15);             // 15 quilômetros por litro de combustível.
        meuFusca.adicionarGasolina(20);             // abastece com 20 litros de combustível.
        meuFusca.andar(100);                        // anda 100 quilômetros.
        System.out.println("Combustível restante: " + meuFusca.obterGasolina() + " litros.");
    }
}
