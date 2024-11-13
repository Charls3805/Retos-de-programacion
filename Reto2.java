/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Carlos
 */
public class Reto2 {
    public static BufferedReader entradaUsuario= new BufferedReader(new InputStreamReader(System.in));
        public static BufferedReader entradaContraseña= new BufferedReader(new InputStreamReader(System.in));
                public static BufferedReader entradanumero= new BufferedReader(new InputStreamReader(System.in));
                public static BufferedReader entradanumcajas= new BufferedReader(new InputStreamReader(System.in));
                public static BufferedReader entradanumcajas1= new BufferedReader(new InputStreamReader(System.in));
                public static BufferedReader entradaRespuesta= new BufferedReader(new InputStreamReader(System.in));

public static void main(String[] args) throws IOException
{
    String Usuario;
    String Contraseña;
    String Respuesta;
    int num = Integer.parseInt(entradanumero.readLine());
    int preciocajas = 50;
    int numcajas = 0;
    double totalcajas = 0;
    int numcajas1 = 0;
    double ventatotalcajas= 0;
    int totalventas = 0;
    int ventacajas= 55;
    double montototal= 0;
    double dinerocaja= 0;
    totalcajas = preciocajas * numcajas ;
    ventatotalcajas = ventacajas * numcajas1;
     montototal= totalcajas - ventatotalcajas;
     dinerocaja= 5000;
     double totaloperaciones= 0;
     double totalcompras =0;
     double dinerototal =0;
   // 
    System.out.println("Hola, Porfavo ingrese su usuario: nombre, apeliidop,apellidom todo en minúsculas");
    Usuario= String.valueOf(entradaUsuario.readLine());
    
    
    System.out.println("Porfavo ingrese su contraseña: ddmmaa");
    Contraseña= String.valueOf(entradaContraseña.readLine());
    
            while ((!Usuario.equals("carlosrojastalavera") && !Contraseña.equals("030805") ))
            {
              System.out.println("Contraseña o Usuario incorrectos vuelva a intentar");
              
              System.out.println("Hola, Porfavo ingrese su usuario: nombre, apeliidop,apellidom todo en minúsculas");
              Usuario= String.valueOf(entradaUsuario.readLine());
    
    
              System.out.println("Porfavo ingrese su contraseña: ddmmaa");
              Contraseña= String.valueOf(entradaContraseña.readLine());
    
            }
System.out.println("Bienvenido Carlos ¿que deseas hacer?");
System.out.println("Presiona 1 para (Comprar cajas de papel), 2 para (Vender cajas de papel), 3 para(Mostrar reporte)o 4 para(Salir del programa)");
do {
switch(num){
    

    case 1: // Compra de cajas de papel

             System.out.println("¿Cuantas cajas deseas comprar?");
             numcajas= Integer.parseInt(entradanumcajas.readLine());
             System.out.println("El precio de comprar " + numcajas + " al costo de " + preciocajas+ " es " + totalcajas + "$" );
              totalcompras = totalcompras + numcajas;      
break;

    case 2: // Venta de cajas de papel
             System.out.println("¿Cuantas cajas deseas vender?");
             numcajas1= Integer.parseInt(entradanumcajas.readLine());
             System.out.println("El valor de vender " + numcajas1 + " al precio de " + ventacajas + " cada una es de " + ventatotalcajas + "$");
             
              totalventas = totalventas + numcajas1; 
             
             
        break;
        
    case 3:// Mostrar Reporte
        System.out.println("Los datos de su reporte son: ");
        System.out.println("Cantidad de ventas: " + numcajas);
        System.out.println("Numero de ventas: " + numcajas1);
        System.out.println("Los ingresos por ventas son : " + ventatotalcajas + "$");
        System.out.println("Tus egresos por compras son : " + totalcajas + "$");
        System.out.println("Tu ganancia de hoy es : " + montototal);
        System.out.println("Tu dinero en caja es : " + dinerocaja);

        break;

        
    case 4:// Salir del programa
                System.out.println("¿Seguro que desea salir del programa? ");
              Respuesta = String.valueOf(entradaRespuesta.readLine());
      if (Respuesta.equals("si"))
              {
         System.out.println("Gracias por utilizar el programa");
         System.out.println("El total de operaciones realizadas fue de " + totaloperaciones);
         System.out.println("El numero total de compras fue de " + totalcompras);
         System.out.println("El numero total de ventas fue de  " + totalventas);
         System.out.println("El dinero total en la caja es de " + dinerototal + "$");         
         System.out.println("La ganancia de ventas fue de " + ventatotalcajas + "$");
         System.out.println("Los egresos fueron de " + totalcajas + "$");

         totaloperaciones = totalventas + totalcompras;
         dinerototal= montototal + dinerocaja;
              }
      else 
      {
 do {
switch(num){
    

    case 1: // Compra de cajas de papel

             System.out.println("¿Cuantas cajas deseas comprar?");
             numcajas= Integer.parseInt(entradanumcajas.readLine());
             System.out.println("El precio de comprar " + numcajas + " al costo de " + preciocajas+ " es " + totalcajas + "$" );
              totalcompras = totalcompras + numcajas;      
break;

    case 2: // Venta de cajas de papel
             System.out.println("¿Cuantas cajas deseas vender?");
             numcajas1= Integer.parseInt(entradanumcajas.readLine());
             System.out.println("El valor de vender " + numcajas1 + " al precio de " + ventacajas + " cada una es de " + ventatotalcajas + "$");
             
              totalventas = totalventas + numcajas1; 
             
             
        break;
        
    case 3:// Mostrar Reporte
        System.out.println("Los datos de su reporte son: ");
        System.out.println("Cantidad de ventas: " + numcajas);
        System.out.println("Numero de ventas: " + numcajas1);
        System.out.println("Los ingresos por ventas son : " + ventatotalcajas + "$");
        System.out.println("Tus egresos por compras son : " + totalcajas + "$");
        System.out.println("Tu ganancia de hoy es : " + montototal);
        System.out.println("Tu dinero en caja es : " + dinerocaja);

        break;

        
    case 4:// Salir del programa
                System.out.println("¿Seguro que desea salir del programa? ");
              Respuesta = String.valueOf(entradaRespuesta.readLine());
      if (Respuesta.equals("si"))
              {
         System.out.println("Gracias por utilizar el programa");
         System.out.println("El total de operaciones realizadas fue de " + totaloperaciones);
         System.out.println("El numero total de compras fue de " + totalcompras);
         System.out.println("El numero total de ventas fue de  " + totalventas);
         System.out.println("El dinero total en la caja es de " + dinerototal + "$");         
         System.out.println("La ganancia de ventas fue de " + ventatotalcajas + "$");
         System.out.println("Los egresos fueron de " + totalcajas + "$");

         totaloperaciones = totalventas + totalcompras;
         dinerototal= montototal + dinerocaja;
              }
      else 
      {
          
      }
        break;
        
}     
} while (!"4".equals(num));             
      }
        break;
        
}     
} while (!"4".equals(num));    
}
}

