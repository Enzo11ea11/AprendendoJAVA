import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n, soma = 0, maior = -9999999;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número de posição: " + (i + 1));
            n = scan.nextInt();
            soma += n;
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma / 5));
        System.out.println("Maior numero: " + maior);
    }
}