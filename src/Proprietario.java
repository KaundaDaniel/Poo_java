public class Proprietario {
    private String nome;
    private String endereco;
    private int idade;
    public Proprietario(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Proprietario{" +"\n" + "nome=" + nome  +"\n" +  ", endereco=" + endereco  +"\n" + ", idade=" + idade+ "\n" ;
    }
}
