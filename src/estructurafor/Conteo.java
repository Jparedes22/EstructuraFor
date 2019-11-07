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
public class Conteo {

    public static void main(String[] args) {
        String frase = "1qweqwE 123 aSdasd";
        System.out.println(frase);
        int contadorDig = 0;
        int contadorLet = 0;
        int contadorEsp = 0;
        int contadorMayus = 0;
        int contadorMinus = 0;

        for (int i = 0; i <= frase.length() - 1; i++) {
            char letra = frase.charAt(i);
            if (Character.isDigit(letra)) {
                contadorDig++;
            }
            if (Character.isLetter(letra)) {
                contadorLet++;
                if (Character.isUpperCase(letra)) {
                    contadorMayus++;
                } else if (Character.isLowerCase(letra)) {
                    contadorMinus++;
                }
            } else if (Character.isWhitespace(letra)) {
                contadorEsp++;
            } 
        }
        System.out.printf("Hay %d digitos, %d letras, %d espacios, %d mayúsculas y %d minúsculas %n", contadorDig, contadorLet, contadorEsp, contadorMayus, contadorMinus);
    }
}
