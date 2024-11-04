public class IndiceMassaCorporal {
private  double resultado;
private double peso;
private double altura;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    boolean estaComObesidade() {
        if(resultado>30){
            return true;
        }else {
            return false;
        }
    }
}
