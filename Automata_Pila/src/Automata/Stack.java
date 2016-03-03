package Automata;

/**
 *
 * @author Nando
 */
public class Stack {
    
    private Object [] Pila;
    private int top;
    private int tamaño;
    
    public Stack (int cima, int estilo, int tamaño){
        if(estilo == 0){
            this.top = 0;
        }else{
            top = estilo;            
        }
        this.tamaño = tamaño;
    }
    
}
