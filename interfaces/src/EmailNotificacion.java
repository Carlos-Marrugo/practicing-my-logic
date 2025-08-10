public class EmailNotificacion implements Notificacion{
    public void enviar(String message){
        System.out.println("Enviando email..." + message);
    }

}
