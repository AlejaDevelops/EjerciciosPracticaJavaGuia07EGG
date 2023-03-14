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
public class E12StringClave {
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);   
      String frase;
      int corr=0;
      int incorr = -1;
        do {            
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            
            if (("X".equals(frase.substring(0, 1)))&&("O".equals(frase.substring(4, 5)))&&(frase.length()==5)) {
                corr+=1;
                
            }else {
                incorr+=1;
            }
                
        } while (!("&&&&&".equals(frase)));
        
        System.out.println("La cantidad de frases correctas son: " +corr);
        System.out.println("La cantidad de frases incorrectas son: " +incorr);
    }
    
}
