/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //manera de crear matriz
        // tipo de variable [][](los que sean) nombre de la variables = y ahora dos formas, conociendo valores o no conociendo
        //conociendo valores new + tipo de variable + [fila][columna];
        //no se puede pintar directamente con arraytostring porque espera pintar una fila, no todo del tirón. hay 2 maneras de mostrar:
        
        int [][] matriz = new int [3][3];
       int cont=1;
        
        //mostrar 1 forma
        
        for (int i = 0; i < matriz.length; i++) {   //nº de filas
            for (int j = 0; j < matriz[i].length; j++) {   //nº de columnas
                System.out.print(matriz[i][j] + " ");       // sin LN
            }
            System.out.println(" ");
        }

        
        //mostrar 2 forma

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        
        //cambiar el medio por un 5
         matriz[1][1]=5;
         
       for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
       }
       
       
       //ahora del 1 al 0 de izq a derecha
       
       
          
        for (int i = 0; i < matriz.length; i++) {  
          
            for (int j = 0; j < matriz[i].length; j++) {  
                  matriz[i][j]=cont;
                  cont++;  
            }
        }
        
              for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
               }
       
       
              
             //CONOCIENDO LOS VALORES
             
             
             int [][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}}; //nºs son columnas y corchetes de dentro son filas
              
               for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz1[i]));
               }
              
              
              
        char [][] matriz2 = new char [4][2];
        
                
          //rellenar
     
              for (int i = 0; i < matriz2.length; i++) {
                  for (int j = 0; j < matriz2[i].length; j++) {
                      matriz2[i][j]= 'A';
                  
                  }
           
               }
              //alternativa
              /*for (int i = 0; i < matriz2.length; i++) {
                  Arrays.fill(matriz2[i], 'A');
                 }*/
              
          //mostrar
          
            for (int i = 0; i < matriz2.length; i++) {
                System.out.println(Arrays.toString(matriz2[i]));
             }
                 
          
         //Ahora una de esas A's una será aleatoriamente una B
              
         matriz2[(int) (Math.random()*4)] [(int) (Math.random()*2)] = 'B';      
             
           for (int i = 0; i < matriz2.length; i++) {
                System.out.println(Arrays.toString(matriz2[i]));
             }      
                 
                 
                 
                 
                 
   }
    
}
