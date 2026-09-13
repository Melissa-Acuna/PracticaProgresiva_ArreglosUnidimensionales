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
public class Nivel3 { //BUSQUEDA, EXTREMOS Y CONDICIONES

    public void Intermedio1() {
        /*Intermedio int Leer 10 enteros y determinar el valor mayor y el valor menor. Inicialice ambos
                                    usando el primer elemento del arreglo.
                                    Máximo y mínimo*/
        int[] revValores = {3, 1, 8, 2, 4, 7, 0, 9, 5, 6};
        int menor = revValores[0];
        int mayor = revValores[0];
        for (int i = 0; i < revValores.length; i++) {
            if (revValores[i] < menor) {
                menor = revValores[i];
            } else if (revValores[i] > mayor) {
                mayor = revValores[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El valor menor es: " + menor
                + "\nEl valor mayor es: " + mayor);
    }

    public void Intermedio2() {
        /*Intermedio int Leer un arreglo y solicitar un número a buscar. Mostrar la primera posición donde
                                    aparece o -1 si no existe.
                                    Búsqueda lineal*/
        int[] busquedaLineal = {2, 13, 5, 18, 67, 0, 35, 9, 27, 115, 3, 44};
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar en el arreglo:"));
        int busqueda = -1;
        for (int i = 0; i < busquedaLineal.length && busqueda == -1; i++) {
            if (busquedaLineal[i] == num){
                busqueda = i;
            }
        }
        if (busqueda != -1) {
            JOptionPane.showMessageDialog(null, "El número: " + num
                + "\nEsta en la posición: " + busqueda);
        } else {
            JOptionPane.showMessageDialog(null, "El número: "+num
                    +"\nNo aparece en el arreglo: "+ busqueda);
        }

    }

    public void Intermedio3() {
        /*Intermedio int Leer 12 números y solicitar un valor. Contar cuántas veces aparece dentro del arreglo.
                                    Frecuencia simple*/
        int[] numeros = {4, 8, 34, 16, 34, 42, 50, 3, 76, 12, 34, 56};
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número que desea buscar en el arreglo:"));
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                contador++;
            }
        }
        if (contador > 0) {
            JOptionPane.showMessageDialog(null, "El número " + valor + " aparece " + contador + " veces en el arreglo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + valor + " no se encuentra dentro del arreglo.");
        }
    }

    public void Intermedio4() {
        /*Intermedio char Dado un arreglo de caracteres, contar por separado vocales, consonantes y otros símbolos.
                                    Clasificación de caracteres*/

        char[] arreglo = {'e', 'o', 't', 'a', 'u', 'i', 'l', 'o', 'n', '?', '!', '*', 'i'};
        int vocales = 0;
        int consonantes = 0;
        int simbolos = 0;

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == 'a') {
                vocales++;
            } else if (arreglo[i] == 'e') {
                vocales++;
            } else if (arreglo[i] == 'i') {
                vocales++;
            } else if (arreglo[i] == 'o') {
                vocales++;
            } else if (arreglo[i] == 'u') {
                vocales++;
            } else if (arreglo[i] < 'a') {
                simbolos++;
            } else if (arreglo[i] > 'z') {
                simbolos++;
            } else {
                consonantes++;
            }
        }

        JOptionPane.showMessageDialog(null, "Vocales: " + vocales + "\n"
                + "Consonantes: " + consonantes + "\n"
                + "Otros símbolos: " + simbolos);
    }
}
