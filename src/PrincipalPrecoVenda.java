public class PrincipalPrecoVenda {
    public static void main(String[] args) {
        Produto produto= new Produto();
        produto.setNome("Agua");
        produto.setPrecoCusto(100);
        CarrinhoCompra carrinhoCompra= new CarrinhoCompra();
        carrinhoCompra.gerarPedido();
        carrinhoCompra.adcionarItem(produto, -2);
        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        produto.setPrecoCusto(100);
        Produto.custoImbalagem=23;
        Produto.alterarCustoEmbalagem(230);
        servicoDePrecificacao.calcularValorPrecoVenda(produto, 20);
        System.out.println("Preço de venda: " + produto.getPrecoVenda());
    }
}
