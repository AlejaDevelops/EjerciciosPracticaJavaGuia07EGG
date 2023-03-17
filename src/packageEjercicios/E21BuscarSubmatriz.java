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
public class E21BuscarSubmatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("BUSCANDO LA SUBMATRIZ");
        System.out.println("=====================");
        System.out.println("");
        System.out.println("Ingrese la dimensión de la matriz M: ");
        int m = leer.nextInt();
        System.out.println("Ingrese la dimensión de la matriz P: ");
        int p = leer.nextInt();
        System.out.println("");
        int[][] matriz1 = new int [m][m]; 
        int[][] matriz2 = new int [p][p];
        
        ///NOTA: Activar solo uno de los dos métodos de llenados de las matrices, no ejecutar al tiempo!
        
        //METODO 1 LLENADO MANUAL DE MATRICES - OJO Para Dim1=10 y Dim2=3
        //int[][] matrizM = llenarMatriz1Manual(matriz1);
       //int[][] matrizP =llenarMatriz2Manual(matriz2);
        
        //METODO 2 LLENADO ALEATORIO DE MATRICES:
        int[][] matrizM = llenarMatriz(matriz1, m);
        int[][] matrizP =llenarMatriz(matriz2, p);
        
        impreMatriz(matrizM, m, 1);
        impreMatriz(matrizP, p, 2);
        
        buscarSubmatriz(matrizM, matrizP, m, p);
        
        System.out.println("====== FIN ======");
    }
    
    //Función 1 Llenado aleatorio de matrices 
    public static int[][] llenarMatriz(int[][] matriz, int dim){
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j]= (int)(Math.random()*100);
            }
        }
        return matriz;
    }
    
    //Función 1.1 Llenado manual de matriz 1
    public static int[][] llenarMatriz1Manual(int[][] matriz1){
        
        matriz1[0][0]=1;
        matriz1[0][1]=26;
        matriz1[0][2]=36;
        matriz1[0][3]=47;
        matriz1[0][4]=5;      
        matriz1[0][5]=6;
        matriz1[0][6]=72;       
        matriz1[0][7]=81;     
        matriz1[0][8]=95;   
        matriz1[0][9]=10;
        matriz1[1][0]=11;  
        matriz1[1][1]=12;
        matriz1[1][2]=13;
        matriz1[1][3]=21;
        matriz1[1][4]=41;
        matriz1[1][5]=22;
        matriz1[1][6]=67;
        matriz1[1][7]=20;
        matriz1[1][8]=10;
        matriz1[1][9]=61;
        matriz1[2][0]=56;  
        matriz1[2][1]=78;
        matriz1[2][2]=87;
        matriz1[2][3]=90;
        matriz1[2][4]=9;
        matriz1[2][5]=90;
        matriz1[2][6]=17;
        matriz1[2][7]=12;
        matriz1[2][8]=87;
        matriz1[2][9]=67;
        matriz1[3][0]=41;  
        matriz1[3][1]=87;
        matriz1[3][2]=24;
        matriz1[3][3]=56;
        matriz1[3][4]=97;
        matriz1[3][5]=74;
        matriz1[3][6]=87;
        matriz1[3][7]=42;
        matriz1[3][8]=64;
        matriz1[3][9]=35;
        matriz1[4][0]=32;  
        matriz1[4][1]=76;
        matriz1[4][2]=79;
        matriz1[4][3]=1;
        matriz1[4][4]=36;
        matriz1[4][5]=5;
        matriz1[4][6]=67;
        matriz1[4][7]=96;
        matriz1[4][8]=12;
        matriz1[4][9]=11;
        matriz1[5][0]=99;  
        matriz1[5][1]=13;
        matriz1[5][2]=54;
        matriz1[5][3]=88;
        matriz1[5][4]=89;
        matriz1[5][5]=90;
        matriz1[5][6]=75;
        matriz1[5][7]=12;
        matriz1[5][8]=41;
        matriz1[5][9]=76;
        matriz1[6][0]=67;  
        matriz1[6][1]=78;
        matriz1[6][2]=87;
        matriz1[6][3]=45;
        matriz1[6][4]=14;
        matriz1[6][5]=22;
        matriz1[6][6]=26;
        matriz1[6][7]=42;
        matriz1[6][8]=56;
        matriz1[6][9]=78;
        matriz1[7][0]=98;  
        matriz1[7][1]=45;
        matriz1[7][2]=34;
        matriz1[7][3]=23;
        matriz1[7][4]=32;
        matriz1[7][5]=56;
        matriz1[7][6]=74;
        matriz1[7][7]=16;
        matriz1[7][8]=19;
        matriz1[7][9]=18;
        matriz1[8][0]=24;  
        matriz1[8][1]=67;
        matriz1[8][2]=97;
        matriz1[8][3]=46;
        matriz1[8][4]=87;
        matriz1[8][5]=13;
        matriz1[8][6]=67;
        matriz1[8][7]=89;
        matriz1[8][8]=93;
        matriz1[8][9]=24;
        matriz1[9][0]=21;  
        matriz1[9][1]=68;
        matriz1[9][2]=78;
        matriz1[9][3]=98;
        matriz1[9][4]=90;
        matriz1[9][5]=67;
        matriz1[9][6]=12;
        matriz1[9][7]=41;
        matriz1[9][8]=65;
        matriz1[9][9]=12;
        
        return matriz1;
    }
    
    
     //Función 1.2 Llenado manual de matriz 2
    public static int[][] llenarMatriz2Manual(int[][] matriz2){
        
        matriz2[0][0]=36;
        matriz2[0][1]=5;
        matriz2[0][2]=67;
        matriz2[1][0]=89;  
        matriz2[1][1]=90;
        matriz2[1][2]=75;
        matriz2[2][0]=14;  
        matriz2[2][1]=22;
        matriz2[2][2]=26;
       
        return matriz2;
    }
    
    //Procedimiento 1 Impresión de matrices
    public static void impreMatriz(int[][] matriz, int dim, int id){
        System.out.println("MATRIZ "+id);
        
        for (int i = 0; i < dim; i++) {
            System.out.print("|");
            for (int j = 0; j < dim; j++) {
                String value = String.format("%2s", matriz[i][j]);
                System.out.print(" " + value + " ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("");
        
    }
    
    public static void buscarSubmatriz(int[][]matrizM, int matrizP[][], int m, int p){
        int cont = 0;
        
        for (int i = 0; i < m-p; i++) {
            for (int j = 0; j < m-p; j++) {
                if (matrizP[0][0] == matrizM[i][j]) {
                    System.out.println("Se encontró una coincidencia en la posición ("+i+","+j+")");
                    System.out.println("Se evaluarán las siguientes posiciones");
                    System.out.println("...");
                    
                    for (int k = 0; k < p; k++) {
                        for (int l = 0; l < p; l++) {
                            
                            if (matrizP[k][l] == matrizM[k+i][l+j]) {
                                cont++;
                            }
                        }
                    }
                    System.out.println("La cantidad de valores que coinciden es: "+cont);
                    if (cont==p*p) {
                        System.out.println("La matriz P sí está contenida en la matriz M");
                    } else{
                        System.out.println("La matriz P no está contenida en la matriz M");
                        cont=0;
                    }    

                }
            }
        }
        if (cont==0) {
            System.out.println("No se encontraron conincidencias válidas, en el primer número de ambas matrices");
        }
    }
}
    

