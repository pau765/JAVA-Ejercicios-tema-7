
public class Gestor {
    public String nombre;
    private String telefono;
    double importeMax;

    public Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000.0);
    }

    String getTelefono() {
        return telefono;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Importe maximo: " + importeMax + "euros");
    }
}
