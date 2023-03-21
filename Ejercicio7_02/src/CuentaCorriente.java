
public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    CuentaCorriente (String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }
    CuentaCorriente (String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
     }
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
    }
    void ingreso(double ingCant) {
        saldo += ingCant;
    }
   boolean egreso(double sacarCant) {
        boolean operacionPosible = false;
        if (saldo >= sacarCant) {
            saldo -= sacarCant ;
            operacionPosible = true;
        } else if (saldo == 0){
            System.out.print("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }
}
