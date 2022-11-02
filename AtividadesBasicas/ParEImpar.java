import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, par = 0, impar = 0, x;
        System.out.println("Digite a quantidade de números a serem digitados:");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número de posição: " + (i + 1));
            x = scan.nextInt();
            if (x % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}