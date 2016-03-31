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
        String [] columnas = new String [(secolumnas.length/2)+1];        
        String [] filas;
        for (int i = 0; i < secolumnas.length; i = i + 2){
            for(int j = 0;j < columnas.length; j++){
                columnas[j]=String.valueOf(secolumnas[i]);
                i = i +2;
            }            
        }
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        e.setModel(dtm);
    }
    
}
