/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 * Clase Helicoptero
 * @author brismar
 */
public class Helicoptero extends Aereo {
    /**
     * ATRIBUTOS 
     * numeroPalas es de tipo int pero sera privado
     * capacidadCarga es de tipo int es privado
     * alturaMaxima de tipo double es privado
     */
    private int numeroPalas;
    private int capacidadCarga;
    private double alturaMaxima;
    /**
     * CONSTRUCTOR VACIO
     */
    public Helicoptero() {
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE Helicoptero 
     * @param numeroPalas: numeroPalas  de helicoptero 
     * @param capacidadCarga: capacidadCarga de helicoptero
     * @param alturaMaxima: alturaMaxima de helicoptero
     */
    public Helicoptero(String modelo, int velocidadMax, int capacidadPasajeros, int numeroPalas, int capacidadCarga, double alturaMaxima) {
        super(modelo, velocidadMax, capacidadPasajeros);
        this.numeroPalas = numeroPalas;
        this.capacidadCarga = capacidadCarga;
        this.alturaMaxima = alturaMaxima;
    }
    /**
     *METODOS DE SERVICIO
     * @return la NumeroPalas del  helicoptero
     */
    public int getNumeroPalas() {
        return numeroPalas;
    }
    /**
     * set - le dara el dato al NumeroPalas ya sea helicoptero
     */

    public void setNumeroPalas(int numeroPalas) {
        this.numeroPalas = numeroPalas;
    }
    /**
     * @return la CapacidadCarga del  helicoptero
     */
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    /**
     * set - le dara el dato al CapacidadCarga ya sea helicoptero
     */

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    /**
     * @return la AlturaMaxima del  helicoptero
     */

    public double getAlturaMaxima() {
        return alturaMaxima;
    }
    /**
     * set - le dara el dato al AlturaMaxima ya sea helicoptero
     */

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    /**
     *METODOS OBJETIVOS
     * metodos que impirmira la accion que esta haciendo en este caso 
     * cerrarPuerta
     */
    
    public String cerrarPuerta() {
        return "Puerta cerrada con seguridad.";
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos,Metodo toString-que
     * muestra los valores de los atributos
     */ 

    @Override
    public String toString() {
        return "Helicoptero{" + "numeroPalas=" + numeroPalas + ", capacidadCarga=" + capacidadCarga + ", alturaMaxima=" + alturaMaxima + '}';
    }

}
