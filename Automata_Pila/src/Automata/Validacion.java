package Automata;
import java.util.Stack;
import javax.swing.JOptionPane;
/**
 *
 * @author Nando
 */
public class Validacion {
    
    
    public static void validarSimbolosEntrada(String h){        
        char[] texto = h.toCharArray(); 
        int verificarIngreso = 0;
        for(int i = 0; i < texto.length; i++){
            if(texto[0]==','){
                String mensaje = "No ha ingresado un primer caracter "
                        + "en los Simbolos de Entrada";
                JOptionPane.showMessageDialog(null, mensaje);
            }else{
                if(texto.length == 1){
                    String mensaje = "Solo ha ingresado un caracter "
                            + "en los Simbolos de Entrada";
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    if(i%2 == 1){                        
                        if(texto[i] != ',' & verificarIngreso == 0){
                            String mensaje = "Ingreso dos simbolos juntos "
                                    + "en los Simbolos de Entrada";
                            JOptionPane.showMessageDialog(null, mensaje);
                            verificarIngreso++;
                        }else{
                            i++;
                        }
                    }
                }
            }            
        }       
    }
    
    public static void validarSimbolosPila(String h){        
        char[] texto = h.toCharArray(); 
        int verificarIngreso = 0;
        char[] verificarRepetidos;
        for(int i = 0; i < texto.length; i++){
            if(texto[0]==','){
                String mensaje = "No ha ingresado un primer caracter "
                        + "en los Simbolos de la Pila";
                JOptionPane.showMessageDialog(null, mensaje);
            }else{
                if(texto.length == 1){
                    String mensaje = "Solo ha ingresado un caracter "
                            + "en los Simbolos de la Pila";
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    if(i%2 == 1){                        
                        if(texto[i] != ',' & verificarIngreso == 0){
                            String mensaje = "Ingreso dos simbolos juntos "
                                    + "en los Simbolos de la Pila";
                            JOptionPane.showMessageDialog(null, mensaje);
                            verificarIngreso++;
                        }else{
                            i++;
                        }
                    }
                }
            }
            //falta verificar que no esten repetidos en ambos metodos de validacion          
        }
    }
    
}
