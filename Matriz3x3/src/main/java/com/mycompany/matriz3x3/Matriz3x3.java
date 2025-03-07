package com.mycompany.matriz3x3;

import java.util.Random;

public class Matriz3x3 {

    public static void main(String[] args) {
        int matriz [][] = new int[3][3];
        Random random = new Random();
        int sumaDiagonal =0;
        
        System.out.println("Matriz de 3x3");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz [i][j] = random.nextInt(100)+1;
                System.out.print(matriz [i][j]+"\t");
        
                if(i==j){    
                    sumaDiagonal += matriz[i][j];
                }
        }
            System.out.println();
        }
        System.out.println("La suma de la diagonal es: "+sumaDiagonal);
     
        
    }
}
