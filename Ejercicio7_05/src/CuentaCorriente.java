
public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    Gestor gestor;

    CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this(dni, nombre);
        this.gestor = gestor;
    }

    void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente(String string, String string2) {
    }

    boolean egreso(double cant) {
        boolean operacionPosible = false;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible = true;
        } else if (saldo == 0) {
            System.out.print("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrarInformacion() {
        if (gestor == null) {
            System.out.println("Cuenta sin gestor");
        } else {
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion();
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
    }

    static private String nombreBanco = "INTERNATIONAL JAVABANK";

    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    static String getBanco() {
        return nombreBanco;
    }
}
