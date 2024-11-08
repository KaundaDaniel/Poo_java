public class MainCadastro {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Visitante visitante = new Visitante("João", 25);
        visitante.podeEntrar();

        Visitante visitante2 = new Visitante("Pedro", 16);
        visitante2.podeEntrar();

        Visitante visitante3 = new Visitante("Luís", 20);
        visitante3.podeEntrar();
    }
}
