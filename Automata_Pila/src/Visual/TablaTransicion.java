/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nando
 */
public class TablaTransicion {
    
    public static void modificarTablar(String se, String sp, JTable e){
        char[] secolumnas = se.toCharArray();
        char[] spfilas = sp.toCharArray();
        String [] columnas = new String [(secolumnas.length/2)+2];        
        String [] filas = new String[(spfilas.length/2)+1];
        for (int i = 0; i < secolumnas.length; i = i + 2){
            for(int j = 1;j < columnas.length; j++){
                columnas[j]=String.valueOf(secolumnas[i]);
                i = i +2;
            }            
        }
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        for (int i = 0; i < spfilas.length; i = i + 2){
            for(int j = 0;j < filas.length; j++){
                filas[j]=String.valueOf(spfilas[i]);
                String [] aux = new String [(columnas.length)];
                aux[0] = filas[j];                
                dtm.addRow(aux);
                i = i +2;
            }            
        }
        e.setModel(dtm);
    }
    
    public static void crearArchivo(JTable s1,JTable s2, JTable s3, String h1, JComboBox x) throws FileNotFoundException, UnsupportedEncodingException{
        int cont1 = 0;
        int y = x.getSelectedIndex();
        char[] texto = h1.toCharArray();
        String [] elementosPila = new String [(texto.length/2)+2];
        String caracterFinal = null;
        int m = elementosPila.length;
        int n = s1.getColumnCount();
        String [] elementosEntrada = new String [n];
        String [] operaciones1 = new String[s1.getRowCount()*s1.getColumnCount()];
        String [] operaciones2 = new String[s2.getRowCount()*s2.getColumnCount()];
        String [] operaciones3 = new String[s3.getRowCount()*s3.getColumnCount()];        
        for (int i = 0; i < texto.length; i = i + 2){
            for(int j = 1;j < elementosPila.length; j++){
                elementosPila[j]=String.valueOf(texto[i]);
                i = i +2;
            }           
        }
        for (int i = 1; i < n; i++){
            elementosEntrada[i] = s1.getColumnName(i);
            if(i == (n - 1)){
                caracterFinal = s1.getColumnName(i);
            }
        }
        for(int i = 0; i < s1.getRowCount(); i++){            
            for(int j = 1; j < s1.getColumnCount(); j++){
                for(int z = 0; z < operaciones1.length; z++){
                    operaciones1[z] = (String)s1.getValueAt(i, j);
                }                
            }
        }
        for(int i = 0; i < s2.getRowCount(); i++){            
            for(int j = 1; j < s2.getColumnCount(); j++){
                for(int z = 0; z < operaciones2.length; z++){
                    operaciones2[z] = (String)s2.getValueAt(i, j);
                }  
            }
        }
        for(int i = 0; i < s3.getRowCount(); i++){            
            for(int j = 1; j < s3.getColumnCount(); j++){
                for(int z = 0; z < operaciones3.length; z++){
                    operaciones3[z] = (String)s3.getValueAt(i, j);
                }  
            }
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("PracticaLenguaje.java", "UTF-8");
            writer.println("public class Reconocedor(){\n"
                + " public static void main(String [] args){\n"
                + "     Scanner s = new Scanner(System.in);\n"
                + "     String cadena = s.next();\n"
                + "     Stack Pila = new Stack;\n"
                + "     int estados = " + y + ";\n"
                + "     String caracterFinal = " + caracterFinal + ";\n"
                + "     char [] elementosPila = new char ["+ m +"];\n"
                + "     char [] elementosEntrada = new char ["+ n +"];\n"
                + "     char [] reconocer = cadena.toCharArray();\n"
                + "     int fin = 0;\n"
                + "     String [] operaciones1 = new String["+ s1.getRowCount()*s1.getColumnCount()+"];\n" 
                + "     String [] operaciones2 = new String["+s2.getRowCount()*s2.getColumnCount()+"];\n" 
                + "     String [] operaciones3 = new String["+s3.getRowCount()*s3.getColumnCount()+"];\n");
            for(int i = 0; i < m; i++){
                writer.println("      elementosPila["+ i +"] = " + elementosPila[i] + ";\n");
            }
            for(int i = 0; i < n; i++){
                writer.println("      elementosEntrada["+ i +"] = " + elementosEntrada[i] + ";\n");
            }
            for(int i = 0; i < operaciones1.length; i++){
                writer.println("      operaciones1[" +i+ "] = " + operaciones1[i] + ";\n");
            }
            for(int i = 0; i < operaciones2.length; i++){
                writer.println("      operaciones2[" +i+ "] = " + operaciones2[i] + ";\n");
            }
            for(int i = 0; i < operaciones3.length; i++){
                writer.println("      operaciones3[" +i+ "] = " + operaciones3[i] + ";\n");
            }

            writer.println("      while(reconocer[fin]!= caracterFinal){\n"
                    + "         for(int w = 0; w < operaciones1.length; w++){\n"
                    + "             for(int j = 0; j < elementosPila.length; j++){\n"
                    + "             "
                    + "                 if(estados == 1){"
                    + "                     switch(Pila.peek()){;"
                    + "                         case elementosPila[j]:"
                    + "                             for(int y = 0; y < elementosEntrada; y++){"
                    + "                                 switch(reconocer[y]){"
                    + "                                     case elementosEntrada[y]:");
            for(int i = 0; i < operaciones1.length; i++){
                if(i < n){
                    writer.println("                                          "+operaciones1[i]);
                }
                if(i == (n - 1)){
                    for(int j = 0; i < operaciones1.length; i++){
                        operaciones1[j] = operaciones1[i+1];
                        }
                }

            }
            writer.println("                                 }"
                    + "                             }"
                    + "                     }"
                    + "                 }"
                    + "                 if(estados == 2){"
                    + "                     switch(Pila.peek()){;"
                    + "                         case elementosPila[j]:"
                    + "                             for(int y = 0; y < elementosEntrada; y++){"
                    + "                                 switch(reconocer[y]){"
                    + "                                     case elementosEntrada[y]:");
            for(int i = 0; i < operaciones2.length; i++){
                if(i < n){
                    writer.println("                                          "+operaciones2[i]);
                }
                if(i == (n - 1)){
                    for(int j = 0; i < operaciones2.length; i++){
                        operaciones2[j] = operaciones2[i+1];
                        }
                }

            }
            writer.println("                                 }"
                    + "                             }"
                    + "                     }"
                    + "                 }"
                    + "                 if(estados == 3){"
                    + "                     switch(Pila.peek()){;"
                    + "                         case elementosPila[j]:"
                    + "                             for(int y = 0; y < elementosEntrada; y++){"
                    + "                                 switch(reconocer[y]){"
                    + "                                     case elementosEntrada[y]:");
            for(int i = 0; i < operaciones3.length; i++){
                if(i < n){
                    writer.println("                                          "+operaciones3[i]);
                }
                if(i == (n - 1)){
                    for(int j = 0; i < operaciones3.length; i++){
                        operaciones3[j] = operaciones3[i+1];
                        }
                }

            }
            writer.println(""
                + "             }"
                + "         }"
                + "         fin++;"
                + "     }"
                + " }"
                + "}");
            writer.close();
            System.exit(cont1);
        }catch(FileNotFoundException ex){
            
        }finally{
            writer.close();
        }
    
        
        
        
    }
    
}
