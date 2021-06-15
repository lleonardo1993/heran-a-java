package aulas.herança;

import javax.annotation.processing.SupportedOptions;

public class testando extends Salario {

    public static void main(String[] args) {

       /*Salario gerente = new Salario();
       gerente.setValorPamento(1000.0);
       System.out.println("Gerente o proporcional do seu pagamento é " + gerente.calcularPagamento());

   }
        */
        Salario Supervisor = new Salario();
        Supervisor.setValorPamento(2000.0);
        System.out.println("Supervisor o proporcional do seu pagamento é " + Supervisor.calcularPagamento());
    }
}