/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.cdominguezg.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SSPCDOMINGUEZGT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Calculadora de perímetro y superficie de un rectángulo");
    double sup, per, base, altu;
    Scanner teclado=new Scanner (System.in);
    System.out.println("Introduce el valor de la base del rectángulo");
    base= teclado.nextDouble();
    System.out.println("Introduce el valor de la altura del rectángulo");
    altu= teclado.nextDouble();
    sup=base*altu;
    per=(2*base)+(2*altu);
    System.out.println("La superficie del rectángulo es :" +sup);
    System.out.println("El perímetro del rectángulo es :" +per);
    }
    
}
