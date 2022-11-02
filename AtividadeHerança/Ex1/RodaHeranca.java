public class RodaHeranca {
    // Entendendo conceitos de Herança, Upcast w Downcast na Orientação a Objetos
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor2 = (Vendedor) new Funcionario();
    }
}
