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
    private static final int SIZE = 150;

    private final Cliente[] listaCliente;
    private final Vehiculo[] catalogoVehiculo;
    private int indiceVehiculo;
    private int indiceCliente;

    public Concesionario() {
        listaCliente = new Cliente[SIZE];
        catalogoVehiculo = new Vehiculo[SIZE];
        indiceVehiculo = 0;
        indiceCliente = 0;
    }

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

    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : listaCliente) {
            if (cliente != null && cliente.getDni() == dni) {
                return cliente;
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : catalogoVehiculo) {
            if (vehiculo != null && vehiculo.getMatricula() == matricula) {
                return vehiculo;
            }
        }
        return null;
    }

    public boolean agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getDni()) == null) {
            listaCliente[indiceVehiculo] = cliente;
            indiceCliente++;
            return true;
        }
        return false;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (buscarVehiculo(vehiculo.getMatricula()) == null) {
            catalogoVehiculo[indiceVehiculo] = vehiculo;
            indiceVehiculo++;
            return true;
        }
        return false;
    }

}
