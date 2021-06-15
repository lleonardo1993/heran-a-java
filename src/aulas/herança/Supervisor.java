package aulas.herança;

public class Supervisor extends Salario {

    private String Name;
    private double Valor;

    public double calcularPagamento() {
        return this.getValorPamento() * 0.05;
    }
}
