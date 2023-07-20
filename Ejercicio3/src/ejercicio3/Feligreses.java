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
public class Feligreses {
    private String nameFeligreses = "";
    private int cedula = 0;
    private int diezmo = 0;
/*
    public String collectFeligresesName() {
        nameFeligreses = JOptionPane.showInputDialog("Enter the Feligreses' name");
        return nameFeligreses;
    }
        public int collectFeligresesCed() {
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' cedula"));
        return cedula;
    }
        public int collectFeligresesDie() {
        diezmo = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' diezmo"));
        return diezmo;
    }
*/
    
    public Feligreses(String nameFeligreses, int cedula, int diezmo) {
        this.nameFeligreses = nameFeligreses;
        this.cedula = cedula;
        this.diezmo = diezmo;
    }

    public String getNameFeligreses() {
        return nameFeligreses;
    }

    public void setNameFeligreses(String nameFeligreses) {
        this.nameFeligreses = nameFeligreses;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(int diezmo) {
        this.diezmo = diezmo;
    }
    
    
    
}
