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
public class CuadroFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado del cudadrado");
        int lado = sc.nextInt();
        
        for(int i=1;i<=lado;i++){
            for(int j=1;j<=lado;j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
