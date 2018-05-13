/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import java.util.ArrayList;
import modelo.Libros;

/**
 *
 * @author Agustin
 */
public class ListadoLibros {
    private ArrayList<Libros> listadoLibros;

    public ListadoLibros() {
        listadoLibros=new ArrayList();
    }

    public ListadoLibros(ArrayList<Libros> listadoLibros) {
        this.listadoLibros = listadoLibros;
    }
    

    /**
     * @return the listadoLibros
     */
    public ArrayList<Libros> getListadoLibros() {
        return listadoLibros;
    }

    /**
     * @param listadoLibros the listadoLibros to set
     */
    public void setListadoLibros(ArrayList<Libros> listadoLibros) {
        this.listadoLibros = listadoLibros;
    }
    
    
}
