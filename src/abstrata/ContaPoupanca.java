package abstrata;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        if (saldo >= 1000.0) {
            return 0.0;
        } else {
            return 5.0;
        }
    }
}