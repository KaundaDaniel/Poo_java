public class PrincipalPrecoVenda {
    public static void main(String[] args) {
        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        double precoVenda = 1000;
        double precoFinal = servicoDePrecificacao.calcularValorPrecoVenda(precoVenda);
        System.out.println("Preço de venda: " + precoFinal);
    }
}
