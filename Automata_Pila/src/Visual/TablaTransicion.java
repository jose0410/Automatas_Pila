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
        int numeroEstados = x.getSelectedIndex();
        char[] texto = h1.toCharArray();
        String [] elementosPila = new String [(texto.length/2)+2];
        String caracterFinal = null;
        int cantidadElementosPila = elementosPila.length;
        int numerodeColumnas = s1.getColumnCount();
        String [] elementosEntrada = new String [numerodeColumnas];
        String [] operaciones1 = new String[(s1.getRowCount())*(s1.getColumnCount())];
        String [] operaciones2 = new String[(s2.getRowCount())*(s2.getColumnCount())];
        String [] operaciones3 = new String[(s3.getRowCount())*(s3.getColumnCount())];   
        int op1 = 0;
        int op2 = 0;
        int op3 = 0;
        for (int i = 0; i < texto.length; i = i + 2){
            for(int j = 1;j < elementosPila.length; j++){
                elementosPila[j]=String.valueOf(texto[i]);
                i = i +2;
            }           
        }
        for (int i = 1; i < numerodeColumnas; i++){
            elementosEntrada[i] = s1.getColumnName(i);
            if(i == (numerodeColumnas - 1)){
                caracterFinal = s1.getColumnName(i);
            }
        }
        
        for(int i = 0; i < s1.getRowCount(); i++){            
            int j = 1;           
            
                for(int z = 0; z < operaciones1.length; z++){                        
                        if(j<(s1.getColumnCount())){
                            operaciones1[op1] = (String)s1.getValueAt(i, j);
                            j++;
                            op1++;
                        }
                
            }
        }
        for(int i = 0; i < s2.getRowCount(); i++){            
            int j = 1;           
            
                for(int z = 0; z < operaciones2.length; z++){                        
                        if(j<(s2.getColumnCount())){
                            operaciones2[op2] = (String)s2.getValueAt(i, j);
                            j++;
                            op2++;
                        }
                
            }
        }
        for(int i = 0; i < s3.getRowCount(); i++){            
            int j = 1;           
            
                for(int z = 0; z < operaciones3.length; z++){                        
                        if(j<(s3.getColumnCount())){
                            operaciones3[op3] = (String)s3.getValueAt(i, j);
                            j++;
                            op3++;
                        }
                
            }
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("PracticaLenguaje.java", "UTF-8");
            writer.println("public class PracticaLenguaje{\n"
                + " public static void main(String [] args){\n"
                + "     Scanner s = new Scanner(System.in);\n"
                + "     String cadena = s.next();\n"
                + "     Stack Pila = new Stack();\n"
                + "     int estados = 1;\n"
                + "     char caracterFinal = '" + caracterFinal + "';\n"
                + "     char [] reconocer = cadena.toCharArray();\n"
                + "     int fin = 0;\n");
                /*+ "     String [] operaciones1 = new String["+ s1.getRowCount()*s1.getColumnCount()+"];\n" 
                + "     String [] operaciones2 = new String["+s2.getRowCount()*s2.getColumnCount()+"];\n" 
                + "     String [] operaciones3 = new String["+s3.getRowCount()*s3.getColumnCount()+"];\n");*/
            for(int i = 0; i < cantidadElementosPila; i++){
                writer.println("      elementosPila["+ i +"] = " + elementosPila[i] + ";\n");
            }
            for(int i = 0; i < numerodeColumnas; i++){
                writer.println("      elementosEntrada["+ i +"] = " + elementosEntrada[i] + ";\n");
            }
            /*for(int i = 0; i < operaciones1.length; i++){
                writer.println("      operaciones1[" +i+ "] = " + operaciones1[i] + ";\n");
            }
            for(int i = 0; i < operaciones2.length; i++){
                writer.println("      operaciones2[" +i+ "] = " + operaciones2[i] + ";\n");
            }
            for(int i = 0; i < operaciones3.length; i++){
                writer.println("      operaciones3[" +i+ "] = " + operaciones3[i] + ";\n");
            }*/
            int controladorPila = 1;
            int controladorEntrada = 1;
            int mop = 0;
            writer.println("      while(reconocer[fin]!= caracterFinal){\n"
                    + "                 if(estados == 1){\n"
                    + "                     switch(Pila.peek()){;\n");
            while(controladorPila < elementosPila.length){
                writer.println("                case '"+elementosPila[controladorPila]+"':\n");
                controladorEntrada = 1;
                while(controladorEntrada < elementosEntrada.length){
                writer.println("                    if('"+elementosEntrada[controladorEntrada]+"' == reconocer[fin]){\n"
                             + "                        Pila."+operaciones1[mop]+");\n");
                mop++;
                controladorEntrada++;
                }
                controladorPila++;
            } 
            mop = 0;
            writer.println("                                 }\n"
                    + "                             }\n"
                    + "                     }\n"
                    + "                 if(estados == 2){\n"
                    + "                     switch(Pila.peek()){;\n");
            while(controladorPila < elementosPila.length){
                controladorEntrada = 1;
                writer.println("                case '"+elementosPila[controladorPila]+"':\n");
                while(controladorEntrada < elementosEntrada.length){
                writer.println("                    if('"+elementosEntrada[controladorEntrada]+"' == reconocer[fin]){\n"
                             + "                        Pila."+operaciones2[mop]+");\n");
                mop++;
                controladorEntrada++;
                }
                controladorPila++;
            }
            writer.println("                                 }\n"
                    + "                             }\n"
                    + "                     }\n"
                    + "                 }\n"
                    + "                 if(estados == 3){\n"
                    + "                     switch(Pila.peek()){;\n");
            while(controladorPila < elementosPila.length){
                controladorEntrada = 1;
                writer.println("                case '"+elementosPila[controladorPila]+"':\n");
                while(controladorEntrada < elementosEntrada.length){
                    writer.println("                    if('"+elementosEntrada[controladorEntrada]+"' == reconocer[fin]){\n"
                             + "                        Pila."+operaciones3[mop]+");\n");
                    mop++; 
                    controladorEntrada++;
                }
                controladorPila++;
            }
            writer.println(""
                + "             }\n"
                + "         }\n"
                + "         fin++;\n"
                + "     }\n"
                + " }\n"
                + "}");
            writer.close();
            System.exit(cont1);
        }catch(FileNotFoundException ex){
            
        }finally{
            writer.close();
        }
    
        
        
        
    }
    
}
