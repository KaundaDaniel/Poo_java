public class Produto {
    private String nome;
    private double precoCusto;
    private int quantidade;
    private double precoVenda;
    static double custoImbalagem;

    static void alterarCustoEmbalagem(double custo) {
        Produto.custoImbalagem=custo;
    }
    static double alteraCustodTotais(Produto produto){
        return produto.precoCusto + custoImbalagem;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
