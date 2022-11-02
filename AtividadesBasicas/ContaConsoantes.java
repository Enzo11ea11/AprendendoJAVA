import java.util.Scanner;

//Estudando vetores usando String
//Conta a quantidade de consoantes digitados
public class ContaConsoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntcons = 0;
        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[cont] = letra;
                qntcons++;
            }
            cont++;
        } while (cont < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.println(consoante + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + qntcons);
    }
}