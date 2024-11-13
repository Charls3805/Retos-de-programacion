/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3;

/**
 *
 * @author Carlos
 */
public class Reto3_2 {
     public static void main(String[] args) {
        int[][] arreglo = {
            {10, 21, 32, 44, 68},
            {53, 64, 70, 86, 19},
            {97, 108, 36, 12, 58},
            {31, 42, 53, 16, 95},
            {45, 56, 75, 90, 49}
        };
        
        int filas = arreglo.length;
        int columnas = arreglo[0].length;
        
        // Contar números pares e impares por filas
        System.out.println("Conteo de números pares e impares por filas:");
        for (int i = 0; i < filas; i++) {
            int pares = 0, impares = 0;
            for (int j = 0; j < columnas; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Fila " + (i + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
        
        // Contar números pares e impares por columnas
        System.out.println("\nConteo de números pares e impares por columnas:");
        for (int j = 0; j < columnas; j++) {
            int pares = 0, impares = 0;
            for (int i = 0; i < filas; i++) {
                if (arreglo[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Columna " + (j + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
        
        // Calcular la suma de todos los números en el arreglo
        int sumaTotal = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTotal += arreglo[i][j];
            }
        }
        System.out.println("\nLa suma total de todos los números en el vector es: " + sumaTotal);
    }
}

