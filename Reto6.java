/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto6;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Empleado {
    String nombreCompleto;
    int horasTrabajadas;
    int horasExtras;
    String telefono;
    String fechaNacimiento;
    String categoria;

    Empleado(String nombreCompleto, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, String categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    double calcularSueldoBase() {
        switch (categoria) {
            case "empleado ventas":
                return 100.00 * horasTrabajadas;
            case "administrador":
                return 180.00 * horasTrabajadas;
            case "gerente":
                return 250.00 * horasTrabajadas;
            default:
                return 0.0;
        }
    }

    double calcularPagoHorasExtras() {
        switch (categoria) {
            case "empleado ventas":
                return 50.00 * horasExtras;
            case "administrador":
                return 100.00 * horasExtras;
            case "gerente":
                return 150.00 * horasExtras;
            default:
                return 0.0;
        }
    }
}

public class Reto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados a capturar: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Empleado[] empleados = new Empleado[cantidadEmpleados];

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.print("Nombre completo: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Horas extras trabajadas: ");
            int horasExtras = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();
            System.out.print("Categoría (empleado ventas / administrador / gerente): ");
            String categoria = scanner.nextLine();

            empleados[i] = new Empleado(nombreCompleto, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria);
        }

        double totalSueldoNormal = 0.0;
        double totalPagoHorasExtras = 0.0;
        int totalHorasLaboradas = 0;
        int personasConHorasExtras = 0;
        int personasSinHorasExtras = 0;

        for (Empleado empleado : empleados) {
            totalSueldoNormal += empleado.calcularSueldoBase();
            totalPagoHorasExtras += empleado.calcularPagoHorasExtras();
            totalHorasLaboradas += empleado.horasTrabajadas + empleado.horasExtras;
            if (empleado.horasExtras > 0) {
                personasConHorasExtras++;
            } else {
                personasSinHorasExtras++;
            }
        }

        double totalNomina = totalSueldoNormal + totalPagoHorasExtras;

        System.out.println("\n--- Reporte de Nómina ---");
        System.out.println("Total de la nómina de la empresa: $" + totalNomina);
        System.out.println("Total a pagar por sueldo normal: $" + totalSueldoNormal);
        System.out.println("Total a pagar por horas extras: $" + totalPagoHorasExtras);
        System.out.println("Total de horas laboradas en la empresa: " + totalHorasLaboradas);
        System.out.println("Total de personas que tienen horas extras: " + personasConHorasExtras);
        System.out.println("Total de personas que no tienen horas extras: " + personasSinHorasExtras);
    }
}