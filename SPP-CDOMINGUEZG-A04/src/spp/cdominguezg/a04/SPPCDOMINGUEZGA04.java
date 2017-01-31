/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdominguezg.a04;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPCDOMINGUEZGA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opEntrada;
    double ang, razon;
    Scanner kb=new Scanner (System.in);
    System.out.println("Calculadora de razones trigonométricas");
    System.out.println("Introduzca la opción deseada");
    System.out.println("1. Calcular tangente");
    System.out.println("2. Calcular seno");
    System.out.println("3. Calcular coseno");
    System.out.println("4. Salir");
    opEntrada=kb.nextInt();
    switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de tangente");
                razon=Math.tan(mensajePedirDatos());
                System.out.println("El valor de la tangente es " +razon);
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de seno");
                razon=Math.sin(mensajePedirDatos());
                System.out.println("El valor del seno es " +razon);
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de coseno");
                razon=Math.cos(mensajePedirDatos());
                System.out.println("El valor del coseno es " +razon);
                break;
            default:
                System.out.println("Adiós");
    }
    }
    
    static double mensajePedirDatos(){
        double ang;
        Scanner kb=new Scanner (System.in);
        System.out.println("Introduce un ángulo de entre 0° y 360°");
        ang=kb.nextDouble();
        return ang;
    
}
}
