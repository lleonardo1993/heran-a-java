package aulas.herança;

public class Salario {

    private String name;
    private double valor;

    public double valorPamento;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPamento() {
        return valorPamento;
    }

    public void setValorPamento(double valorPamento) {
        this.valorPamento = valorPamento;
    }

    public double calcularPagamento(){
        return this.valorPamento * 0.01;
    }



}
