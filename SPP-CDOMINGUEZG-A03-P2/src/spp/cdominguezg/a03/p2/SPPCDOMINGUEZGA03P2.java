/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdominguezg.a03.p2;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPCDOMINGUEZGA03P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Calculadora de tangente");
    double ang, tan;
    Scanner teclado=new Scanner (System.in);
    System.out.println("Introduce el valor del ángulo:");
    ang=teclado.nextDouble();
    ang=Math.toRadians(ang);
    tan=Math.tan(ang);
    System.out.println("El valor de la tangente es: " +tan);
    
    }
    
}
