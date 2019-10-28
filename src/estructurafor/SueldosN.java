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
public class SueldosN {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int numero;
        double sueldo;
        double max=0;
        int acumulador=0;
        System.out.println("¿Cuántos suledos quieres introducir?");
        numero=sc.nextInt();
        for(int i =1;i<=numero;i++){
            System.out.println("Introduzca los sueldos");
            sueldo=sc.nextDouble();
            if(sueldo>max){
                System.out.printf("El máximo sueldo es: %.2f%n",sueldo);
                max=sueldo;
            }
        }
        
    }
}
