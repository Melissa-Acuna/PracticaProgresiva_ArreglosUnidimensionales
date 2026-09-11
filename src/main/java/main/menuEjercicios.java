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
    private Nivel2 nivel2;
    private Nivel3 nivel3;
    private Nivel4 nivel4;
    private Nivel5 nivel5;

    public menuEjercicios() {
        nivel1 = new Nivel1();
        nivel2 = new Nivel2 ();
        nivel3 = new Nivel3 ();
        nivel4 = new Nivel4 ();
        nivel5 = new Nivel5 ();
        menuGlobal();
    }

    public void menuGlobal() {
        int optMenu = 0;
        do {
            optMenu = Integer.parseInt(JOptionPane.showInputDialog("***BIENVENIDO AL MENU DE EJECUCION DE LA PRACTICA PROGRESIVA DE ARREGLOS***"
                    + "\nSELECCIONE EL NIVEL QUE DESEA EJECUTAR:"
                    + "\n1. Nivel 1 -- Fundamentos"
                    + "\n2. Nivel 2 -- Recorridos y Acumulación"
                    + "\n3. Nivel 3 -- Busqueda, extremos y condiciones"
                    + "\n4. Nivel 4 -- Transformación de arreglos"
                    + "\n5. Nivel 5 -- Integración y retos"
                    + "\n0.Salir"));
            switch (optMenu) {
                case 1:
                    int optLVL1 = 0;
                    do {
                        optLVL1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el ejercicio que desea ejecutar: "
                                + "\n1. Basico double"
                                + "\n2. Basico boolean"
                                + "\n3. Basico int"
                                + "\n4. Basico char"
                                + "\n5. Regresar al menu principal"));
                        switch (optLVL1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "REGRESANDO AL MENÚ PRINCIPAL");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No disponible.");
                        }
                    } while (optLVL1 != 5);
                    break;
                case 2:
                    int optLVL2 = 0;
                    do {
                        optLVL2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el ejercicio que desea ejecutar: "
                                + "\n1. Basico-Intermedio double"
                                + "\n2. Basico-Intermedio boolean"
                                + "\n3. Basico-Intermedio char"
                                + "\n4. Basico-Intermedio int"
                                + "\n5. Regresar al menu principal"));
                        switch (optLVL2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "REGRESANDO AL MENÚ PRINCIPAL");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No disponible.");
                        }
                    } while (optLVL2 != 5);
                    break;
                case 3:
                    int optLVL3 = 0;
                    do {
                        optLVL3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el ejercicio que desea ejecutar: "
                                + "\n1. Intermedio int"
                                + "\n2. Intermedio int"
                                + "\n3. Intermedio int"
                                + "\n4. Intermedio char"
                                + "\n5. Regresar al menu principal"));
                        switch (optLVL3) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "REGRESANDO AL MENÚ PRINCIPAL");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No disponible.");
                        }
                    } while (optLVL3 != 5);
                    break;
                case 4:
                    int optLVL4 = 0;
                    do {
                        optLVL4 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el ejercicio que desea ejecutar: "
                                + "\n1. Intermedio-Alto int"
                                + "\n2. Intermedio-Alto int"
                                + "\n3. Intermedio-Alto int"
                                + "\n4. Intermedio-Alto int"
                                + "\n5. Regresar al menu principal"));
                        switch (optLVL4) {
                            case 1:
                                nivel1.Basico1();
                                break;
                            case 2:
                                nivel1.Basico2();
                                break;
                            case 3:
                                nivel1.Basico3();
                                break;
                            case 4:
                                nivel1.Basico4();
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "REGRESANDO AL MENÚ PRINCIPAL");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No disponible.");
                        }
                    } while (optLVL4 != 5);
                    break;
                case 5:
                    int optLVL5 = 0;
                    do {
                        optLVL5 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el ejercicio que desea ejecutar: "
                                + "\n1. Avanzado int"
                                + "\n2. Avanzado double"
                                + "\n3. Avanzado int"
                                + "\n4. Avanzado int"
                                + "\n5. Regresar al menu principal"));
                        switch (optLVL5) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "REGRESANDO AL MENÚ PRINCIPAL");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No disponible.");
                        }
                    } while (optLVL5 != 5);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No disponible.");
            }
        } while (optMenu != 0);
    }

}
