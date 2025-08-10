import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("Laptop", 10);
        inventario.put("Mouse", 50);

        inventario.remove("Laptop");
        System.out.println("El stock que hay: "+inventario);
    }
}