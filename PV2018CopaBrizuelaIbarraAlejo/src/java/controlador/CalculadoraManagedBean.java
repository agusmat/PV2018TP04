/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Calculadora;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class CalculadoraManagedBean implements Serializable {

    private String mantisa;
    private Calculadora calculadora;

    /**
     * Creates a new instance of CalculadoraManagedBean
     */
    public CalculadoraManagedBean() {
        mantisa = new String();
        calculadora = new Calculadora();
    }

    public void realizarOperacion() {
        int primerNumero = 0;
        int segundoNumero = 0;
        char operadorSeleccionado = ' ';
        for (int i = 0; i < getMantisa().length(); i++) {
            char caracterExtraido = getMantisa().charAt(i);
            if (caracterExtraido == '+' || (caracterExtraido == '-' && i != 0) || caracterExtraido == '*' || caracterExtraido == '/') {
                primerNumero = Integer.parseInt(getMantisa().substring(0, i));
                segundoNumero = Integer.parseInt(getMantisa().substring(i + 1));
                operadorSeleccionado = caracterExtraido;
            }

        }
        double resultadoOperacion = 0;
        switch (operadorSeleccionado) {
            case '+': {
                resultadoOperacion = getCalculadora().sumar(primerNumero, segundoNumero);
                break;
            }
            case '-': {
                resultadoOperacion = getCalculadora().restar(primerNumero, segundoNumero);
                break;
            }
            case '/': {
                resultadoOperacion = getCalculadora().dividir(primerNumero, segundoNumero);
                break;
            }
            case '*': {
                resultadoOperacion = getCalculadora().multiplicar(primerNumero, segundoNumero);
                break;
            }
        }
        setMantisa(getMantisa() + '=' + resultadoOperacion);
    }

    public void registrarValorBoton() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String valorSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("valorPresionado");
        setMantisa(getMantisa() + valorSeleccionado);
    }

    public void borrarDatos() {
        setCalculadora(new Calculadora());
        setMantisa(new String());
    }

    /**
     * @return the mantisa
     */
    public String getMantisa() {
        return mantisa;
    }

    /**
     * @param mantisa the mantisa to set
     */
    public void setMantisa(String mantisa) {
        this.mantisa = mantisa;
    }

    /**
     * @return the calculadora
     */
    public Calculadora getCalculadora() {
        return calculadora;
    }

    /**
     * @param calculadora the calculadora to set
     */
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
