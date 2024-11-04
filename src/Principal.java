public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc1 = new CalculadoraImc();
        calculadoraImc1.setNome("John Doe");
        Paciente paciente= new Paciente();
        paciente.setPeso(99.5);
        paciente.setAltura(1.75);


        System.out.printf("Nome: %s%n", calculadoraImc1.getNome());

        if(calculadoraImc1.calcularIMC(paciente).estaComObesidade()){
            System.out.println("Paciente está com obesidade");
        }else{
            System.out.printf("Índice de Massa Corporal: %.2f%n", calculadoraImc1.calcularIMC(paciente).getResultado() );
        }
    }
}
