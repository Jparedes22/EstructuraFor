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
        Scanner sc = new Scanner(System.in);
        String palabra;
        String palabraInvertida = "";
        System.out.println("Introduce una palabra");
        palabra = sc.next();
        int longitud = palabra.length();

        for (int i = longitud - 1; i >= 0; i--) {

            System.out.print(palabra.charAt(i));
        }

    }
}
