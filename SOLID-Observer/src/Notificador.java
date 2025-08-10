import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<Observador> observadores = new ArrayList<Observador>();
    public void suscribir(Observador o) { observadores.add(o); }
    public void notificar(String mensaje) {
        observadores.forEach(o -> o.actualizar(mensaje));
    }
}
