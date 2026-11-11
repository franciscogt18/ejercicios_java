/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class ADN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //busca donde haya una G y donde la haya cámbiala por una T, y vuelve a mostrar la hebra
        
         char [] hebra = {'A', 'T', 'G', 'C', 'T', 'T', 'G', 'A', 'T'}; 
         //Mostrar
        for (int i = 0; i < hebra.length; i++) {
            System.out.print(hebra[i] + " ");   
       }
        System.out.println(" ");
        //Recorrer. Cambiamos las Gs por Ts.
        for (int i = 0; i < hebra.length; i++) {
            if (hebra[i]=='G') {
             hebra[i]='T';      
            }
        //Mostramos de nuevo
        System.out.print(hebra[i] + " ");
        }
        
        
        System.out.println("");
        
        
        //---------------------------El atajo mágico "Arrays".-----------------
        
        System.out.println(Arrays.toString(hebra));
    
     //Haz una hebra nueva de tamaño 11 pero que empiece por A y termine por A.
     
         char [] hebra2 = new char [hebra.length+2];
         
         for (int i = 0; i < hebra.length; i++) {
         hebra2[i+1]=hebra[i];   
        }
         
        hebra2[0]='A';
        hebra2[10]='A';
        
         System.out.println(Arrays.toString(hebra2));
    }
    
}
