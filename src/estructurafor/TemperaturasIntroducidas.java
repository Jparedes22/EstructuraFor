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
public class TemperaturasIntroducidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        System.out.println("¿Cuántas temperaturas quieres introducir?");
        int veces = sc.nextInt();

        if (veces <= 0) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("Dime  la %dª temperatura %n", i);
                int numero = sc.nextInt();
                acumulador += numero;
            }

        } else {
            for (int i = 1; i < veces; i++) {
                System.out.printf("Dime  la %dª temperatura %n", i);
                int numero = sc.nextInt();
                acumulador += numero;
            }
        }
        double media = acumulador / veces;
        System.out.printf("La media de las temperaturas es: %.2f ºC%n",media);
    }
}
