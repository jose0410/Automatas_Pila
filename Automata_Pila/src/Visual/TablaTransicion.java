/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

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
    
}
