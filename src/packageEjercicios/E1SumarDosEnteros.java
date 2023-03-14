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
public class E1SumarDosEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos números: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("La suma del número "+num1+" y el número "+num2+" es: " +(num1+num2));
    }
    
}
