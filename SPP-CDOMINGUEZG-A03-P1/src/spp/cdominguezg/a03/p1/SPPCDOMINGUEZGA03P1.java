/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdominguezg.a03.p1;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPCDOMINGUEZGA03P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Calculadora de hipotenusa");
    double catop, catady, hip;
    Scanner teclado=new Scanner (System.in);
    System.out.println("Introduce el valor del cateto opuesto: ");
    catop=teclado.nextDouble();
    System.out.println("Introduce el valor del cateto adyacente");
    catady=teclado.nextDouble();
    hip=Math.sqrt(Math.pow(catop, 2)+ Math.pow(catady, 2));
    System.out.println("La hipotenusa vale: " +hip);
    }
    
}
