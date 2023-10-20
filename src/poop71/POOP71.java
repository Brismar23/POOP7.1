/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop71;

/**
 * Clase Principaal - MAIN
 * @author brismar
 */
public class POOP71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Le damos los parametros a la clase Aereo
         */
        Aereo aereo = new Aereo();
        aereo.setCapacidadPasajeros(100);
        aereo.setModelo("Boeing 737");
        aereo.setVelocidadMax(860);
        
        System.out.println(aereo);
        

        /**
         * Le damos los parametros a la clase Avion
         */
        //AVION------
        Avion avion = new Avion();
        avion.setModelo("Airbus A330Neo");
        avion.setVelocidadMax(1061);
        avion.setCapacidadPasajeros(200);
        avion.setAlcance(5000);
        avion.setAltura(10000);
        avion.setCapacidadCombustible(200.000);
        
        System.out.println(avion);

        
        /**
         * Le damos los parametros a la clase Helicoptero
         */
        //Helicoptero
        Helicoptero helicoptero =new Helicoptero();
        helicoptero.setNumeroPalas(2);
        helicoptero.setAlturaMaxima(6000);
        helicoptero.setCapacidadCarga(10600);
        helicoptero.setCapacidadPasajeros(4);
        helicoptero.setModelo("AS565 MBE");
        helicoptero.setVelocidadMax(278);
        
        System.out.println(helicoptero);
   
    }
    
}
