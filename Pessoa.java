public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;

        if (idade < 21) {
            crescer(0.5);
        }
    }

    public void engordar(double pesoGanho) {
        peso += pesoGanho;
    }

    public void emagrecer(double pesoPerdido) {
        peso -= pesoPerdido;
    }

    public void crescer(double alturaGanha) {
        altura += alturaGanha;
    }

    // Getters e Setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
