//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        Usuario u1 = new Usuario("Carlos");
        Usuario u2 = new Usuario("Pedro");

        notificador.suscribir(u1);
        notificador.suscribir(u2);

        notificador.notificar("Nuevo mensaje");
    }
}