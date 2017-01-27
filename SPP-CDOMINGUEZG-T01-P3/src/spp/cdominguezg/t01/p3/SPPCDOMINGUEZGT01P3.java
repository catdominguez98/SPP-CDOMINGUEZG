/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdominguezg.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPCDOMINGUEZGT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Catalina Guadalupe Domínguez Garza
    //Matrícula: A01411583
    //Carrera: IIS
    System.out.println("Calculadora de distancia entre dos puntos");
    double x1, x2, y1, y2, dis;
    Scanner teclado=new Scanner (System.in);
    System.out.println("Introduce el punto X1");
    x1=teclado.nextDouble();
    System.out.println("Introduce el punto Y1");
    y1=teclado.nextDouble();
    System.out.println("Introduce el punto X2");
    x2=teclado.nextDouble();
    System.out.println("Introduce el punto Y2");
    y2=teclado.nextDouble();
    dis=Math.sqrt((Math.pow(x1-x2, 2))+ (Math.pow(y1-y2,2)));
    System.out.println("La distancia entre los dos puntos es de: " +dis);
    }
    
}
