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
public class E3UpperLowerCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("Tu frase en mayusculas es: "+(frase.toUpperCase()));
        System.out.println("Tu frase en minúsculas es: "+(frase.toLowerCase()));
        
    }
    
}
