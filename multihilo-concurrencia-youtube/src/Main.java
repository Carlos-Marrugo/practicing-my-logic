//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread video = new Thread(() -> System.out.println("Cargando videos...."));
        Thread comentarios = new Thread(() -> System.out.println("Cargando comentarios...."));

        video.start();
        comentarios.start();
    }
}