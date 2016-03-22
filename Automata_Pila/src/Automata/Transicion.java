/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata;

import java.util.ArrayList;

/**
 *
 * @author PedroGallego
 */
public class Transicion {
    private ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
    
    public void addOperacion (String nombre,String parametro) {
        operaciones.add(new Operacion (nombre,parametro));
    }
    
}
