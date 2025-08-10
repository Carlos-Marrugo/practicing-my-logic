import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2025, 4, 10);

        if(fechaInicio.isBefore(LocalDate.now())){
            System.out.println("Ya vencio!");
        } else {
            System.out.println("Reserva valida");
        }
    }
}