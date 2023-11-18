/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.text.NumberFormat; // Paquete para darle formato a la moneda
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author brara
 */
public class Concesionario {

    // Constante para definir el tamaño de los arreglos
    private static final int SIZE = 150;

    // Arreglos persistentes para los datos a tratar
    private final Vendedor[] listaVendedor;
    private final Cliente[] listaCliente;
    private Vehiculo[] catalogoVehiculo;
    private final Venta[] listaVenta;

    // Variables para guardar el indice de los arreglos
    private int indiceVehiculo;
    private int indiceCliente;
    private int indiceVenta;
    private int indiceVendedor;

    // Constructor
    public Concesionario() {
        listaCliente = new Cliente[SIZE];
        catalogoVehiculo = new Vehiculo[SIZE];
        listaVenta = new Venta[SIZE];
        listaVendedor = new Vendedor[SIZE];
        indiceVehiculo = 0;
        indiceCliente = 0;
        indiceVenta = 0;
        indiceVendedor = 0;
    }

    // Getters
    public Vehiculo[] getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public Venta[] getListaVenta() {
        return listaVenta;
    }

    public int getIndiceVehiculo() {
        return indiceVehiculo;
    }

    public int getInidiceCliente() {
        return indiceCliente;
    }

    public int getIndiceVenta() {
        return indiceVenta;
    }

    public int getIndiceVendedor() {
        return indiceVendedor;
    }
    

    // Buscar cliente, retornara el objeto del cliente si lo encuentra, si no
    // retorna null
    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : listaCliente) {
            if (cliente != null && cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    // Buscar cliente, retornara el objeto del cliente si lo encuentra, si no
    // retorna null
    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : catalogoVehiculo) {
            if (vehiculo != null && vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    // Buscar cliente, retornara el objeto del cliente si lo encuentra, si no
    // retorna null
    public Vendedor buscarVendedor(String dni) {
        for (Vendedor vendedor : listaVendedor) {
            if (vendedor != null && vendedor.getDni().equals(dni)) {
                return vendedor;
            }
        }
        return null;
    }

    // Busca una venta por ID
    public List<Venta> buscarVentaId(String id) {
        List<Venta> ventasEncontradas = new ArrayList<>();
        for (Venta venta : listaVenta) {
            if (venta != null && venta.getCliente().getDni().equals(id)) {
                ventasEncontradas.add(venta);
            }
        }
        //Si la lista esta llena retorna la lista
        if (!ventasEncontradas.isEmpty()) {
            return ventasEncontradas; 
        }
        return null;
    }

    // Agregar clientes, recibe un objeto de cliente, usa buscarCliente para
    // verificar que el cliente existe, retorna true si lo guardo, false si ya el
    // cliente existe
    public boolean agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getDni()) == null) {
            listaCliente[indiceCliente] = cliente;
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

    public boolean agregarVendedor(Vendedor vendedor) {
        if (buscarVendedor(vendedor.getDni()) == null) {
            listaVendedor[indiceVendedor] = vendedor;
            indiceVendedor++;
            return true;
        }
        return false;
    }

    // Agregar a una lista para relacionar el cliente, vehiculo y vendedor
    public boolean agregarVenta(Venta venta) {
        listaVenta[indiceVenta] = venta;
        indiceVenta++;
        return true;
    }

    public String formatoValor(int valor) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(); // Formateara el valor en USD

        String nuevoValor = formato.format(valor);

        return nuevoValor;
    }

    public boolean eliminarVehiculo(String matricula) {
        int indice = -1;
        Vehiculo[] catalogoTemporal = new Vehiculo[SIZE - 1];
        for (int i = 0; i < catalogoVehiculo.length; i++) {
            if (catalogoVehiculo[i].getMatricula().equals(matricula)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            for (int i = 0, k = 0; i < catalogoVehiculo.length; i++) {
                if (i != indice) {
                    catalogoTemporal[k++] = catalogoVehiculo[i];
                }
            }

            this.catalogoVehiculo = catalogoTemporal;
            System.out.println("vehiculo eliminado");
            return true;
            
        }

        return false;
    }
}
