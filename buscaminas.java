/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Ahorcadolimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //mete el usuario un array de 5. tengo 5 intentos para adivinar el array. Si esta biense verá y después los _. Si he llegado a cinco
        //y falle se sale, si he llegado se queda hasta que lo tenga.

Scanner sc = new Scanner (System.in);  
         char [] pass = {'a', 'r', 'b', 'o', 'l'};
         char [] usuario = {'_', '_', '_','_', '_'};
         char letra;
         int cont=5;
         
         
         for (int i = 0; i < usuario.length && cont>0; i++) {
            
             do {
                 System.out.println("Introduce la letra de la posición: " + i);
                 letra=sc.next().charAt(0);
                 
                 if (letra!=pass[i]) {
                     System.out.println("Incorrecto");
                     cont--;
                  }else{
                     usuario[i]=pass[i];
                   
                      
                     for (int j = 0; j < usuario.length; j++) {
                         System.out.print(usuario[j]);
                   
                     }
                 }
                 
                 
             } while (pass[i]!=usuario[i] && cont>0);
           
        }
  System.out.println(" ");          


    }
    
}
