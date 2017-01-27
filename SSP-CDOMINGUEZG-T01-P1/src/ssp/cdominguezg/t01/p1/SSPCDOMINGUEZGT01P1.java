/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.cdominguezg.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SSPCDOMINGUEZGT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Catalina Guadalupe Domínguez Garza
    //Matrícula: A01411583
    //Carrera: IIS
    System.out.println("Calculadore de promedio");
        double cal1, cal2, cal3, cal4, cal5, pro;
        int mat;
        String res;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce tu matrícula");
        mat= teclado.nextInt();
        System.out.println("Introduce la primera calificación");
        cal1= teclado.nextDouble();
        System.out.println("Introduce la segunda calificación");
        cal2= teclado.nextDouble();
        System.out.println("Introduce la tercera calificación");
        cal3= teclado.nextDouble();
        System.out.println("Introduce la cuarta calificación");
        cal4= teclado.nextDouble();
        System.out.println("Introduce la quinta calificación");
        cal5= teclado.nextDouble();
        pro=(cal1+cal2+cal3+cal4+cal5)/5;
        System.out.println("Tu promedio es " +pro);
        if (pro>=7.0){
        res = ("APROBADO");
            System.out.println("Estás " +res);       
        } else {
        res = ("REPROBADO");
            System.out.println("Estás " +res);
        }
    }
    
}
