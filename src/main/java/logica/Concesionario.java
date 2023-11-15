/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author brara
 */
public class Concesionario {
    // Constante para definir el tamaño de los arreglos
    private static final int SIZE = 150;

    // Arreglos persistentes para los datos a tratar
    private final Cliente[] listaCliente;
    private final Vehiculo[] catalogoVehiculo;

    // Variables para guardar el indice de los arreglos
    private int indiceVehiculo;
    private int indiceCliente;

    // Constructor

    public Concesionario() {
        listaCliente = new Cliente[SIZE];
        catalogoVehiculo = new Vehiculo[SIZE];
        indiceVehiculo = 0;
        indiceCliente = 0;
    }

    // Getters
    public Vehiculo[] getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public int getIndiceVehiculo() {
        return indiceVehiculo;
    }

    public int getInidiceCliente() {
        return indiceCliente;
    }

    // Buscar cliente, retornara el objeto del cliente si lo encuentra, si no
    // retorna null
    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : listaCliente) {
            if (cliente != null && cliente.getDni() == dni) {
                return cliente;
            }
        }
        return null;
    }

    // Buscar cliente, retornara el objeto del cliente si lo encuentra, si no
    // retorna null
    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : catalogoVehiculo) {
            if (vehiculo != null && vehiculo.getMatricula() == matricula) {
                return vehiculo;
            }
        }
        return null;
    }

    // Agregar clientes, recibe un objeto de cliente, usa buscarCliente para
    // verificar que el cliente existe, retorna true si lo guardo, false si ya el
    // cliente existe
    public boolean agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getDni()) == null) {
            listaCliente[indiceVehiculo] = cliente;
            indiceCliente++;
            return true;
        }
        return false;
    }

    // Agregar vehiculos, recibe un objeto de vehiculos, usa buscarVehiculo para
    // verificar que el vehiculo existe, retorna true si lo guardo, false si ya la
    // matricula existe
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (buscarVehiculo(vehiculo.getMatricula()) == null) {
            catalogoVehiculo[indiceVehiculo] = vehiculo;
            indiceVehiculo++;
            return true;
        }
        return false;
    }

}
