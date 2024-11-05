public class Aeronave {
    private int totalAssentos;
    private int assentosReservados;
    private boolean ativo;

    public Aeronave(int totalAssentos, int assentosReservados) {
        this.totalAssentos = totalAssentos;
        this.assentosReservados = assentosReservados;
        this.ativo = true;
    }

    public int getTotalAssentos() {
        return totalAssentos;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    int calcularAssentosDisponiveis() {
        if (!ativo) {
            return 0;
        }  else {
        return totalAssentos - assentosReservados;
        }


    }
    int reservarAssentos(int assento){
        if(ativo && assento >= 0 && assento < totalAssentos){
            assentosReservados += assento;
            totalAssentos--;
            return assento;
        } else {
            System.out.println("Impossível reservar assentos, aeronave inativa.");
            return -1;

        }

    }
}
