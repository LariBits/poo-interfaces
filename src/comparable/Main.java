package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Aluno> turma = new ArrayList<>();
        turma.add(new Aluno("Carla", 8.5));
        turma.add(new Aluno("Bruno", 9.0));
        turma.add(new Aluno("Ana", 8.5));
        turma.add(new Aluno("Diego", 6.0));

        System.out.println("Antes:");
        for(Aluno aluno : turma){
            System.out.println(aluno);
        }

        Collections.sort(turma);

        System.out.println("\nRanking");
        for(Aluno aluno : turma){
            System.out.println(aluno);

        }

        // --- ETAPA 3: Tratamento de erros ---

        System.out.println("\n--- Teste de Exceções (Etapa 3) ---");
        try {
            new Aluno("Eva", 11);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        try {
            new Aluno("", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }


        System.out.println("\n--- Ordenações Alternativas (Etapa 4) ---");

        // 1. Ordem reversa da ordenação natural (Nota crescente, Nome decrescente)
        turma.sort(Collections.reverseOrder());
        System.out.println("\nOrdem Reversa:");
        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }

        // 2. Ordenação por nome usando Comparator (Ordem alfabética)
        turma.sort(Comparator.comparing(Aluno::getNome));
        System.out.println("\nOrdenado Apenas por Nome:");
        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }

        // --- ETAPA 5: Teste com elemento null ---
        System.out.println("\n--- Teste com Null (Etapa 5) ---");
        turma.add(null);
        try {
            Collections.sort(turma);
        } catch (NullPointerException e) {
            System.out.println("Exceção capturada ao ordenar com null: " + e.getClass().getName());
        } finally {
            turma.remove(null); // Remove o null para manter a lista limpa
        }
    }
}
