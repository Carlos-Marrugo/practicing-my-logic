import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> usuarioConectados = new HashSet<String>();
        usuarioConectados.add("Carlos");
        usuarioConectados.add("Sarah");
        usuarioConectados.add("Carlos");

        System.out.println("Usuarios conectados sin duplicar: " + usuarioConectados);

    }
}