/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrainee;

/**
 *
 * @author lucia
 */
public class auto {
    private String marca;
    private String modelo;
    private int puerta;
    private String cilindrada;
    private double precio;

    public auto() {
    }

    public auto(String marca, String modelo, int puerta, String cilindrada, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puerta = puerta;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
