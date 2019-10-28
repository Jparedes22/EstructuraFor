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
public class Sueldo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo;
        double suma = 0;

        double media = 0;
        int contadorMil = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un sueldo");
            sueldo = sc.nextDouble();
            suma = suma + sueldo;

            if (sueldo > 1000) {
                contadorMil++;
            }
        }
        System.out.printf("La suma de los sueldos es: %.2f%n", suma);
        System.out.printf("La media de los sueldos es: %.2f%n", suma / 10);
        System.out.printf("Hay %d sueldos mayores que 1000€%n", contadorMil);

    }
}
