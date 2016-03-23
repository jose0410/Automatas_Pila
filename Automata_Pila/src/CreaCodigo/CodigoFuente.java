/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreaCodigo;

import Automata.Automata;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author PedroGallego
 */
public class CodigoFuente {
    private Automata automata;
    
    public CodigoFuente (Automata automata) {
        this.automata = automata;
    }
    
    public boolean crearArchivoJava (String codigo,String ruta,String nombre) {
        try {
            File archivo = new File(ruta+nombre+".java");
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(codigo);
            escribir.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    public String crearCodigoJava () {
        return "";
    }
}
