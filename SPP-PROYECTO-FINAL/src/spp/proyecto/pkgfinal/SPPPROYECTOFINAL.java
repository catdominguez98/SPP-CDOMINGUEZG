/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyecto.pkgfinal;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPPROYECTOFINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opEntrada;
    double valor, resultado;
    Scanner kb=new Scanner (System.in);
    
    
    System.out.println("Calculadora de conversiones");
    System.out.println("Sistema Métrico Decimal - Sistema Inglés");
    System.out.println("Introduce la opción deseada");
    System.out.println("1. Conversión de líquidos");
    System.out.println("2. Conversión de distancias");
    System.out.println("3. Conversión de temperaturas");
    System.out.println("4. Conversión de pesos");
    System.out.println("5. Salir");
    opEntrada=kb.nextInt();
    
    switch (opEntrada){
    
        case 1:
            System.out.println("Bienvenido a la conversión de líquidos");
            System.out.println("Elija la opción deseada");
            int caso;
            System.out.println("1. De litros a galones");
            System.out.println("2. De galones a litros");
            caso=kb.nextInt();
            switch (caso){
            case 1:
                System.out.println("Conversión de litros a galones");
                valor= pedirValor();
                resultado=litrosGalones(valor);
                System.out.println("El valor equivale a " +resultado +"galones");
                break;
            case 2:
                System.out.println("Conversión de galones a litros");
                valor= pedirValor();
                resultado=galonesLitros(valor);
                System.out.println("El valor equivale a " +resultado +"litros");
                break;
            }
        break;
            
        case 2:
            System.out.println("Bienvenido a la conversión de distancias");
            System.out.println("Elija la opción deseada");
            System.out.println("1. De centimetros a pulgada");
            System.out.println("2. De pulgada a centrimetros");
            System.out.println("3. De metros a pies");
            System.out.println("4. De pies a metros");
            System.out.println("5. De kilometros a millas");
            System.out.println("6. De millas a kilometros");
            caso=kb.nextInt();
            switch (caso){
            case 1:
                System.out.println("Conversión de centimetros a pulgada");
                valor= pedirValor();
                resultado=centPulgada(valor);
                System.out.println("El valor equivale a " +resultado +"pulgada");
                break;
            case 2:
                System.out.println("Conversión de pulgada a centimetro");
                valor= pedirValor();
                resultado=pulgadaCent(valor);
                System.out.println("El valor equivale a " +resultado +"centimetros");
                break;
                
            case 3:
                System.out.println("Conversión de metros a pies");
                valor= pedirValor();
                resultado=metrosPies(valor);
                System.out.println("El valor equivale a " +resultado +"pies");
                break;
            
            case 4:
                System.out.println("Conversión de pies a metros");
                valor= pedirValor();
                resultado=piesMetros(valor);
                System.out.println("El valor equivale a " +resultado +"metros");
                break;
                
            case 5:
                System.out.println("Conversión de kilometros a millas");
                valor= pedirValor();
                resultado=kiloMillas(valor);
                System.out.println("El valor equivale a " +resultado +"millas");
                break;
            
            case 6:
                System.out.println("Conversión de millas a kilometros");
                valor= pedirValor();
                resultado=millasKilo(valor);
                System.out.println("El valor equivale a " +resultado +"kilometros");
                break;
            
            }
            
            
        break;
        
        case 3:
            System.out.println("Bienvenido a la conversión de temperaturas");
            System.out.println("Elija la opción deseada");
            System.out.println("1. De Celsius a Fahrenheit");
            System.out.println("2. De Fahrenheit a Celsius");
            caso=kb.nextInt();
            switch (caso){
            case 1:
                System.out.println("Conversión de Celsius a Fahrenheit");
                valor= pedirValor();
                resultado=celFah(valor);
                System.out.println("El valor equivale a " +resultado +"°F");
                break;
            case 2:
                System.out.println("Conversión de Fahrenheit a Celsius");
                valor= pedirValor();
                resultado=fahCel(valor);
                System.out.println("El valor equivale a " +resultado +"°C");
                break;
            }
          
            break;
                
        
        case 4:
            System.out.println("Bienvenido a la conversión de pesos");
            System.out.println("Elija la opción deseada");
            System.out.println("1. De gramos a libras");
            System.out.println("2. De libras a gramos");
            caso=kb.nextInt();
            switch (caso){
            case 1:
                System.out.println("Conversión de gramos a libras");
                valor= pedirValor();
                resultado=gramLibras(valor);
                System.out.println("El valor equivale a " +resultado +"libras");
                break;
            case 2:
                System.out.println("Conversión de libras a gramos");
                valor= pedirValor();
                resultado=librasGram(valor);
                System.out.println("El valor equivale a " +resultado +"gramos");
                break;
                }
            break;
            
        default:
            System.out.println("Adiós");
            
      }
    }
    
    public static double pedirValor(){
        double v;
        Scanner kb=new Scanner (System.in);
        System.out.println("Introduce el valor a convertir");
        v=kb.nextDouble();
        return v;
    }
    
    public static double litrosGalones(double valor){
        return(valor*0.264172);
    }
    
    static double galonesLitros (double valor){
        return(valor*3.7854);
    }
    
    static double centPulgada(double valor){
        return (valor*0.393701);
    }
    
    static double pulgadaCent (double valor){
        return (valor*2.54);
    }
    
    static double metrosPies (double valor){
        return (valor*3.28084);
    }
    
    static double piesMetros (double valor){
        return (valor*0.3048);
    }
    
    static double kiloMillas (double valor){
        return (valor*0.621371);
    }
    
    static double millasKilo (double valor){
        return (valor*1.60934);
    }
    
    static double celFah (double valor){
        return ((9/5)*valor)+32;
    }
    
    static double fahCel (double valor){
        return (valor-32)*(5/9);
    }
    
    static double gramLibras (double valor){
        return (valor*0.0022);
    }
    
    static double librasGram (double valor){
        return (valor*453.59);
    }
}
