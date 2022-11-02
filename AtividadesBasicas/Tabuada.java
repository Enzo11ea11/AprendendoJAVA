import java.util.Scanner;

//O sistema inprime a tabuada do número selecionado pelo usuário, com uma repetição enquanto o número não for zero.
public class Tabuada {
    public static void main(String[] args) {
        int n = 1;
        Scanner scan = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Digite o número a ser realizada a tabuada.");
            System.out.println("Caso queira parar o programa, digite zero.");
            n = scan.nextInt();
            if (n == 0) {
                break;
            } else {
                for (int i = 1; i < 10; i++) {
                    System.out.println(n + "x" + i + "=" + (n * i));
                }
            }
        }
    }
}