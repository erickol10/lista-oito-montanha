import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FazendaDeBichinhos {
    private List<BichinhoVirtual> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(BichinhoVirtual bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos(int quantidadeComida) {
        for (BichinhoVirtual bichinho : bichinhos) {
            bichinho.comer(quantidadeComida);
        }
    }

    public void brincarComTodos(int tempoBrincadeira) {
        for (BichinhoVirtual bichinho : bichinhos) {
            bichinho.brincar(tempoBrincadeira);
        }
    }

    public void ouvirTodos() {
        for (BichinhoVirtual bichinho : bichinhos) {
            bichinho.emitirSom();
        }
    }

    public void passarTempo() {
        for (BichinhoVirtual bichinho : bichinhos) {
            bichinho.passarTempo();
        }
    }

    public static void main(String[] args) {
        FazendaDeBichinhos fazenda = new FazendaDeBichinhos();
        Random random = new Random();

        fazenda.adicionarBichinho(new BichinhoVirtual("Bob", random.nextInt(50), random.nextInt(50)));
        fazenda.adicionarBichinho(new BichinhoVirtual("Alice", random.nextInt(50), random.nextInt(50)));
        fazenda.adicionarBichinho(new BichinhoVirtual("Charlie", random.nextInt(50), random.nextInt(50)));

        fazenda.alimentarTodos(30);
        fazenda.brincarComTodos(20);
        fazenda.passarTempo();
        fazenda.ouvirTodos();

        // Mostrar o estado atual de todos os bichinhos
        for (BichinhoVirtual bichinho : fazenda.bichinhos) {
            System.out.println(bichinho);
        }
    }
}
