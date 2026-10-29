package heranca;

public class Veiculo {
    private String placa;
    protected int ano;
    protected String marca;

    public Veiculo(String placa, int ano, String marca) {
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
    }

    public void exibirDados(){
        System.out.println("Placa: " + placa + "| Ano: " + ano + "| Marca: " + marca);
    }

}
