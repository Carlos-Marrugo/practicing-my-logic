//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Notificacion n1 = new EmailNotificacion();
        Notificacion n2 = new PushNotificacion();
        n1.enviar("Nuevo seguidor");
        n2.enviar("Te han dado like");
    }
}