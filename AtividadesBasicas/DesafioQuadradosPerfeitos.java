import java.util.*;

public class DesafioQuadradosPerfeitos {

    public static void main(String[] args) {
        int n = 12;
        ArrayList<Integer> d = new ArrayList();
        int soma = 0;
        int count = 0;
        // TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        for (int i = n; i > 0; i--) {
            for (int y = 1; y <= i; y++) {
                if ((y * y) == i) {
                    // if ((soma + i) <= n) {
                    d.add(i);
                    count += 1;
                    // }
                }
            }
        }
        int aux = 0;
        int count2 = 0;
        int p = d.size();
        for (int i = aux; i < d.size(); i++) {
            int x = d.get(i);
            if ((soma + x) <= n) {
                System.out.println(x);
                System.out.println("i:" + i);
                soma += x;
                count2++;
            }

            if (i == (d.size() - 1)) {
                if (soma != n) {
                    aux++;
                    i = aux;
                    soma = 0;
                    count2 = 0;
                    System.out.println("teste");
                }
            }

            if ((soma + x) <= n) {
                i--;
            }
        }

        System.out.println("Contador: " + count2);
        System.out.println("Soma: " + soma);
        System.out.println(d);
    }
}