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
public class Dado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres tirar el dado?");
        int dado=sc.nextInt();
        if(dado<0){
           for( int i=1;i<=100;i++){
            int n = (int) (Math.random()*6 + 1);
            System.out.printf("El %dº número ha sido: %d%n",i,n);
        }
        }
        for( int i=1;i<=dado;i++){
            int n = (int) (Math.random()*6) + 1;
            System.out.printf("El %dº número ha sido: %d%n",i,n);
        }
    }
}
