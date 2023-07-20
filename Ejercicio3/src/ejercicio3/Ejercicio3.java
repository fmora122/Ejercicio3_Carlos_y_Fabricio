/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Feligreses feligreses[] = new Feligreses[1];
        int option = 1;
        while (option != 0) {
            System.out.println("Main Menu - Select an option");
            System.out.println("1) To add a Pastor.");
            System.out.println("2) To add an Iglesia.");
            System.out.println("3) To add Feligreses");
            System.out.println("4) To exit.");
            System.out.println("0) To exit.");

            System.out.println("");
            option = Integer.parseInt(JOptionPane.showInputDialog("Type your selection"));

            if (option == 1) {
                Pastor pastor = new Pastor();
                pastor.setNamePastor(pastor.collectPastor());
            }
            if (option == 2) {
                Iglesia iglesia = new Iglesia();
                iglesia.setNameIglesia(iglesia.collectIglesia());
            }
            if (option == 3) {
                Count count = new Count();
                int size = count.countfeligreses();
                Feligreses feligreses[] = new Feligreses[size];
                for(int x=0; x<feligreses.length; x++){
                    String nameFeligreses = JOptionPane.showInputDialog("Enter the Feligreses' name");
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' cedula"));
                    int diezmo = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' diezmo"));
                    feligreses[x]=new Feligreses( nameFeligreses, cedula,diezmo);
                    }

            }
            if (option == 4) {
                System.out.println(feligreses[0]);
            }
            
        }
        
        
        
        
    }



    
}
