/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7_4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class JavaApplication7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c, c2;
        String dni, nombre, dni2, nombre2;
        double sacarCant = 0;
        double ingCant = 0;
        double saldo, saldo2;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introduce el DNI: ");
        dni = sc.next();
        System.out.print("Introduce el DNI 2: ");
        dni2 = sc.next();
        System.out.print("Introduce el nombre: ");
        nombre = sc.next();
        System.out.print("Introduce el nombre 2: ");
        nombre2 = sc.next();
        System.out.print("Introduce el saldo inicial de la cuenta: ");
        saldo = sc.nextDouble();
        System.out.print("Introduce el saldo inicial de la cuenta numero 2: ");
        saldo2 = sc.nextDouble();
        c = new CuentaCorriente(dni, nombre, saldo);
        c2 = new CuentaCorriente(dni2, nombre2, saldo2);
        CuentaCorriente.setBanco("BANCO CENTRAL");
        c.mostrarInformacion();
        CuentaCorriente.setBanco("CAJA DE AHORROS DO-WHILE");
        c.mostrarInformacion();
        c2.mostrarInformacion();

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
