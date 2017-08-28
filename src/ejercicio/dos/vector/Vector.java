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
public class Vector implements OrientacionInterface{
    private int tamaño=100;
    private int []vector;
    private int i,j,aux;
    Scanner leer = new Scanner(System.in);
    
    
    public void llenar(){
        
        System.out.println("DIGA EL TAMAÑO DEL VECTOR ");
        tamaño=leer.nextInt();
        vector=new int[tamaño];
        for(int i=0; i<vector.length;i++){
            System.out.println("DIGITE LA POSICION # "+(i+1));
            vector[i]=leer.nextInt();
        }
        
    }

    
    public void ascendente() {
        for (i=0;i<(tamaño-1);i++){
            for(j=i+1;j<tamaño;j++){
                if (vector[j]<vector[i]){
                    aux=vector[j];
                    vector[j]=vector[i];
                    vector[i]=aux;
                }
                
            }
        }
       
        
        
        
    }

    
    public void descendente() {
        for (i=0;i<(tamaño-1);i++){
            for(j=i+1;j<tamaño;j++){
                if (vector[j]>vector[i]){
                    aux=vector[j];
                    vector[j]=vector[i];
                    vector[i]=aux;
                }
                
            }
        }
        
        
    }
    public void imprimir(){
        System.out.println("\n");
        for (i=0;i<vector.length;i++){
            System.out.print(" \t"+vector[i]);
        }
        System.out.println(" \n");
        
        
    }
    public int menu(){
        System.out.println("DIGITE UNO (1)PARA VOLVER AL MENU PRINCIPAL  ");
        System.out.println("DIGITE CERO (0) PARA SALIR");
        int k = leer.nextInt();
        return k;
    }
    
}
