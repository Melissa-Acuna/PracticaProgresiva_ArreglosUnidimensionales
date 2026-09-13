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
public class Nivel4 { //TRANSFORMACIÓN DE ARREGLOS

    public void IntermedioAlto1() {
        /*Intermedio-Alto int Invertir un arreglo de enteros en el mismo arreglo, intercambiando los
                                        elementos de los extremos y recorriendo solo hasta la mitad.
                                        Intercambio, inversión*/
        int[] invertir = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < invertir.length / 2; i++) {
            int mecanismo = invertir[i];
            invertir[i] = invertir[invertir.length - 1 - i];
            invertir[invertir.length - 1 - i] = mecanismo;
        }
        String resultado = "";
        for (int i = 0; i < invertir.length; i++) {
            resultado += invertir[i] + "";
        }
        JOptionPane.showMessageDialog(null, "El arreglo invertido es: " + resultado);

    }

    public void IntermedioAlto2() {
        /*Intermedio-Alto int Crear una copia independiente de un arreglo de 10 enteros, elemento por
                                        elemento. Modificar la copia y comprobar que el original no cambia.
                                        Copia de arreglos*/

        int[] arregloOg = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] arregloCopy = new int[arregloOg.length];
         String original = "";
         String copia = "";
        for (int i = 0; i < arregloOg.length; i++) {
            arregloCopy[i] = arregloOg[i];
            original += arregloOg [i]+" ";
            arregloCopy [0]=1;
            copia += arregloCopy [i]+" ";
        }
        JOptionPane.showMessageDialog(null, "El arreglo original es: "+original
        +"\nEl arreglo copiado y verificando que el original no cambie: "+copia);
    }

    public void IntermedioAlto3() {
        /*Intermedio-Alto int Rotar un arreglo una posición hacia la derecha: el último elemento pasa a la
                                        primera posición y los demás se desplazan una posición.
                                        Rotación derecha*/
        int[] array = {4, 8, 15, 1, 6};
        int ultimo = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;
        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            resultado += "[" + array[i] + "]";
        }
        JOptionPane.showMessageDialog(null, resultado);

    }

    public void IntermedioAlto4() {
        /*Intermedio-Alto int Solicitar dos índices válidos e intercambiar los valores almacenados en esas
                                        posiciones. Validar que ambos índices pertenezcan al arreglo.
                                        Validación de índices, intercambio*/
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};

        int indice1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer índice"));

        if (indice1 >= array.length) {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango");
        } else {
            int numero1 = array[indice1];

            int indice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo índice"));

            if (indice2 >= array.length) {
                JOptionPane.showMessageDialog(null, "Índice fuera de rango");
            } else {
                int numero2 = array[indice2];

                array[indice1] = numero2;
                array[indice2] = numero1;

                String resultado = "";
                for (int i = 0; i < array.length; i++) {
                    resultado += "[" + array[i] + "] ";
                }

                JOptionPane.showMessageDialog(null, "Indices intercambiados" + resultado);
            }
        }

    }

}
