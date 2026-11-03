package abstrata;

public class Main {
    public static void main(String[] args) {
        // Passo 4: Vetor de contas e execução polimórfica
        Conta[] contas = {
                new ContaCorrente("Ana", 500),
                new ContaPoupanca("Bruno", 1500),
                new ContaPoupanca("Carla", 200)
        };

        for (Conta c : contas) {
            c.cobrarTarifa();
            c.exibirSaldo();
        }

        // --- Passo 5: Teste de instanciação direta da classe abstrata ---
        // Se você descomentar a linha abaixo, o compilador gerará um erro:
        //Conta c = new Conta("Teste", 0);
        // Erro do IntelliJ: "'Conta' is abstract; cannot be instantiated"

        // --- Passo 6: Remoção temporária de método abstrato ---
        // Se você remover @Override public double calcularTarifaMensal() da ContaCorrente,
        // Erro do IntelliJ: "Class 'ContaCorrente' must either be declared abstract or implement abstract method 'calcularTarifaMensal()' in 'Conta'"
    }
}