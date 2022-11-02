import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Digite uma nota entre zero e dez");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Digite uma nota válida");
            } else {
                System.out.println("Nota válida");
                break;
            }
        }
    }
}