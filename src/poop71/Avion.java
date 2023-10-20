/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 * Clase Avion 
 * @author brismar
 */
public class Avion extends Aereo {
    /**
     * ATRIBUTOS 
     * altura es de tipo int pero sera privado
     * capacidasCombustible es de tipo double es privado
     * alcancees de tipo int es privado
     */
    private int altura;
    private double capacidadCombustible;
    private int alcance;
    /**
     * CONSTRUCTOR VACIO
     */
    public Avion() {
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE Avion con extension Aereo
     * @param altura: altura  de avion 
     * @param capacidadCombustible: capacidadCombustible de avion
     * @param alcance: alcance de avion
     */

    public Avion(String modelo, int velocidadMax, int capacidadPasajeros, int altura, double capacidadCombustible, int alcance) {
       super(modelo, velocidadMax, capacidadPasajeros);
       this.altura = altura;
       this.capacidadCombustible = capacidadCombustible;
       this.alcance = alcance;
    }
    /**
     *METODOS DE SERVICIO
     * @return la altura del avion o helicoptero
     */
    public int getAltura() {
        return altura;
    }
    /**
     * set - le dara el dato a la altura ya sea avion 
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * @return la capacidadCombustible del avion 
     */
    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }
    /**
     * set - le dara el dato a la CapacidadCombustible ya sea avion
     */

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }
    /**
     * @return el Alcance del avion o helicoptero
     */

    public int getAlcance() {
        return alcance;
    }
    /**
     * set - le dara el dato al Alcance ya sea avion
     */
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    /**
     *METODOS OBJETIVOS
     * metodos que impirmira la accion que esta haciendo en este caso 
     * realizarVuelo
     */
    
    public void realizarVuelo() {
        System.out.println("Realizando vuelo...");
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos,Metodo toString-que
     * muestra los valores de los atributos
     */ 
    @Override
    public String toString() {
        return "Avion{" + "altura=" + altura + ", capacidadCombustible=" + capacidadCombustible + ", alcance=" + alcance + '}';
    }
    
    
}
