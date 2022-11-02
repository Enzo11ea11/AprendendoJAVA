public class Semana {
    public static void main(String[] args) {
        int d = 1;
        String e = null;
        String retornoDia = Buscars(d, e);
        System.out.println(retornoDia);
    }

    public static String Buscars(int d, String e) {
        switch (d) {
            case 1:
                e = "Domingo";
                break;
            case 2:
                e = "Segunda";
                break;
            case 3:
                e = "Terça";
                break;
        }
        return e;
    }
}