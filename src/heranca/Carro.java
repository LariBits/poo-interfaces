package heranca;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String placa, int ano, int portas, String marca) {
        super(placa, ano, marca);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }
}
