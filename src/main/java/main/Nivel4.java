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

    }

    public void IntermedioAlto4() {
        /*Intermedio-Alto int Solicitar dos índices válidos e intercambiar los valores almacenados en esas
                                        posiciones. Validar que ambos índices pertenezcan al arreglo.
                                        Validación de índices, intercambio*/

    }

}
