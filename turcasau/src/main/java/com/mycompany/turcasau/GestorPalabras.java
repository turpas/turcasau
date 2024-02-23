/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turcasau;

/**
 *
 * @author Sergio Turpin
 */
public class GestorPalabras {
    public boolean esPalindromo(String palabra){
        String palabraFormateada, minus;
        minus = palabra.replaceAll("\\s+", "").toLowerCase();
        palabraFormateada = minus.replaceAll(",", "");
        palabraFormateada = minus.replaceAll("á", "a");
        palabraFormateada = minus.replaceAll("é", "e");
        palabraFormateada = minus.replaceAll("í", "i");
        palabraFormateada = minus.replaceAll("ó", "o");
        palabraFormateada = minus.replaceAll("ú", "u");
        
        for (int i = 0; i < palabraFormateada.length() / 2; i++) {
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a'  caracter == 'e'  caracter == 'i'  caracter == 'o'  caracter == 'u'  caracter == 'á'  caracter == 'é'  caracter == 'í'  caracter == 'ó' || caracter == 'ú') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}

