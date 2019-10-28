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
public class NotasTipos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota;
        int contadorA = 0;
        int contadorC = 0;
        int contadorS = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Intoduce la nota");
            nota=sc.nextDouble();
            if(nota<0||nota>10){
                System.out.println("La nota introducida no es correcta");
            }else if(nota<4){
                contadorS++;
            }else if(nota==4){
                contadorC++;
            }else{
                contadorA++;
            }
            
        }
        System.out.printf("El número de suspensos es: %d%n",contadorS);
        System.out.printf("El número de aprobados es: %d%n",contadorA);
        System.out.printf("El número de notas condicionadas es: %d%n",contadorC);
        
        
    }
}
