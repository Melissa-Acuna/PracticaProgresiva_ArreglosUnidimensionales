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
public class Nivel2 { //RECORRIDOS Y ACUMULACIÓN

    public void BasicoIntermedio1() {
        /*Básico-Intermedio double Leer 8 números decimales y calcular el promedio general. Mostrar
                                            el resultado con dos decimales.
                                            Promedio, double*/
        double[] media = {5.5, 7.8, 9.1, 6.5, 3.2, 0.3, 8.7, 1.4};
        double suma = 0.0;
        for (double i : media) {
            suma += i;
        }
        double promedio = suma / media.length;
        JOptionPane.showMessageDialog(null, "El promedio es de: " + String.format("%.2f%n", promedio));
    }

    public void BasicoIntermedio2() {
        /*Básico-Intermedio boolean Usar un arreglo de 20 valores booleanos para representar
                                            asistencia. Calcular cuántos asistieron, cuántos faltaron y el
                                            porcentaje de asistencia.
                                            boolean[], conteo, porcentaje*/
        boolean[] asistencia = {false, true, true, false, true, false, false, false, true, true, false, true, true, true, false, true, true, false, true, false};
        int asistieron = 0;
        int faltaron = 0;
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i]) {
                asistieron++;
            } else {
                faltaron++;
            }
        }
        double porcentajeAsistencia = ((double)asistieron / asistencia.length) * 100;
        JOptionPane.showMessageDialog(null, "El porcentaje de asistencia es de: " + String.format("%.1f%n", porcentajeAsistencia)
        +"\nCantidad de asistencia: "+asistieron
        +"\nCantidad de faltantes: "+faltaron);

    }

    public void BasicoIntermedio3() {
        /*Básico-Intermedio char Dado un arreglo de caracteres, contar cuántas vocales contiene.
                                            char[], búsqueda por condición*/
        char[] array = {'a', 'a', 'a', 'o', 'i', 'o', 'f', 'r'};
        int contador = 0;
        String resultado = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                contador++;
            }
            if (array[i] == 'e') {
                contador++;
            }
            if (array[i] == 'i') {
                contador++;
            }
            if (array[i] == 'o') {
                contador++;
            }
            if (array[i] == 'u') {
                contador++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            resultado += " [ " + array[i] + " ] ";
        }

        JOptionPane.showMessageDialog(null, resultado + "\nTotal de vocales: " + contador);
    }

    public void BasicoIntermedio4() {
        /*Intermedio int Leer 15 números. Mostrar la suma de los elementos ubicados en
                                            índices pares y, por separado, la suma de los ubicados en índices
                                            impares.
                                            Trabajo con índices*/
        int[] numeros = {4, 8, 15, 16, 23, 42, 50, 3, 76, 12, 34, 56, 9, 1, 6};
        int SumarPares = 0;
        int SumarImpares = 0;
        String indice = "";
        for (int i = 0; i < numeros.length; i++) {

            indice += "Posicion " + i + ":" + numeros[i] + "\n";

            if (i % 2 == 0) {
                SumarPares += numeros[i];
            } else {
                SumarImpares += numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, indice);
        JOptionPane.showMessageDialog(null, "Suma de índices pares: " + SumarPares + "\n"
                + "Suma de índices impares: " + SumarImpares);
    }

}
