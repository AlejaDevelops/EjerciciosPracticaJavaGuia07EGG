/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageEjercicios;

/**
 *
 * @author Computador 1
 */
public class E15Vector100Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int [100];
        llenarVector(vector);
        
        
        
        
    }
    
    public static void llenarVector(int[] vector){
        for (int i = 100; i > 0; i--) {
            int j=0;
            vector[j]=i;
            System.out.print(" " +vector[j]+ " ");
            j++;
            
        }
        System.out.println("");
    }
}
