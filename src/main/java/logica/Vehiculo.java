/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author brara
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String cilindrada;
    private int precio;

    public Vehiculo() { // Constructor por defecto
    }

    public Vehiculo(String marca, String modelo, String cilindrada, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    // getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public int getPrecio() {
        return precio;
    }

    // Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setMarca(int precio) {
        this.precio = precio;
    }
}
