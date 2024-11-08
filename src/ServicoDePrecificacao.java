public class ServicoDePrecificacao {
    void calcularValorPrecoVenda(Produto produto, double percentualMargemLucro){
        produto.setPrecoVenda( produto.getPrecoCusto()* ((percentualMargemLucro/100) +1));
    }
}
