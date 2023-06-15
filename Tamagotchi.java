public class Tamagotchi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagotchi(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.saude = 100;
        this.idade = 0;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        this.fome = novaFome;
    }

    public void alterarSaude(int novaSaude) {
        this.saude = novaSaude;
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public String retornarHumor() {
        if (fome < 50 && saude >= 50) {
            return "Feliz";
        } else if (fome >= 50 && saude >= 50) {
            return "Neutro";
        } else {
            return "Triste";
        }
    }
}
