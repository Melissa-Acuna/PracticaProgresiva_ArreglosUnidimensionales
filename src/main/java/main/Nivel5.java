/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Melissa Acuña Edith Torres
 */
public class Nivel5 { //INTEGRACIÓN Y RETOS

    public void Avanzado1() {
        /*Avanzado int Crear dos arreglos de igual tamaño. Generar un tercer arreglo donde cada
                                    posición sea la suma de los elementos correspondientes de los dos arreglos originales.
                                    Procesamiento paralelo de arreglos*/

    }

    public void Avanzado2() {
        /*Avanzado double Crear dos arreglos de precios de igual tamaño. Construir un tercero con la
                                    diferencia absoluta entre los valores correspondientes y calcular el promedio de esas diferencias.
                                    Arreglos paralelos, cálculo*/

    }

    public void Avanzado3() {
        /*Avanzado int Leer un arreglo y determinar si está ordenado de forma ascendente sin modificarlo.
                                    Comparación entre vecinos*/

        int[] array = {2, 5, 8, 12, 19, 25, 30};
        int contador = 0;
        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            resultado += "[" + array[i] + "]";
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                contador++;
            }
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, resultado + "\nEs ascendente.");
        } else {
            JOptionPane.showMessageDialog(null, resultado + "\nNo es ascendente.");
        }

    }

    public void Avanzado4() {
        /*Avanzado int Determinar si un arreglo es capicúa: se lee igual de izquierda a derecha que de
                                    derecha a izquierda.
                                    Comparación simétrica*/

        int[] array = {3, 9, 8, 1, 8, 9, 3};
        int contador = 0;
        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            resultado += "[" + array[i] + "]";
        }

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                contador++;
            }
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, resultado + "\nEs capicúa.");
        } else {
            JOptionPane.showMessageDialog(null, resultado + "\nNo es capicúa.");
        }
    }

}
