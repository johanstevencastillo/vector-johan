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
public class EJERCICIODOSVECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Vector vector = new Vector();
        Matriz matriz = new Matriz();
        int opcion,opcion2,menu=1,m=5;
        
        while(menu==1){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");        
        System.out.println("$$    MENU  PRINCIPAL    $$");
        System.out.println("$$  1--VECTOR            $$");
        System.out.println("$$  2--MATRIZ            $$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("\n DIGITE EL NUMERO DE OPCION\n    QUE DESEA REALIZAR ");
        opcion=leer.nextInt();
        
        
        switch(opcion){
            case 1:{
                vector.llenar();
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("$$         VECTOR         $$");
                System.out.println("$$  1--ORDEN ASCENDENTE   $$");
                System.out.println("$$  2--ORDEN DESCENDENTE  $$");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("ESCOJA UNA OPCION (1)O(2)");
                opcion2=leer.nextInt();
                if (opcion2==1){
                    vector.ascendente();
                    vector.imprimir(); 
                    m=vector.menu();
                }else{
                    if(opcion2==2){
                        vector.descendente();
                        vector.imprimir();
                        m=vector.menu();
                    }
                }
                 
                break;
            }
            case 2:{
                matriz.llenar();
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("$$         MATRIZ         $$");
                System.out.println("$$  1--ORDEN ASCENDENTE   $$");
                System.out.println("$$  2--ORDEN DESCENDENTE  $$");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("ESCOJA UNA OPCION (1)O(2)");
                opcion2=leer.nextInt();
                if (opcion2==1){
                    matriz.ascendente();
                    matriz.imprimir(); 
                    m=vector.menu();
                    
                }else{
                    if(opcion2==2){
                        matriz.descendente();
                        matriz.imprimir();
                        m=vector.menu();
                    }
                }
                break;
                
            }
        }
        menu=m;
        } 
        
}
}
