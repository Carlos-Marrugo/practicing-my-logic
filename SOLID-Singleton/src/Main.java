//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conexion c1 = Conexion.getInstancia();
        Conexion c2 = Conexion.getInstancia();

        System.out.println(c1 == c2);
    }
}