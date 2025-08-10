public class HiloBasico extends Thread {
    public void run() {
        System.out.println("Hilo en ejecucucion: " + Thread.currentThread().getName());
    }
}
