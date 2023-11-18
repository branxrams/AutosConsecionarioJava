/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.UUID; // paquete para generar un id unico
import java.time.LocalDate; //Paquete para generar la fecha actual
import java.time.format.DateTimeFormatter; // Paquete para formatear la fecha

/**
 *
 * @author brara
 * 
 */
public class Venta {
    
    private String id;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Vendedor vendedor;
    private String fecha;
    private boolean cedido;

    public Venta() {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, Vendedor vendedor) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        
        //Datos generamos por defecto y generados cada vez que se instancie una nueva clase
        this.id = generarId();
        this.fecha = formatearFecha();
        this.cedido = false;
    }

    // getters

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public String getId(){
        return id;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public boolean getCedido(){
        return cedido;
    }
    
    // setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void setCedido(Boolean cedido){
        this.cedido = cedido;
    }
    
    
    //Generar un id unico para cada venta registrada
    private static String generarId() {
        String randomPart = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        String fechaPart = Long.toString(System.currentTimeMillis(), 32);
        return randomPart + fechaPart;
    }
    
    //Obtenemos la fecha actual y le damos un formato
    private static String formatearFecha(){
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        String fechaFormateada = fecha.format(formatoFecha);
        
        return fechaFormateada;
    }
}
