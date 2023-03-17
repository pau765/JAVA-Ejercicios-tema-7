import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c;
        String dni, nombre;
        double sacarCant = 0;
        double ingCant = 0;
        double saldo;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introduce el DNI: ");
        dni = sc.next();
        System.out.print("Introduce el nombre: ");
        nombre = sc.next();
        System.out.println("Introduce el saldo inicial de la cuenta: ");
        saldo = sc.nextDouble();
        c = new CuentaCorriente(dni, nombre);
        c.mostrarInformacion();
        c.ingreso(ingCant);
        c.egreso(sacarCant);
        
    }
}
