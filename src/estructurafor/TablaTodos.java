/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

/**
 *
 * @author Usuario DAM 1
 */
public class TablaTodos {

    public static void main(String[] args) {
        int resultado;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabla del %d%n",i);
            for (int x = 1; x <= 10; x++) {
            resultado=i*x;
                System.out.printf("%d x %d=%d%n",i,x,resultado);
            
            }
            System.out.println("==============================================");
        }

    }
}
