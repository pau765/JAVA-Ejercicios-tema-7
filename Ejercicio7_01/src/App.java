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
        c = new CuentaCorriente(dni, nombre, saldo);

        System.out.println("1. Consutar saldo. 2. Ingresas dinerillo. 3. Sacar dinero. 4. Salir");
        int opcion;
        do {
            do {
                System.out.println("Que operacion desea realizar");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("CONSULTAR SALDO:");
                        c.mostrarInformacion();

                    }
                    case 2 -> {
                        System.out.println("INGRESAR DINERILLO");
                        System.out.print("Introduce la cantidad que deseas ingresar: ");
                        ingCant = sc.nextDouble();
                        System.out.println("Su saldo es: " + (ingCant + saldo));
                        c.ingreso(ingCant);
                    }
                    case 3 -> {
                        System.out.println("SACAR DINERO. ");
                        System.out.print("Introduce la cantidad que desea extraer: ");
                        sacarCant = sc.nextDouble();
                        System.out.println("Su saldo es: " + (saldo - sacarCant));
                        c.egreso(sacarCant);
                    }
                    case 4 -> {
                        System.out.println("SALIR.");
                        break;
                    }

                }
            } while (opcion < 1 || opcion > 4);

        } while (opcion != 4);

    }
}
