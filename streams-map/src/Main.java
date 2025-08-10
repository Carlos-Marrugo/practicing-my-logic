import java.util.ArrayList;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> canciones = Arrays.asList("Rock-song1", "Pop-song2", "champeta-song3");

        canciones.stream()
                .filter(c -> c.startsWith("Rock"))
                .map(c -> c.split("-")[1])
                .forEach(System.out::println);

    }
}