import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoElementosList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>() {
            {
                add(new Gato("Enzo", 22, "Branco"));
                add(new Gato("Enzo", 25, "malhado"));
                add(new Gato("Bruna", 20, "Marrom"));
            }
        };
        System.out.println("Ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Odem idade:");
        // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Odem cor:");
        // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Odem nome/cor/idade:");
        // Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(), g1.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0)
            return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0)
            return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}