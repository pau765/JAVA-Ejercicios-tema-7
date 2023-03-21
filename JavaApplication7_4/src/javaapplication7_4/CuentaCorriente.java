/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7_4;

/**
 *
 * @author JAVA
 */
class CuentaCorriente {

    String dni;
    String nombre;
    double saldo;

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;        
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
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println(nombreBanco);
    }
    static private String nombreBanco = "INTERNATIONAL JAVABANK";

    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    static String getBanco() {
        return nombreBanco;
    }
}
