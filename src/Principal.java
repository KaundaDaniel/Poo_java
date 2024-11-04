public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setNome("John Doe");
        paciente1.setPeso(99.5);
        paciente1.setAltura(1.75);

        System.out.printf("Nome: %s%n", paciente1.getNome());
        System.out.printf("Peso: %.2f kg%n", paciente1.getPeso());
        System.out.printf("Altura: %.2f m%n", paciente1.getAltura());

        if(paciente1.calcularIMC().estaComObesidade()){
            System.out.println("Paciente está com obesidade");
        }else{
            System.out.printf("Índice de Massa Corporal: %.2f%n", paciente1.calcularIMC().getResultado() );
        }
    }
}
