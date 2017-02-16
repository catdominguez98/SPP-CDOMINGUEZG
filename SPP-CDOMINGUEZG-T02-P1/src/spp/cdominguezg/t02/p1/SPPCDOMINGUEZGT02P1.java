/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdominguezg.t02.p1;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPCDOMINGUEZGT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    int cate, he, sue, pago;
        System.out.println("Calculadora de pago de horas extras");
        System.out.println("Selecciona la categoría a la que pertenezcas");
        System.out.println("1. Precio por hora extra: $30.00");
        System.out.println("2. Precio por hora extra: $38.00");
        System.out.println("3. Precio por hora extra: $50.00");
        System.out.println("4. Precio por hora extra: $70.00");
        System.out.println("5. Precio por hora extra: $74.00");
        System.out.println("6. Precio por hora extra: $80.00");
        System.out.println("7. Precio por hora extra: $90.00");
        System.out.println("8. Precio por hora extra: $92.00");
        cate=kb.nextInt();
        if (cate>=1 && cate<=8){
            switch (cate){
                case 1:
                    System.out.println("Categoría 1");
                    pago=pagoCat1();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
                
                case 2:
                    System.out.println("Categoría 2");
                    pago=pagoCat2();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
                    
                case 3:
                    System.out.println("Categoría 3");
                    pago=pagoCat3();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
                    
                case 4:
                    System.out.println("Categoría 4");
                    pago=pagoCat4();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
                    
                case 5:
                    System.out.println("Categría  5");
                    pago=pagoCat5();
                    System.out.println("Tu pago v a ser igual a $" +pago);
                    break;
                    
                case 6:
                    System.out.println("Categoría 6");
                    pago=pagoCat6();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
                    
                case 7:
                    System.out.println("Categoría 7");
                    sue=pedirSue();
                    he=pedirHe();
                    pago=pagoCat7();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
                    
                case 8:
                    System.out.println("Categoría 8");
                    pago=pagoCat7();
                    System.out.println("Tu pago va a ser igual a $" +pago);
                    break;
            }
        } 
        
        else {
            System.out.println("Esa categoría no existe");
        }
        
        
        
    }
    
    public static int pedirSue(){
        int s;
        Scanner kb=new Scanner (System.in);
            System.out.println("Introduzca su sueldo");
            s=kb.nextInt();
        return s;    
    }
    
    public static int pedirHe(){
        int h;
        Scanner kb=new Scanner (System.in);
            System.out.println("Introduzca el número de horas extras que trabajó");
            h=kb.nextInt();
        return h;
    }
    
    static int pagoCat1(){
        int h, s;
        s=pedirSue();
        h=pedirHe( );
        return ((h*30)+s);
    }
    
    static int pagoCat2(){
        int h,s ;
        s=pedirSue();
        h=pedirHe();
        return ((h*38)+s);
    }
    
    static int pagoCat3(){
        int h, s;
        s=pedirSue();
        h=pedirHe();
        return ((h*50)+s);
    }
    
    static int pagoCat4(){
        int h, s;
        s=pedirSue();
        h=pedirHe();
        return ((h*70)+s);
    }
    
    static int pagoCat5(){
        int h, s;
        s=pedirSue();
        h=pedirHe();
        return ((h*74)+s);
    }
    
    static int pagoCat6(){
        int h, s;
        s=pedirSue();
        h=pedirHe();
        return ((h*80)+s);
    }
    
    static int pagoCat7(){
        int h, s;
        s=pedirSue();
        h=pedirHe();
        return ((h*90)+s);
    }
    
    static int pagoCat8(){
        int h, s;
        s=pedirSue();
        h=pedirHe();
        return((h*92)+s);
    }
}