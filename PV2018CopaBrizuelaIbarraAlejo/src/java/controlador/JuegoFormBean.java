/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Ahorcado;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class JuegoFormBean implements Serializable {

    private Ahorcado ahorcado;
    private char letraIngresada;
    private String palabraIngresada;
    private boolean componenteDeshabilitador;

    /**
     * Creates a new instance of JuegoFormBean
     */
    public JuegoFormBean() {
        ahorcado = new Ahorcado();
        componenteDeshabilitador = false;
    }

    public void empezarJuego() {
        getAhorcado().empezarJuego(getPalabraIngresada());
        setComponenteDeshabilitador(true);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Juego Iniciado", "Que tengas suerte"));

    }

    public void controlarLetra() {
        boolean letraEncontrada = getAhorcado().buscarLetra(getLetraIngresada());
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (letraEncontrada == true) {
            if (getAhorcado().juegoGanado() == true) {
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usted gano el Juego", "Felicitaciones"));
            }
        } else {
            if (getAhorcado().getIntentos() == 0) {
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usted perdio", "Intente de Nuevo"));
                nuevoJuego();
            }
        }
        
    }
    public void nuevoJuego(){
        setComponenteDeshabilitador(false);
        setPalabraIngresada(new String());
        setAhorcado(new Ahorcado());
    }

    /**
     * @return the ahorcado
     */
    public Ahorcado getAhorcado() {
        return ahorcado;
    }

    /**
     * @param ahorcado the ahorcado to set
     */
    public void setAhorcado(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the componenteDeshabilitador
     */
    public boolean isComponenteDeshabilitador() {
        return componenteDeshabilitador;
    }

    /**
     * @param componenteDeshabilitador the componenteDeshabilitador to set
     */
    public void setComponenteDeshabilitador(boolean componenteDeshabilitador) {
        this.componenteDeshabilitador = componenteDeshabilitador;
    }

}
