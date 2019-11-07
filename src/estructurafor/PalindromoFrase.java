/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author neosu
 */
public class PalindromoFrase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "Allí ves Sevilla";
        String fraseInvertida = "";
        frase = frase.replace('á', 'a');
        frase = frase.replace('é', 'e');
        frase = frase.replace('í', 'i');
        frase = frase.replace('ó', 'o');
        frase = frase.replace('ú', 'u');
        frase = frase.replace(" ", "");
        frase = frase.toLowerCase();
        int longitud = frase.length();
        for (int i = longitud - 1; i >= 0; i--) {
            fraseInvertida += String.valueOf(frase.charAt(i));
        }
        System.out.println(fraseInvertida);

        if (fraseInvertida.equals(frase)) {
            System.out.printf("La frase %s es un palíndromo%n", frase);
        } else {
            System.out.printf("La frase %s no es un palíndromo%n", frase);
        }
    }
}
