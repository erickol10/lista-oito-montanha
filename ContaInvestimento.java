public class ContaInvestimento {
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void adicioneJuros() {
        double juros = this.saldo * this.taxaJuros / 100;
        this.saldo += juros;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        ContaInvestimento poupanca = new ContaInvestimento(1000.00, 10.0);
        for (int i = 1; i <= 5; i++) {
            poupanca.adicioneJuros();
            System.out.println("Saldo após o juros " + i + ": R$" + poupanca.getSaldo());
        }
    }
}
