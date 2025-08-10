import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Laptop", 2000));
        pedidos.add(new Pedido("Mouse", 1300));
        pedidos.add(new Pedido("Teclado", 1700));

        pedidos.sort(Comparator.comparingDouble(p -> p.precio));
        pedidos.forEach(System.out::println);

    }
}