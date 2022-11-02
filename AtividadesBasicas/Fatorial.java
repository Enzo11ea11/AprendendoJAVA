import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Digite o número em que o fatorial deverá ser impresso:");
        n = scan.nextInt();
        int fat = fator(n);
        System.out.println("Fatorial: " + fat);
    }

    public static int fator(int n) {
        for (int i = (n - 1); i > 0; i--) {
            n = n * i;
        }
        return n;
    }
}