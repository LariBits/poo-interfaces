package objetos;

import java.util.Objects;

public class Produto {
    private int codigo;
    private String nome;

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo && Objects.equals(nome, produto.nome);
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }*/

    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo()  { return codigo; }
    public String getNome() { return nome; }
}
