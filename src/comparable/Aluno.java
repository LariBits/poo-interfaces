package comparable;

public class Aluno implements Comparable<Aluno>{
    private final String nome;
    private final double nota;

    public Aluno (String nome, double nota){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome Obrigatorio!");
        }
        if(nota < 0 || nota > 10){
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10: " + nota);
        }
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {  return nome;  }
    public double getNota() {  return nota;  }

    @Override
    public int compareTo(Aluno outro) {
        int porNota = Double.compare(outro.nota, this.nota);
        if(porNota != 0){
            return porNota;
        }
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return String.format("%-10s %.1f", nome, nota);
    }
}
