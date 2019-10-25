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
public class Exponente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exp;
        int resul;
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("Intoduce el exponente");
        exp = sc.nextInt();
        if (exp == 0 && base == 0) {
            System.out.println("Fallo, no se puede calcular");
        } else if (exp == 0) {
            System.out.println("El resultado es 1");
        } else {
            resul = base;
            for (int i = 1; i < exp; i++) {

                resul = resul * base;

                System.out.println(resul);
            }
        }

    }
}
