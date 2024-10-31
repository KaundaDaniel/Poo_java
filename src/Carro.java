public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int numPortas;
    private String numeroMotor;
    private Proprietario proprietario;

    public Carro(String marca, String modelo, int ano, String cor, int numPortas, String numeroMotor, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numPortas = numPortas;
        this.numeroMotor = numeroMotor;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro{" +  "\n" +
                "marca=" + marca + "\n" +
                ", modelo=" + modelo + "\n" +
                ", ano=" + ano + "\n" +
                ", cor=" + cor + "\n" +
                ", numero de Portas=" + numPortas + "\n" +
                ", numero do Motor='" + numeroMotor + "\n" +
                ", proprietario=" + proprietario.getNome() +
                '}';
    }
}
