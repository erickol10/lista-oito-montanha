public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Getters e Setters para os atributos

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
