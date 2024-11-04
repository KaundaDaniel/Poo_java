public class CalculadoraImc {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public IndiceMassaCorporal calcularIMC(Paciente paciente) {
        double imc = paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());
        IndiceMassaCorporal imcObj = new IndiceMassaCorporal();
        imcObj.setResultado(imc);
        return imcObj;
    }



}
