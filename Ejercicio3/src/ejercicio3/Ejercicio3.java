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
                Count count = new Count();
                size = count.countfeligreses();
                feligreses = new Feligreses[size];
                for(int x=0; x<feligreses.length; x++){
                    //System.out.println("***");
                    //System.out.println("***");
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
                    option4 = Integer.parseInt(JOptionPane.showInputDialog("Type your selection"));
                    
                    int total = 0;
                    for (Feligreses feligrese : feligreses) {
                        total += feligrese.getDiezmo();
                    }

                    if(option4 == 1) {
                        System.out.println("El Total de ganancias de la iglesia es: "+total);
                        System.out.println("\n\n");
                        
                    }
                    if(option4 == 2) {
                        //double newtotal = total*0.09;
                        System.out.println("El Total para Municipalidad infraestructura es: "+total*0.09);
                        System.out.println("\n\n");
                    }
                    if(option4 == 3) {
                        System.out.println("El Total para Comedor municipal es: "+total*0.21);
                        System.out.println("\n\n");
                    }
                    if(option4 == 4) {
                        System.out.println("El Total de Ganancia para el pastor es: "+total*0.7);
                        System.out.println("\n\n");
                    }
                    if(option4 == 5) {
                        System.out.println("El Nombres y cédulas de las personas que el diezmo con valor 0");
                        for (Feligreses feligrese : feligreses) {
                            if (feligrese.getDiezmo() == 0) {
                                System.out.println("Nombre: " + feligrese.getNameFeligreses());
                                System.out.println("Cedula: " + feligrese.getCedula());
                                System.out.println("");
                            }
                        }
                        
                    }
                    if(option4 == 6) {
                        System.out.println("El Nombres y cédulas de las personas con diezmo mayor a 100000");
                        for (Feligreses feligrese : feligreses) {
                            int amount = feligrese.getDiezmo();
                            if (amount > 10000) {
                                System.out.println("Nombre: " + feligrese.getNameFeligreses());
                                System.out.println("Cedula: " + feligrese.getCedula());
                                System.out.println("");
                            }
                        }
                
                    }
		}
				
            }
            //hiden option 5 is for loadig data
            
            if(option == 5) {
                size = 4;
                feligreses = new Feligreses[size];
                feligreses[0]=new Feligreses( "juan", 111,0);
                feligreses[1]=new Feligreses( "maria", 222,0);
                feligreses[2]=new Feligreses( "pedro", 333,11000);
                feligreses[3]=new Feligreses( "juana", 444,11000);
                for (int i = 0; i< feligreses.length; i++) {
                    System.out.println(feligreses[i].getNameFeligreses());
                }
            }
            //hiden option 6 is for adding new data
            if(option == 6) {
                int slot= feligreses.length+1; // generamos una variable nueva basada en la longitud del objeto feligreses, le sumamos 1
                Feligreses feligresesPlus[] = new Feligreses[slot]; // definimos un objeto de tipo feligreses nuevo este nuevo objeto feligreses es mas grande que el anterior por +1
                for (int i = 0; i< feligreses.length; i++) { // rellenamos el objeto feligreses nuevo con el contenido del viejo, importante observar que el for loop corre esta la longitud del objeto feligreses original, osea deja el ultimo espacio en blanco
                    feligresesPlus[i] = feligreses[i];
                }
                feligreses = feligresesPlus; // aqui tomamos al objeto original y lo REEMPLAZAMOS con el nuevo, asi logramos agregar un espacio nuevo y conservar los datos originales
                
                //aqui agregamos al mae nuevo
                String nameFeligreses = JOptionPane.showInputDialog("Enter the Feligreses' name");
                int cedula = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' cedula"));
                int diezmo = Integer.parseInt(JOptionPane.showInputDialog("Enter the Feligreses' diezmo"));
                feligreses[slot-1]=new Feligreses( nameFeligreses, cedula,diezmo);
                
                for (int i = 0; i< feligreses.length; i++) {
                    System.out.println(feligreses[i].getNameFeligreses());
                }
                
                
            }
            
        }
    }
}