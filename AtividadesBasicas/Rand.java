import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] vet = new int[20][20];
        for (int i = 0; i < vet.length; i++) {
            for (int y = 0; y < vet.length; y++) {
                int n = random.nextInt(100);
                vet[i][y] = n;
            }
        }

        System.out.print("Matriz aleatoria: ");
        for (int i = 0; i < vet.length; i++) {
            for (int y = 0; y < vet.length; y++) {
                System.out.print(vet[i][y] + " ");
            }
            System.out.println();
        }
    }
}