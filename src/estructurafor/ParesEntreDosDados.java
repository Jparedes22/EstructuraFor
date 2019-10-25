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
public class ParesEntreDosDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();
       
        for (int i = num1; i <= num2; i++) {
            int resto=i%2;
            if(resto==0){
                System.out.printf("El número %d es par %n",i);
            }
        }
    }
}
