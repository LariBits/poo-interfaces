package heranca;

public class Moto extends Veiculo {
    private int Cilindrada;

    public Moto(String placa, int ano, int cilindrada,  String marca) {
        super(placa, ano, marca);
        this.Cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return Cilindrada;
    }
}
