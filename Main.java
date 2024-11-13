/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafetera;
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
  



class Cafetera {
    private int capacidadMaximaCafe;
    private int capacidadMaximaAgua;
    private int capacidadMaximaAzucar;
    private int cafeDisponible;
    private int aguaDisponible;
    private int azucarDisponible;
    private double importeTotalVenta;
    private int totalTazasVendidas;
    private Map<String, Integer> tazasVendidas;

    public Cafetera() {
        this.capacidadMaximaCafe = 2000; // 2 kilos en gramos
        this.capacidadMaximaAgua = 3000; // 3 litros en mililitros
        this.capacidadMaximaAzucar = 2000; // 2 kilos en gramos
        this.cafeDisponible = 2000;
        this.aguaDisponible = 3000;
        this.azucarDisponible = 2000;
        this.importeTotalVenta = 0;
        this.totalTazasVendidas = 0;
        this.tazasVendidas = new HashMap<>();
    }

    public void servirTaza(String tipoVaso, int cantidad) {
        int cafeUtilizado = 0;
        int aguaUtilizada = 0;
        int azucarUtilizada = 0;
        switch (tipoVaso) {
            case "pequeno_sin_azucar":
                cafeUtilizado = cantidad * 7;
                aguaUtilizada = cantidad * 120;
                importeTotalVenta += cantidad * 10.50;
                registrarVenta("Vaso de café pequeño sin azúcar", cantidad);
                break;
            case "pequeno_con_azucar":
                cafeUtilizado = cantidad * 7;
                azucarUtilizada = cantidad * 4;
                aguaUtilizada = cantidad * 120;
                importeTotalVenta += cantidad * 14.50;
                registrarVenta("Vaso de café pequeño con azúcar", cantidad);
                break;
            case "mediano_sin_azucar":
                cafeUtilizado = cantidad * 10;
                aguaUtilizada = cantidad * 220;
                importeTotalVenta += cantidad * 24.50;
                registrarVenta("Vaso de café mediano sin azúcar", cantidad);
                break;
            case "mediano_con_azucar":
                cafeUtilizado = cantidad * 10;
                azucarUtilizada = cantidad * 7;
                aguaUtilizada = cantidad * 220;
                importeTotalVenta += cantidad * 34.50;
                registrarVenta("Vaso de café mediano con azúcar", cantidad);
                break;
            case "grande_sin_azucar":
                cafeUtilizado = cantidad * 13;
                aguaUtilizada = cantidad * 320;
                importeTotalVenta += cantidad * 34.50;
                registrarVenta("Vaso de café grande sin azúcar", cantidad);
                break;
            case "grande_con_azucar":
                cafeUtilizado = cantidad * 13;
                azucarUtilizada = cantidad * 10;
                aguaUtilizada = cantidad * 320;
                importeTotalVenta += cantidad * 39.50;
                registrarVenta("Vaso de café grande con azúcar", cantidad);
                break;
        }
        cafeDisponible -= cafeUtilizado;
        aguaDisponible -= aguaUtilizada;
        azucarDisponible -= azucarUtilizada;
    }

    private void registrarVenta(String tipoVaso, int cantidad) {
        totalTazasVendidas += cantidad;
        tazasVendidas.put(tipoVaso, tazasVendidas.getOrDefault(tipoVaso, 0) + cantidad);
        System.out.println("Taza vendida: " + tipoVaso + ". Total vendidas: " + totalTazasVendidas);
    }

    public void agregarCafe(int cantidad) {
        if (cafeDisponible + cantidad <= capacidadMaximaCafe) {
            cafeDisponible += cantidad;
            System.out.println(cantidad + " gramos de café agregados a la cafetera.");
        } else {
            System.out.println("La cafetera no puede contener más café.");
        }
    }

    public void mostrarInsumosDisponibles() {
        System.out.println("Café disponible: " + cafeDisponible + " gramos");
        System.out.println("Agua disponible: " + aguaDisponible + " mililitros");
        System.out.println("Azúcar disponible: " + azucarDisponible + " gramos");
    }
  public double calcularCambio(double pago) {
        double cambio = pago - importeTotalVenta;
        return cambio;
    }
  public void rellenarCafetera() {
        cafeDisponible = capacidadMaximaCafe;
        aguaDisponible = capacidadMaximaAgua;
        azucarDisponible = capacidadMaximaAzucar;
        System.out.println("La cafetera ha sido rellenada.");
    }
    public void vaciarCafetera(){
        if (cafeDisponible == capacidadMaximaCafe && aguaDisponible == capacidadMaximaAgua && azucarDisponible == capacidadMaximaAzucar) {
            System.out.println("La cafetera ya está llena.");
        } else {
            cafeDisponible = capacidadMaximaCafe;
            aguaDisponible = capacidadMaximaAgua;
            azucarDisponible = capacidadMaximaAzucar;
            System.out.println("La cafetera ha sido rellenada.");
        }
    }
    public void mostrarReporte()  {
        System.out.println("Importe total de venta: $" + importeTotalVenta);
        System.out.println("Total de tazas vendidas: " + totalTazasVendidas);
        System.out.println("Desglose detallado de las tazas vendidas:");
        for (Map.Entry<String, Integer> entry : tazasVendidas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Cantidad restante de insumos:");
        System.out.println("Café disponible: " + cafeDisponible + " gramos");
        System.out.println("Agua disponible: " + aguaDisponible + " mililitros");
        System.out.println("Azúcar disponible: " + azucarDisponible + " gramos");
    }
}
    

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera();
        
      System.out.println("Bienvenido a la cafetera virtual!");
        while (true) {
            System.out.println("¿Qué desea hacer? (servir, rellenar, vaciar, salir)");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "servir":
                    System.out.println("¿Qué tipo de café desea? (pequeno_sin_azucar, pequeno_con_azucar, mediano_sin_azucar, mediano_con_azucar, grande_sin_azucar, grande_con_azucar)");
                    String tipoCafe = scanner.nextLine();
                    System.out.println("¿Cuántas tazas desea?");
                    int cantidad = Integer.parseInt(scanner.nextLine());
                    cafetera.servirTaza(tipoCafe, cantidad);
                        
        System.out.println("Por favor, ingrese el monto total a pagar:");
        double pago = Double.parseDouble(scanner.nextLine());
        double cambio = cafetera.calcularCambio(pago);
        if (cambio >= 0) {
            System.out.println("Gracias por su compra. Su cambio es: $" + cambio);
        } else {
            System.out.println("El monto ingresado es insuficiente.");
        }
                    break;
                case "rellenar":
                    cafetera.rellenarCafetera();
                    break;
                case "vaciar":
                    cafetera.vaciarCafetera();
                    break;
                case "salir":
                    System.out.println("Gracias por utilizar la cafetera virtual.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        
        
        cafetera.mostrarReporte();
   
    }
    }
}