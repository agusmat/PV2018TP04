/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import java.util.ArrayList;
import modelo.Autor;

/**
 *
 * @author Agustin
 */
public class ListaAutor {
    private ArrayList<Autor> listadoAutor;

    public ListaAutor() {
        listadoAutor=new ArrayList();
    }

    public ListaAutor(ArrayList<Autor> listadoAutor) {
        this.listadoAutor = listadoAutor;
    }

    /**
     * @return the listadoAutor
     */
    public ArrayList<Autor> getListadoAutor() {
        return listadoAutor;
    }

    /**
     * @param listadoAutor the listadoAutor to set
     */
    public void setListadoAutor(ArrayList<Autor> listadoAutor) {
        this.listadoAutor = listadoAutor;
    }
    
    
}
