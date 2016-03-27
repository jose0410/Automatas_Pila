package Automata;
import java.util.Stack;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
/**
 *
 * @author Nando
 */
public class Validacion {
    
    
    public static void validarSimbolosEntrada(String h){        
        char[] texto = h.toCharArray(); 
        int verificarIngreso1 = 0;        
        if(texto.length == 0){
            String mensaje = "No ha ingresado un caracter "
                        + "en los Simbolos de Entrada";
                JOptionPane.showMessageDialog(null, mensaje);
        }
        for(int i = 0; i < texto.length; i++){
            if(texto[0]==',' & verificarIngreso1 == 0){
                String mensaje = "No ha ingresado un primer caracter "
                        + "en los Simbolos de Entrada";
                JOptionPane.showMessageDialog(null, mensaje);
                verificarIngreso1++;
            }else{
                if(texto.length == 1 & verificarIngreso1 == 0){
                    String mensaje = "Solo ha ingresado un caracter "
                            + "en los Simbolos de Entrada";
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    if(i%2 == 1){                        
                        if(texto[i] != ',' & verificarIngreso1 == 0){
                            String mensaje = "Ingreso dos simbolos juntos "
                                    + "en los Simbolos de Entrada";
                            JOptionPane.showMessageDialog(null, mensaje);
                            verificarIngreso1++;
                        }else{
                            i++;
                        }
                    }
                }
            }            
        }       
    }
    
    public static void validarRepetidosEntrada(String h){
        char[] texto = h.toCharArray();
        char[] repetidos = new char[texto.length];
        int ingreso = 0;
        for(int i = 0; i < texto.length; i = i + 2){
            for(int j = 0; j < texto.length; j++){
                if(texto[i] == repetidos[j] & ingreso == 0){
                    String mensaje = "Ingreso simbolos repetidos "
                                    + "en los Simbolos de Entrada";
                            JOptionPane.showMessageDialog(null, mensaje);
                            ingreso++;
                }
                else{
                    repetidos[j] = texto[i];
                }
            }
            
        }
    }
    
    public static void validarSimbolosPila(String h){        
        char[] texto = h.toCharArray(); 
        int verificarIngreso1 = 0;
        if(texto.length == 0){
            String mensaje = "No ha ingresado un caracter "
                        + "en los Simbolos de la Pila";
                JOptionPane.showMessageDialog(null, mensaje);
        }
        for(int i = 0; i < texto.length; i++){
            if(texto[0]==',' & verificarIngreso1 == 0){
                String mensaje = "No ha ingresado un primer caracter "
                        + "en los Simbolos de la Pila";
                JOptionPane.showMessageDialog(null, mensaje);
                verificarIngreso1++;
            }else{
                if(texto.length == 1 & verificarIngreso1 == 0){
                    if(i%2 == 1){                        
                        if(texto[i] != ',' & verificarIngreso1 == 0){
                            String mensaje = "Ingreso dos simbolos juntos "
                                    + "en los Simbolos de la Pila";
                            JOptionPane.showMessageDialog(null, mensaje);
                            verificarIngreso1++;
                        }else{
                            i++;
                        }
                    }
                    verificarIngreso1++;
                }
            }
                      
        }
    }
    
    public static void validarRepetidosPila(String h){
        char[] texto = h.toCharArray();
        char[] repetidos = new char[texto.length];
        int ingreso = 0;
        for(int i = 0; i < texto.length; i = i + 2){
            for(int j = 0; j < texto.length; j++){
                if(texto[i] == repetidos[j] & ingreso == 0){
                    String mensaje = "Ingreso simbolos repetidos "
                                    + "en los Simbolos de la Pila";
                            JOptionPane.showMessageDialog(null, mensaje);
                            ingreso++;
                }
                else{
                    repetidos[j] = texto[i];
                }
            }
            
        }
    }
    
    public static void validarConfPila(String h){        
        char[] texto = h.toCharArray(); 
        int verificarIngreso1 = 0;
        if(texto.length == 0){
            String mensaje = "No ha ingresado un caracter "
                        + "en la Configuracion Inicial de la Pila";
                JOptionPane.showMessageDialog(null, mensaje);
                
        }
        for(int i = 0; i < texto.length; i++){
            if(texto[0]==',' & verificarIngreso1 == 0){
                String mensaje = "No ha ingresado un primer caracter "
                        + "en la Configuracion Inicial de la Pila";
                JOptionPane.showMessageDialog(null, mensaje);
                verificarIngreso1++;
            }else{
                if(texto.length == 1 & verificarIngreso1 == 0){
                    if(i%2 == 1){                        
                        if(texto[i] != ',' & verificarIngreso1 == 0){
                            String mensaje = "Ingreso dos simbolos juntos "
                                    + "en la Configuracion Inicial de la Pila";
                            JOptionPane.showMessageDialog(null, mensaje);
                            verificarIngreso1++;
                        }else{
                            i++;
                        }
                    }
                }
            }            
        }
    }
    
    public static void validarRepetidosConfPila(String h){
        char[] texto = h.toCharArray();
        char[] repetidos = new char[texto.length];
        int ingreso = 0;
        for(int i = 0; i < texto.length; i = i + 2){
            for(int j = 0; j < texto.length; j++){
                if(texto[i] == repetidos[j] & ingreso == 0){
                    String mensaje = "Ingreso simbolos repetidos "
                                    + "en la Configuracion Inicial de la Pila";
                            JOptionPane.showMessageDialog(null, mensaje);
                            ingreso++;
                }
                else{
                    repetidos[j] = texto[i];
                }
            }
            
        }
    }
    
    public static void validarEstados (JComboBox s, JTabbedPane y){
        int i = 0;
        int x = s.getSelectedIndex();
        switch (x) {
            case 3:
                y.setEnabledAt(2, true);
            case 2:
                y.setEnabledAt(1, true);
            case 1:
                y.setEnabledAt(0, true);
                break;                
            case 0:
                JOptionPane.showMessageDialog(null, "Seleccione la cantidad "
                        + "de Estados");                
                break;
        }                
    } 
    
    
    
}
