/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ListaNumeros;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class NumerosManagedBean implements Serializable {
    private ListaNumeros listadoNum;
    private int a;
    private int may;
    private int men;
    private double prom;
    /**
     * Creates a new instance of NumerosManagedBean
     */
    public NumerosManagedBean() {
        listadoNum=new ListaNumeros();
    }
    public void agregarNum(){
        getListadoNum().getListaNum().add(getA());
    }
    public void obtDatos(){
        setMay(obtMayor());
        setMen(obtMen());
        setProm(obtProm());
    }
    public int obtMayor(){
        int res=getListadoNum().getListaNum().get(0);
        for (int i=0;i<getListadoNum().getListaNum().size();i++){
            if (getListadoNum().getListaNum().get(i)>res)
                res=getListadoNum().getListaNum().get(i);
        }
        return res;
    }
    public int obtMen(){
        int res=getListadoNum().getListaNum().get(0);
        for (int i=0;i<getListadoNum().getListaNum().size();i++){
            if (getListadoNum().getListaNum().get(i)<res)
                res=getListadoNum().getListaNum().get(i);
        }
        return res;
    }
    public double obtProm(){
        int sum=0;
        double prom;
        for (int i=0;i<getListadoNum().getListaNum().size();i++){
            sum=sum+getListadoNum().getListaNum().get(i);
        }
        prom=sum/(getListadoNum().getListaNum().size());
        return prom;
    }

    /**
     * @return the listadoNum
     */
    public ListaNumeros getListadoNum() {
        return listadoNum;
    }

    /**
     * @param listadoNum the listadoNum to set
     */
    public void setListadoNum(ListaNumeros listadoNum) {
        this.listadoNum = listadoNum;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the may
     */
    public int getMay() {
        return may;
    }

    /**
     * @param may the may to set
     */
    public void setMay(int may) {
        this.may = may;
    }

    /**
     * @return the men
     */
    public int getMen() {
        return men;
    }

    /**
     * @param men the men to set
     */
    public void setMen(int men) {
        this.men = men;
    }

    /**
     * @return the prom
     */
    public double getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(double prom) {
        this.prom = prom;
    }
}
