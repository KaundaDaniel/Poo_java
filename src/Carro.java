public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int numPortas;
    private String numeroMotor;
    private Proprietario proprietario;
    private double precoCompra;

    public Carro(String marca, String modelo, int ano, String cor, int numPortas, String numeroMotor, Proprietario proprietario, double precoCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numPortas = numPortas;
        this.numeroMotor = numeroMotor;
        this.proprietario = proprietario;
        this.precoCompra = precoCompra;
    }
    void calculcarValorRevendante() {
        int tempoDeUsoEmanos= 2024-ano;
        int vidaUltilEmAnos=20;
        double valorRevendante = (precoCompra /0.8)* (vidaUltilEmAnos-tempoDeUsoEmanos);
        if (valorRevendante<0){
            System.out.println("O carro não pode ser revendido por não atender aos requisitos");
            valorRevendante=0;
        }
        System.out.printf("Calcular valor revenda de: %s  %d%n", modelo, tempoDeUsoEmanos);
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
