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
public class Autor {
    private String dni;
    private String apellido;
    private String nombre;

    public Autor() {
    }

    public Autor(String dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals (Object other) {
        return (other instanceof Autor) && (dni !=null )? dni.equals(((Autor) other).dni):(other == this);
    }

    @Override
    public int hashCode() {
        return (dni!=null)? (this.getClass().hashCode() + dni.hashCode()): super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Autor: [%s,%s]", apellido, nombre);
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
