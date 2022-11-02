public class InverteVetor {
    // Invertendo um vetor
    public static void main(String[] args) {
        int[] vet = { 1, 2, 3, 4, 5 };
        int[] vet2 = { 0, 0, 0, 0, 0 };
        int x = 0;
        for (int i = 4; i >= 0; i--) {
            vet2[i] = vet[x];
            x++;
        }
        // Imprime invertido
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vet2[i]);
        }
    }
}