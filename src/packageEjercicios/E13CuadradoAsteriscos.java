/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageEjercicios;

import java.util.Scanner;

/**
 *
 * @author Computador 1
 */
public class E13CuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de elementos que deseas para formar el cuadrado: ");
        int num = leer.nextInt();
                
        for (int i = 0; i < num; i++) {
             
            System.out.println("");  
            for (int j = 0; j < num; j++) {
                
                if ((i<1) || (i>num-2)) {
                    System.out.print("*");
                }
                
                if (((i>0) && (i<num-1))) {
                    if (((j<1) || (j>num-2))) {
                        System.out.print("*");
                                    
                    } else{
                    
                        System.out.print(" ");
                    }
                        
                }
 
            }
        }
        System.out.println("");        
                
    }
    
}
