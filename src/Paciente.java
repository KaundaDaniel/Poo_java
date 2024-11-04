public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public IndiceMassaCorporal calcularIMC(){
        double imc = peso / (altura * altura);
        IndiceMassaCorporal imcObj = new IndiceMassaCorporal();
        imcObj.setResultado(imc);
        return imcObj;
    }



}
