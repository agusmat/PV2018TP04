/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class ConversorManagedBean {

    private double gradosF;
    private double a;

    /**
     * Creates a new instance of ConversorManagedBean
     */
    public ConversorManagedBean() {
    }

    public void convertir() {
        setGradosF((getA() * 1.8)+32);
    }

    /**
     * @return the gradosF
     */
    public double getGradosF() {
        return gradosF;
    }

    /**
     * @param gradosF the gradosF to set
     */
    public void setGradosF(double gradosF) {
        this.gradosF = gradosF;
    }

    /**
     * @return the unGrado
     */
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

}
