/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Factoial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número para calcular su factorial");
        int num = sc.nextInt();
        for (int i = num-1; i >= 1; i--) {
             num=num*i;
            System.out.println(num);
        }

    }
}
