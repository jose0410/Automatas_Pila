/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata;

/**
 *
 * @author PedroGallego
 */
public class Operacion {

    String nombre;
    String parametro;

    public Operacion(String nombre, String parametro) {
        this.nombre = nombre;
        this.parametro = parametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
    
    
}
