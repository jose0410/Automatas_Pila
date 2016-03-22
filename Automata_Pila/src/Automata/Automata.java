/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata;

import java.util.*;

/**
 *
 * @author PedroGallego
 */
public class Automata {
    ArrayList<Character> sentrada;
    ArrayList<Character> spila;
    int nestados;
    Transicion [][] transiciones; 

    public Automata(ArrayList<Character> sentrada, ArrayList<Character> spila, int nestados) {
        this.sentrada = sentrada;
        this.spila = spila;
        this.nestados = nestados;
        this.transiciones = new Transicion[spila.size()][sentrada.size()];
    }

    
    
}
