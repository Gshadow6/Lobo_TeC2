/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

/**
 *
 * @author AXEL
 */
public class Automovil {
    String marca;
    String submarca;
    int anio;
    int kilometraje;
    String transmision;

    public Automovil(String marca, String submarca, int anio, int kilometraje, String transmision) {
        this.marca = marca;
        this.submarca = submarca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.transmision = transmision;
    }
    
    public Automovil(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "El Automovil de marca " + marca + ", con submarca " + submarca + ", año " + anio + ", con " + kilometraje + " km, y de transmision " + transmision;
    }
    
    public void avanzar(int km){
        System.out.println("El automovil " + marca + " " + submarca + " " +anio+ " ha avanzado " + km + " kilometros");
    }
    
    public void frenar(){
        System.out.println("El automovil " + marca + " " + submarca + " " +anio+ " esta frenando... pero no frena...");
    }
}
