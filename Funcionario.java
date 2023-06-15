public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2000.0);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$" + funcionario.getSalario());
    }
}
