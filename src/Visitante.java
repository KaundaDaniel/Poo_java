public class Visitante {
    private String nome;
    private int idade;
    private final int IDADE_MINIMA=18;
    
    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }



    public boolean possuiPermissaoEntrada() {
        if (getIdade()>=IDADE_MINIMA) {
            return true;
        }else {
            return false;
        }
    }
    public String getMensagemEntrada() {
        if (possuiPermissaoEntrada()) {
            return "Bem-vindo(a) "  + getNome() + "! Você possui permissão para entrar.";
        } else {
            return "Você não possui a idade mínima para entrar.";
        }

    }
    public String getMensagemSaida() {
        return "Obrigado(a) por ter saído " + nome + ". Adeus!";
    }
    public  void podeEntrar(){
        if(possuiPermissaoEntrada()){
            System.out.println(getMensagemEntrada());
        } else {
            System.out.println(getMensagemSaida());
        }
    }

}
    




