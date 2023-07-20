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
public class Pastor {
    private String namePastor = "";

    public String collectPastor() {
        namePastor = JOptionPane.showInputDialog("Enter the Pastor's name");
        return namePastor;
    }

    public String getNamePastor() {
        return namePastor;
    }

    public void setNamePastor(String namePastor) {
        this.namePastor = namePastor;
    }
    
    
    
    
}
