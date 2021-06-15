package aulas.herança;

public class Atendente extends  Salario {


    private String Name;
    private double Valor;

    public double calcularPagamento() {
        return this.getValorPamento() * 0.07;
    }
}
