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
public class Iglesia {
    private String nameIglesia = "";
    
    public String collectIglesia() {
        nameIglesia = JOptionPane.showInputDialog("Enter the Iglesia's name");
        return nameIglesia;

    }
    public String getNameIglesia() {
        return nameIglesia;
    }

    public void setNameIglesia(String nameIglesia) {
        this.nameIglesia = nameIglesia;
    }
    
    
    
}
