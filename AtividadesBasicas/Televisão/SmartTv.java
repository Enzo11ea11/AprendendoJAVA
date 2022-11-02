public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void Ligar() {
        ligada = true;
    }

    public void Desligar() {
        ligada = false;
    }

    public void AumentarVolume() {
        volume++;
    }

    public void DominuirVolume() {
        volume--;
    }

    public void MudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
