//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double saldo = 50;
        double monto = 20;

        try {
            if (monto > saldo) throw new SaldoInsuficienteException("Saldo insuficiente");
            System.out.println("Operacion finalizada");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}