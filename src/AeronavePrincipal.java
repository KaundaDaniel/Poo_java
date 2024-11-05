public class AeronavePrincipal {
    public static void main(String[] args) {
        Aeronave aeronave = new Aeronave(100, 20);
        System.out.println("Total de assentos: " + aeronave.getTotalAssentos());
        System.out.println("Assentos reservados: " + aeronave.getAssentosReservados());
        aeronave.setAtivo(false);
        String activo= aeronave.isAtivo() ? "Aeronave está ativa" : "Aeronave está desativada";
        System.out.println(activo);
        System.out.println(aeronave.reservarAssentos(5));


        aeronave.setAtivo(false);
    }
}
