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
    
    public boolean isFull(){
        return (tamaño == top);
    }
    
    public boolean isVoid(){
        return (top == 0);
    }
            
    public void addObject(Object elementoPila){
        if(isFull()){
            System.out.println("Pila llena");
        }else{
            Pila[top]= elementoPila;
            top ++;
        }
        
    }
    
    public void deleteObject(){
        if(isVoid()){
            System.out.println("Pila Vacia");
        }else{
            top --;        
        }
    }
    
    public Object first(){
        return (Pila[top]);
    }
    
}
