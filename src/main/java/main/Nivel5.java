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
        double[] listaPrecios1 = {100.0, 230.0, 750.5, 400.7};
        double[] listaPrecios2 = {300.5, 100.0, 520.0, 950.3};
        double[] diferencia = new double[listaPrecios1.length];
        double suma = 0.0;
        double promedio = 0.0;
        for (int i = 0; i < listaPrecios1.length; i++) {
            if (listaPrecios1[i] >= listaPrecios2[i]) {
                diferencia[i] = listaPrecios1[i] - listaPrecios2[i];
            } else {
                diferencia[i] = listaPrecios2[i] - listaPrecios1[i];
            }
            suma += diferencia[i];
        }
        promedio = suma / diferencia.length;
        JOptionPane.showMessageDialog (null, "El promedio de la diferencia entre los dos arreglos es de: "+String.format("%.2f%n", promedio));
        /*El resultado genera un numero con dos decimales nada mas pero por si
        acaso pongo el .format, en caso de cambiar los valores de los arreglos que siga dando una respuesta limpia*/
    }

    public void Avanzado3() {
        /*Avanzado int Leer un arreglo y determinar si está ordenado de forma ascendente sin modificarlo.
                                    Comparación entre vecinos*/

    }

    public void Avanzado4() {
        /*Avanzado int Determinar si un arreglo es capicúa: se lee igual de izquierda a derecha que de
                                    derecha a izquierda.
                                    Comparación simétrica*/

    }

}
