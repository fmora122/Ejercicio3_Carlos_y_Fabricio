/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class Count {
    private int count = 0;

    public int countfeligreses() {
        count = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' count"));
        return count;
    }
    
}
