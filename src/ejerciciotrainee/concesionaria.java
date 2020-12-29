/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrainee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author lucia
 */
public class concesionaria {
    
    private ArrayList autos;

    public concesionaria() {
        autos = new ArrayList<auto>();
    }

    public ArrayList<auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<auto> autos) {
        this.autos = autos;
    }
    
    void listado() {
        int t = this.getAutos().size(); double n = 0; auto mayor = new auto();
        
        for(int i=0; i<t; i++){            
         
            if(this.getAutos().get(i).getPuerta() == 0){
                System.out.println("Marca: "+this.getAutos().get(i).getMarca()+
                    " // Modelo: "+this.getAutos().get(i).getModelo()+
                    " // Cilindrada: "+this.getAutos().get(i).getCilindrada()+
                    " // Precio: $"+this.getAutos().get(i).getPrecio());
            }else{
            System.out.println("Marca: "+this.getAutos().get(i).getMarca()+
                    " // Modelo: "+this.getAutos().get(i).getModelo()+
                    " // Puertas: "+this.getAutos().get(i).getPuerta()+
                    " // Precio: $"+this.getAutos().get(i).getPrecio());
            }
        }
        System.out.println("=============================");
    }
    

    void vehiculoMasCaro() {        
        int t = this.getAutos().size(); double n = 0; auto mayor = new auto();
        
        for(int i=0; i<t; i++){            
            if(this.getAutos().get(i).getPrecio() > n){
                n = this.getAutos().get(i).getPrecio();
                mayor = this.getAutos().get(i);                
            }
        }
        System.out.println("Vehiculo mas caro: "+mayor.getMarca()+" "+mayor.getModelo());
    }

    void vehiculoMasBarato() {
        int t = this.getAutos().size(); double n = 999999; auto menor = new auto();
        
        for(int i=0; i<t; i++){            
            if(this.getAutos().get(i).getPrecio() < n){
                n = this.getAutos().get(i).getPrecio();
                menor = this.getAutos().get(i);                
            }
        }
        System.out.println("Vehiculo mas barato: "+menor.getMarca()+" "+menor.getModelo());
    }

    void vehiculoconLetraY() {
        int t = this.getAutos().size(); auto letraY = new auto();
        
        for(int i=0; i<t; i++){            
            if(this.getAutos().get(i).getModelo().contains("Y")){
                letraY = this.getAutos().get(i);
            }
        }
        System.out.println("Vehiculo que contiene en el modelo la letra 'Y': "+ letraY.getMarca()+" "+letraY.getModelo()+" $"+letraY.getPrecio());
        System.out.println("=============================");
    }

    void ordenados() {
       
        int t = this.getAutos().size(); int i,j;
        ArrayList<Double> numeros = new ArrayList<Double>();
        
        for(i=0; i<t; i++){            
            numeros.add(this.getAutos().get(i).getPrecio());
        }
        
        Collections.sort(numeros);
        Collections.reverse(numeros);
        
        for(i=0; i<t; i++){            
            for(j=0; j<t; j++){                
                if(numeros.get(i) == this.getAutos().get(j).getPrecio()){
                    System.out.println(this.getAutos().get(j).getMarca()+" "+this.getAutos().get(j).getModelo());
                }                
            }
        }        
    }    
    
}
