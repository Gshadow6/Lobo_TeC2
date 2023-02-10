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
public class PruebaAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Honda", "Civic", 2022, 10000, "Automatics");
    
        System.out.println(auto1);
        
        auto1.avanzar(12);
        
        auto1.frenar();
    }
    
}
