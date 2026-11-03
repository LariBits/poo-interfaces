package objetos;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Caneta");
        Produto p2 = new Produto(1, "Caneta");

        System.out.println(p1);
        System.out.println("p1 equals p2? " + p1.equals(p2));

        Set<Produto> conjunto = new HashSet<>();
        conjunto.add(p1);
        conjunto.add(p2);

        System.out.println("Tamanho do conjunto: " + conjunto.size());
    }
}
