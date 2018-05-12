/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import aplicacion.modelo.datos.ColeccionAutos;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Auto;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class AutosFormBean implements Serializable {

    private ColeccionAutos autos;
    private Auto auto;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;

    /**
     * Creates a new instance of AutoFormBean
     */
    public AutosFormBean() {
        autos = new ColeccionAutos();
    }

    public void agregarAuto() {
        setAuto(new Auto(getPatente(), getMarca(), getModelo(), getColor(), getCombustible()));
        getAutos().agregarAutos(getAuto());
    }
    public void establecerAuto(Auto unAuto){
        setAuto(unAuto);
    }

    public void modificarAuto() {
        getAutos().modificarAutos(getAuto());
    }
    public void eliminarAuto(){
        getAutos().eliminarAuto(getAuto());
    }
    /**
     * @return the autos
     */
    public ColeccionAutos getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ColeccionAutos autos) {
        this.autos = autos;
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
}