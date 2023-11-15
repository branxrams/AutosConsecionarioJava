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

    private final Vehiculo[] catalogo;
    private int indiceActual;

    public Concesionario() {
        catalogo = new Vehiculo[SIZE];
        indiceActual = 0;
    }

    public Vehiculo[] getCatalogo() {
        return catalogo;
    }

    public int getInidiceActual() {
        return indiceActual;
    }
}
