public class TV {
    private int canal;
    private int volume;

    public TV() {
        this.canal = 1; // Canal inicial
        this.volume = 50; // Volume inicial
    }

    public void definirCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para " + novoCanal);
        } else {
            System.out.println("Canal inválido.");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume);
        } else {
            System.out.println("Volume mínimo atingido.");
        }
    }

    // Getters para os atributos

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
