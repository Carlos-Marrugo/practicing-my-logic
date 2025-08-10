import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       String[] ventas = {"LapTop", "Mouse", "Laptop", "Teclado", "Mouse"};

       Map<String, Integer> contador = new HashMap<>();
       for (String producto : ventas) {
           contador.put(producto, contador.getOrDefault(producto, 0) + 1);
       }

       contador.forEach((producto, cantidad) ->
               System.out.println(producto + ": " + cantidad + " ventas"));
    }
}