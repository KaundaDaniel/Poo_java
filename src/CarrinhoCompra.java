import java.util.Objects;

public class CarrinhoCompra {
    private Produto  produto;
    double precoTotal;
    private int quantidadeItens;

    public CarrinhoCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidadeItens = quantidade;
        this.precoTotal = produto.getPrecoVenda() * quantidade;
    }
    public  CarrinhoCompra(){

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
    void adcionarItem(Produto produto, int quantidadeItens){
        Objects.requireNonNull(produto, "produto is null");
        if (quantidadeItens<=0) {
            throw new IllegalArgumentException("Quantidade de itens inválida");
        }
        System.out.printf("Producto: %s%n", produto.getNome());
    }
    void gerarPedido(Endereco endereco){
        Objects.requireNonNull(endereco, "endereco is null");
        criarNovoPedido(endereco);
    }
    void gerarPedido(){
        criarNovoPedido(null);
    }

    private void criarNovoPedido(Endereco endereco) {
    }
}
