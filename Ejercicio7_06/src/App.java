import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        System.out.print("Hora: ");
        int valorHora = sc.nextInt();
        h.setHora (valorHora);
        System.out.print("Minuto: ");
        valorHora = sc.nextInt();
        h.setMinuto(valorHora);
        System.out.print("Segundos: ");
        valorHora = sc.nextInt();
        h.setSegundo(valorHora);
        System.out.print("Numero de segundos que quieres mostrar: ");
        int numSegundos = sc.nextInt();
        for (int i = 0; i <= numSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementarSegundo();
        }
    }
}
