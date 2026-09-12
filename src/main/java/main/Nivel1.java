/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Melissa Acuña 
 * Edith Torres
 */
public class Nivel1 { //FUNDAMENTOS

    public void Basico1() {
        /*Básico double Crear un arreglo de 4 números decimales inicializado con valores literales.
                                Mostrar la longitud del arreglo y el último elemento.
                                Inicialización literal, length*/

    }

    public void Basico2() {
        /*Básico boolean Crear un arreglo de 6 valores booleanos. Mostrar el valor almacenado en cada
                                posición usando un ciclo for.
                                boolean[], recorrido con for*/

    }

    public void Basico3() {
        /*Básico int Leer 8 números enteros desde teclado y almacenarlos en un arreglo. Al
                                finalizar, mostrar todos los valores uno por línea.
                                Lectura, almacenamiento, recorrido*/
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};
        for (int i = 0; i < numeros.length; i++) {

            JOptionPane.showMessageDialog(null, "Posicion " + i + ":" + numeros[i]);

        }
    }

    public void Basico4() {
        /*Básico char Convertir una palabra conocida a un arreglo de caracteres y mostrar cada
                                carácter por separado.
                                char[], recorrido*/
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};
        String palabra = "hola";

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            resultado += "Posición [" + i + "]: " + letras[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
