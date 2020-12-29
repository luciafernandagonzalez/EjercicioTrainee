/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrainee;

import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<auto> arrayAutos = new ArrayList<auto>();
        
        auto auto1 = new auto("Peugeot", "206", 4, "", 200000.00);
        auto auto2 = new auto("Honda", "Titan", 0, "125cc", 60000.00);
        auto auto3 = new auto("Peugeot", "208", 5, "", 250000.00);
        auto auto4 = new auto("Yamaha", "YBR", 0, "160cc", 80500.50);
        
        arrayAutos.add(auto1);
        arrayAutos.add(auto2);
        arrayAutos.add(auto3);
        arrayAutos.add(auto4);
        
        concesionaria conc = new concesionaria();
        
        conc.setAutos(arrayAutos);
        
        conc.listado();
        conc.vehiculoMasCaro();
        conc.vehiculoMasBarato();
        conc.vehiculoconLetraY();
        conc.ordenados();
    }
    
}
