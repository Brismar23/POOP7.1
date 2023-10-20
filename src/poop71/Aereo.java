/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 * Clase Aereo que hereda con las demas clases
 * @author brismar
 */
public class Aereo extends Object{
    /**
     * ATRIBUTOS 
     * modelo es de tipo String pero sera privado
     * velocidadMax es de tipo int es privado
     * capacidadPasajeros es de tipo int es privado
     */
    
    private String modelo;
    private int velocidadMax;
    private int capacidadPasajeros;
    /**
     * CONSTRUCTOR VACIO
     */
    public Aereo() {
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE Aereo
     * @param modelo: modelo de aereo 
     * @param velocidadMax: velocidadMax de aereo
     * @param capacidadPasajeros: capacidadPasajeros de aereo
     */
    
    public Aereo(String modelo, int velocidadMax, int capacidadPasajeros) {
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.capacidadPasajeros = capacidadPasajeros;
    }
    /**
     *METODOS DE SERVICIO
     * @return el modelo del avion o herlicoptero
     */

    public String getModelo() {
        return modelo;
    }
    /**
     * set - le dara el dato del modelo ya sea avion o helicoptero
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * @return la velocidadMax de aereo-avion o helicoptero
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }
    /**
     * set - le dara el dato de la velocidadMax ya sea avion o helicoptero
     */

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    /**
     * @return la CapacidadPasajeros del avion o helicoptero
     */

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    /**
     * set - le dara el dato de la CapacidadPasajeros ya sea avion o helicoptero
     */
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    /**
     *METODOS OBJETIVOS
     * metodos que impirmira la accion que esta haciendo en este caso despegar, 
     * aterrizar y ponerCinturon
     */
    public void despegar() {
        System.out.println("Despegando...");
    }

    public void aterrizar() {
        System.out.println("Aterrizando...");
    }

    public String ponerCinturon() {
        return "Cinturón de seguridad abrochado.";
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos,Metodo toString-que
     * muestra los valores de los atributos
     */ 

    @Override
    public String toString() {
        return "Aereo{" + "modelo=" + modelo + ", velocidadMax=" + velocidadMax + ", capacidadPasajeros=" + capacidadPasajeros + '}';
    }
    
    
}
