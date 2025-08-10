import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Maribel","Anna","Carlos","Ashley");
        String busqueda = "x " +
                "";

        List<String> busquedaFiltro = nombres.stream()
                .filter(nombre -> !nombre.contains(busqueda))
                .collect(Collectors.toList());

        System.out.println(busquedaFiltro);
    }
}