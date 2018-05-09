/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class ListaNumeros {
   private ArrayList<Integer> listaNum;

    public ListaNumeros() {
        listaNum=new ArrayList();
    }

    public ListaNumeros(ArrayList<Integer> listaNum) {
        this.listaNum = listaNum;
    }

    /**
     * @return the listaNum
     */
    public ArrayList<Integer> getListaNum() {
        return listaNum;
    }

    /**
     * @param listaNum the listaNum to set
     */
    public void setListaNum(ArrayList<Integer> listaNum) {
        this.listaNum = listaNum;
    }
   
   
}
