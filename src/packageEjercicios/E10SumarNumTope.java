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
public class E10SumarNumTope {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("--------------------------------------");
        System.out.print("Ingresa el Valor Limte Positivo -- ");
        int valor = leer.nextInt();
        System.out.println("--------------------------------------");

        int suma=0;
        int i=0;
        int j=1;
        System.out.println("");
        System.out.println("Ingresa numeros para superar el limite");
        
        for(i=0; i<j; i++){
          int numeros = leer.nextInt();
          suma=numeros+suma;
          if (suma>valor){
              System.out.println("El numero limite fue "+ valor);
              System.out.println("La suma de los numeros ingresados es "+ suma);
              break;
          }
        j++;
        }
    }
}
   
        
  
