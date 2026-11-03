package abstrata;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract double calcularTarifaMensal();

    public void cobrarTarifa(){
        saldo -= calcularTarifaMensal();
    }

    public void exibirSaldo(){
        System.out.printf("%s: R$ %.2f%n", titular, saldo);
    }
}
