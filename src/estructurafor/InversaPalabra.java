/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author neosu
 */
public class InversaPalabra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String palabra;
        String palabraInvertida="";
        System.out.println("Introduce una palabra");
        palabra=sc.next();
         for (int i = palabra.length()-1; i>=0; i--){
            palabraInvertida += palabra.charAt(i);
        }
 
        System.out.println("La palabra invertida es:\n"+ palabraInvertida);
    }
}
