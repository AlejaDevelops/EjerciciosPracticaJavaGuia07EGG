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
public class E20CuadradoMagicoMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int num=0;
        int num2=0;
        boolean resultadoFilas;
        boolean resultadoColumnas;
        boolean resultadoDiagonales;
        
        
 
        System.out.println("Ingresa los valores de la matriz ");
        
         for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                num = leer.nextInt();
                if (num>0 && num<10) {
                    matriz[i][j] = num;
                    System.out.println("Usted registró el num "+num+" en la posición "+i+","+j);
                } else {
                    j--;
                }  
            }
         }
         
        
        //Impresión de matriz
        System.out.println("MATRIZ");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" "+matriz[j][k]+ " ");
            }
            System.out.println(" ");    
        }
        System.out.println(" "); 
        
        resultadoFilas= sumaFila(matriz);
        resultadoColumnas = sumaColumna(matriz);
        resultadoDiagonales = sumaDiagonal(matriz);
        
        System.out.println("¿La suma de las filas es igual a 15? " +resultadoFilas);
        System.out.println("¿La suma de las columnas es igual a 15? " +resultadoColumnas);
        System.out.println("¿La suma de las diagonales es igual a 15? " +resultadoDiagonales);
        
        if (resultadoFilas==true && resultadoColumnas==true && resultadoDiagonales==true ) {
            System.out.println("El cuadro ES MAGICO! ;)");
        } else {
            System.out.println("El cuadro NO ES MAGICO! :(");
        }
        
    }
    
    public static boolean sumaFila(int[][] matriz){
        int sumaFila = 0;
        int sumaFila1 =0; 
        int sumaFila2 =0;
        boolean cumple =false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0) { //SumaFila0
                    sumaFila = sumaFila + matriz[i][j];
                }else{
                    if (i==1) {//SumaFila1
                    sumaFila1 = sumaFila1 + matriz[i][j];
                    }else{
                        if (i==2) {//SumaFila2
                            sumaFila2 = sumaFila2 + matriz[i][j];
                        }
 
                    }
                }  
            }
        }
        if (sumaFila==15 && sumaFila1==15 && sumaFila2==15) {
             cumple = true;   
        }
        return cumple;
    }
    
    public static boolean sumaColumna(int[][] matriz){
        int sumaColumna = 0;
        int sumaColumna1 = 0;
        int sumaColumna2 = 0;
        boolean cumple =false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0) { 
                    sumaColumna = sumaColumna + matriz[i][j];
                }else{
                    if (j==1) {
                    sumaColumna1 = sumaColumna1 + matriz[i][j];
                    }else{
                        if (j==2) {
                            sumaColumna2 = sumaColumna2 + matriz[i][j];
                        }
 
                    }
                }  
            }
        }
        if (sumaColumna==15 && sumaColumna1==15 && sumaColumna2==15) {
             cumple = true;   
        }
        return cumple;
        
    }
    
    public static boolean sumaDiagonal(int[][] matriz){
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        boolean cumple =false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) { 
                    sumaDiagonal1 = sumaDiagonal1 + matriz[i][j];
                }
                if (i+j==2) {
                    sumaDiagonal2 = sumaDiagonal2 + matriz[i][j];
                    
                }
 
                }  
            }
        
        if (sumaDiagonal1==15 && sumaDiagonal2==15) {
             cumple = true;   
        }
        return cumple;
        
    }
    
}

 /*for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (matriz[i][j] == num) {
                     System.out.println("El número " +num+ " se encuentra repetido");
                     System.out.println("Ingrese nuevamente el valor");
                     matriz[i][j] = leer.nextInt();
                         
                     
                 }
                 
             }
        }*/
