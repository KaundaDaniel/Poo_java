//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Proprietario principal = new Proprietario("Luciano", "Jose Tiburcion", 50);
        Proprietario secundario = new Proprietario("Maria", "Rosa Costa", 45);
        Carro carro1 = new Carro("Ford", "Mustang", 2021, "Preto", 4, "ABC123", principal, 92000);
        Carro carro2 = new Carro("Chevrolet", "Corvette", 2020, "Vermelho", 2, "DEF456", secundario, 20145.7);
        carro2.calculcarValorRevendante();
        System.out.printf("ValorRevendante %6.2f%n", carro2.calculcarValorRevendante());
        // System.out.println(carro1.toString());
        // System.out.println(carro2.toString());
        //  System.out.println(principal.toString());
    }
}