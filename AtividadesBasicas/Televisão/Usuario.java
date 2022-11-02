public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.DominuirVolume();
        smartTv.MudarCanal(33);
        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
    }
}
