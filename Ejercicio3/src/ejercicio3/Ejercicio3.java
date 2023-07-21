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
        int size = 0;
        Feligreses feligreses[] = new Feligreses[size];
        int option = 1;
        while (option != 0) {
            System.out.println("Main Menu - Select an option");
            System.out.println("1) To add a Pastor.");
            System.out.println("2) To add an Iglesia.");
            System.out.println("3) To add Feligreses");
            System.out.println("4) Diezmo Analytics.");
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
                //System.out.println(size);
                //System.out.println(feligreses.length);
                Count count = new Count();
                size = count.countfeligreses();
                //System.out.println(size);
                //System.out.println(feligreses.length);
                //Feligreses feligreses[];
                feligreses = new Feligreses[size];
                for(int x=0; x<feligreses.length; x++){
                    String nameFeligreses = JOptionPane.showInputDialog("Enter the Feligreses' name");
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' cedula"));
                    int diezmo = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' diezmo"));
                    feligreses[x]=new Feligreses( nameFeligreses, cedula,diezmo);
                    }

            }
            if (option == 4) {
                //System.out.println(feligreses[0].getNameFeligreses());
                //System.out.println(feligreses[1].getNameFeligreses());
                
                int option4 = 1;
                while (option4 != 0) {
                    System.out.println("1) Total de ganancias de la iglesia");
                    System.out.println("2) Municipalidad infraestructura");
                    System.out.println("3) Comedor municipal");
                    System.out.println("4) Ganancia para el pastor");
                    System.out.println("5) Nombres y cédulas de las personas que el diezmo con valor 0");
                    System.out.println("6) Nombres y cédulas de las personas con diezmo mayor a 100000");
                    System.out.println("0) Exit");
                    System.out.println("");
                    option = Integer.parseInt(JOptionPane.showInputDialog("Type your selection"));
                    
                    int total = 0;
                    for (Feligreses feligrese : feligreses) {
                        total += feligrese.getDiezmo();
                    }

                    if(option == 1) {
                        System.out.println("El Total de ganancias de la iglesia es: "+total);
                        System.out.println("\n\n");
                        
                    }
                    if(option == 2) {
                        //double newtotal = total*0.09;
                        System.out.println("El Total para Municipalidad infraestructura es: "+total*0.09);
                        System.out.println("\n\n");
                    }
                    if(option == 3) {
                        System.out.println("El Total para Comedor municipal es: "+total*0.21);
                        System.out.println("\n\n");
                    }
                    if(option == 4) {
                        System.out.println("El Total de Ganancia para el pastor es: "+total*0.7);
                        System.out.println("\n\n");
                    }
                    if(option == 5) {
                        System.out.println("El Nombres y cédulas de las personas que el diezmo con valor 0");
                        for (Feligreses feligrese : feligreses) {
                            if (feligrese.getDiezmo() == 0) {
                                System.out.println("Nombre: " + feligrese.getNameFeligreses());
                                System.out.println("Cedula: " + feligrese.getCedula());
                                System.out.println("");
                            }
                        }
                        
                    }
                    if(option == 6) {
                        System.out.println("El Nombres y cédulas de las personas con diezmo mayor a 100000");
                        for (Feligreses feligrese : feligreses) {
                            int amount = feligrese.getDiezmo();
                            if (amount > 10000) {
                                System.out.println("Nombre: " + feligrese.getNameFeligreses());
                                System.out.println("Cedula: " + feligrese.getCedula());
                            }
                        }
                
                    }
            
		}
				
            }
        
        }
    }
}