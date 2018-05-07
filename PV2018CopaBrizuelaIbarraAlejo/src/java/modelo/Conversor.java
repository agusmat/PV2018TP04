/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Agustin
 */
public class Conversor {
    private double gradosC;
    public Conversor() {
    }

    public Conversor(double gradosC) {
        this.gradosC = gradosC;
    }

    /**
     * @return the gradosC
     */
    public double getGradosC() {
        return gradosC;
    }

    /**
     * @param gradosC the gradosC to set
     */
    public void setGradosC(double gradosC) {
        this.gradosC = gradosC;
    }
    
    
}
