/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.dos.vector;

import java.util.Scanner;

/**
 *
 * @author Johan Castillo
 */
public class Matriz implements OrientacionInterface{
    private int tamaño;
    private int [][]matriz;
    private int i,j,aux;
    Scanner leer = new Scanner(System.in);
    
    public void llenar(){
        
        System.out.println("DIGA EL TAMAÑO DE LA MATRIZ \nRECUERDE QUE ES UNA MATRIZ CUADRADA");
        tamaño=leer.nextInt();
        matriz=new int [tamaño][tamaño];
        for(i=0;i<tamaño;i++){
            for(j=0;j<tamaño;j++){
                System.out.println("DIGITE LA POSICION # "+" fila "+(i+1)+" columna "+(j+1));
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    public void imprimir(){
         for(i=0;i<tamaño;i++){
             System.out.println("  ");
            for(j=0;j<tamaño;j++){
                System.out.print("     "+matriz[i][j]);
                
            }
        }
         System.out.println("\n");
         
         
    }

    
    public void descendente() {
        for( int i=0; i < tamaño; i++){
            for( int j=0;j< tamaño; j++){
                for(int aux1=0; aux1 < tamaño; aux1++){
                    for(int aux2=0; aux2 <tamaño; aux2++){
                        if(matriz[i][j] > matriz[aux1][aux2]){
                            int t = matriz[i][j];
                                matriz[i][j] = matriz[aux1][aux2];
                                matriz[aux1][aux2] = t;
                        }
                    }
                }
            } 
        }
        
        
        
    }

    
    public void ascendente() {
        for( int i=0; i < tamaño; i++){
            for( int j=0;j< tamaño; j++){
                for(int aux1=0; aux1 < tamaño; aux1++){
                    for(int aux2=0; aux2 <tamaño; aux2++){
                        if(matriz[i][j] < matriz[aux1][aux2]){
                            int t = matriz[i][j];
                                matriz[i][j] = matriz[aux1][aux2];
                                matriz[aux1][aux2] = t;
                        }
                    }
                }
            } 
        }
    }
    public int menu(){
        System.out.println("DIGITE UNO (1)PARA VOLVER AL MENU PRINCIPAL  ");
        System.out.println("DIGITE CERO (0) PARA SALIR");
        int k = leer.nextInt();
        return k;
    }
}
