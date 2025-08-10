public class PushNotificacion implements Notificacion{
    public void enviar(String message){
        System.out.println("Enviando push..." + message);
    }
}
