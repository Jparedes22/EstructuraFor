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
public class NumerosTipos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulPos = 0;
        double acumulNeg = 0;
        double contadorPos = 0;
        double contadorNeg = 0;
        int contadoresCero = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un número");
            double num = sc.nextInt();
            if (num > 0) {
                acumulPos += num;
                contadorPos++;
            } else if (num < 0) {
                acumulNeg += num;
                contadorNeg++;
            } else {
                contadoresCero++;
            }
        }
        if (contadorNeg == 0 || contadorPos == 0 || contadoresCero == 0) {

        } else {
            System.out.printf("La media de positivos es %.2f%n",
                    acumulPos / contadorPos);
            System.out.printf("La media de negativos es %.2f%n",
                     acumulNeg / contadorNeg);
            System.out.printf("Los 0 son %d%n", contadoresCero);
        }

    }
}
