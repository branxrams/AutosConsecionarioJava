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
    private String matricula;
    private String marca;
    private String modelo;
    private String cilindrada;
    private int precio;
    private boolean usado;
    private String[] opciones = {"", ""}; //por defecto es vacia

    public Vehiculo() { // Constructor por defecto
    }

    public Vehiculo(String matricula, String marca, String modelo, String cilindrada, int precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
        
        
        //Datos que se setean por defecto cuando se instancia la clase
        this.usado = false;
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

    public String getMatricula() {
        return matricula;
    }
    
    public boolean getUsado(){
        return usado;
    }
    
    public String[] getOpciones(){
        return opciones;
    }

    // Setters

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void setUsado(boolean usado){
        this.usado = usado;
    }
    
    public void setOpciones(String[] opciones){
        this.opciones = opciones;
    }

//    @Override
//    public String toString() {
//        StringBuilder cadena;
//        cadena = new StringBuilder("Matricula: " + this.matricula + '\n' +
//                "Modelo: " + this.modelo + "\n" +
//                "CC: " + this.cilindrada + "\n" +
//                "Precio: " + this.precio + "\n");
//        return cadena.toString();
//    }
}
