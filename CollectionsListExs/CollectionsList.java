import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsList {

    public static void main(String[] args) throws Exception {
        // Criando uma lista e adicionando sete notas
        List<Double> notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(9.0);
        notas.add(8.0);
        notas.add(7.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(4.0);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada" + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Imprima a media" + (soma / notas.size()));

        System.out.println("Remova a nota 4: ");
        notas.remove(4d);
        System.out.println(notas);
        System.out.println("Remova a posição 4: ");
        notas.remove(4);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        System.out.println("Crie uma nova lista: ");
        List<Double> notas2 = new ArrayList<Double>();
        notas2.add(10.0);
        notas2.add(9.0);
        notas2.add(8.0);
        notas2.add(7.0);
        notas2.add(6.0);
        notas2.add(5.0);
        notas2.add(4.0);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem remove-la: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da lista e a remova" + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
    }
}
