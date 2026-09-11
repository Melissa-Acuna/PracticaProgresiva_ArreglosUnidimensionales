/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Melissa Acuña Edith
 */
public class menuEjercicios {

    private Nivel1 nivel1;

    public menuEjercicios() {
        nivel1 = new Nivel1();
        menuGlobal();
    }

    public void menuGlobal() {
        int optMenu = Integer.parseInt(JOptionPane.showInputDialog("***BIENVENIDO AL MENU DE EJECUCION DE LA PRACTICA PROGRESIVA DE ARREGLOS***"
                + "\nSELECCIONE EL NIVEL QUE DESEA EJECUTAR:"
                + "\n1. Nivel 1"
                + "\n....PROXIMAMENTE"
                + "\n0.Salir"));
        do {
            switch (optMenu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
                    break;
                default: JOptionPane.showMessageDialog(null, "No disponible.");
            }
        } while (optMenu != 0);
    }

}
