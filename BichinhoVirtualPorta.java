public class BichinhoVirtualPorta {
    private String nome;
    private int fome;
    private int tedio;

    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.tedio = 50;
    }

    public void comer(int quantidadeComida) {
        fome -= quantidadeComida;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        tedio -= tempoBrincadeira;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public void passarTempo() {
        fome += 10;
        tedio += 10;
        if (fome > 100) {
            fome = 100;
        }
        if (tedio > 100) {
            tedio = 100;
        }
    }

    public int getNivelFome() {
        return fome;
    }

    public int getNivelTedios() {
        return tedio;
    }

    @Override
    public String toString() {
        return "BichinhoVirtual [nome=" + nome + ", fome=" + fome + ", tedio=" + tedio + "]";
    }

    public static void main(String[] args) {
        BichinhoVirtual bichinho = new BichinhoVirtual("Bob");
        System.out.println("Bichinho: " + bichinho.nome);
        System.out.println("Nível de fome inicial: " + bichinho.getNivelFome());
        System.out.println("Nível de tédio inicial: " + bichinho.getNivelTedios());

        bichinho.comer(30);
        bichinho.brincar(20);
        bichinho.passarTempo();

        System.out.println("Nível de fome após comer: " + bichinho.getNivelFome());
        System.out.println("Nível de tédio após brincar: " + bichinho.getNivelTedios());

        // "Porta escondida" - Mostra os valores exatos dos atributos
        System.out.println(bichinho);
    }
}
