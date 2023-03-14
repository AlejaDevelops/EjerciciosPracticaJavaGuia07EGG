/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageEjercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Computador 1
 */
public class E14ConversorMonedas {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("*** CONVERSOR DE EUROS ***");
        System.out.println("Introduzca la cantidad en Euros");
        double euros = leer.nextInt();
        System.out.println("Introduce el tipo de moneda");
        String tipoMoneda = leer.next();
        
        conversorMoneda (euros,tipoMoneda);
        
    }
    
    public static void conversorMoneda (double euros,String tipoMoneda){
        switch (toLowerCase(tipoMoneda)){
           
            case "euro":
                double rEuro = euros*0.86;
                System.out.println("La cantidad de "+tipoMoneda+ " introducida es: "+rEuro);
                break;
                
            case "dolares":
                double rDolar = euros*1.28611;
                System.out.println("La cantidad de "+tipoMoneda+ " introducida es: "+rDolar);
                break;
           
            case "yenes":
                double rYenes = euros*129.852;
                System.out.println("La cantidad de "+tipoMoneda+ " introducida es: "+rYenes);
                break;   
                
            default:
                System.out.println("Moneda inválida");
                    
                    
                
                    
        }
        
        
    }
}
