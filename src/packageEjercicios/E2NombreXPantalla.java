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
public class E2NombreXPantalla {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuál es tu nombre?");
        String nombre = leer.nextLine();
        
        System.out.println("Tu nombre es: " +nombre);
    }
    
}
