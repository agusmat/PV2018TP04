/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import aplicacion.modelo.datos.ListaAutor;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Libros;
import aplicacion.modelo.datos.ListadoLibros;
import java.util.ArrayList;
import modelo.Autor;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class NewJSFManagedBean implements Serializable {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    private Libros libro;
    private ListadoLibros listaLibros;
    private String autor;
    private int isbn;
    private int precio;
    private String titulo;

    private Autor unAutor;
    private ListaAutor listaAutor;

    public NewJSFManagedBean() {
        listaLibros=new ListadoLibros();
        listaAutor=new ListaAutor();
        listaAutor.getListadoAutor().add(new Autor("4324324", "yeia", "tuse"));
        listaAutor.getListadoAutor().add(new Autor("4324324", "yeisa", "tusesa"));
        listaAutor.getListadoAutor().add(new Autor("4324324", "yeiasda", "tufsafse"));
        
    }
    /**
     * Creates a new instance of LibrosManagedBean
     */
    
    
    public void crearLibro(){
        setLibro(new Libros(getIsbn(), getAutor(), getPrecio(), getTitulo()));
        getListaLibros().getListadoLibros().add(getLibro());
    }

    /**
     * @return the libro
     */
    public Libros getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    /**
     * @return the listaLibros
     */
    public ListadoLibros getListaLibros() {
        return listaLibros;
    }

    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(ListadoLibros listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the unAutor
     */
    public Autor getUnAutor() {
        return unAutor;
    }

    /**
     * @param unAutor the unAutor to set
     */
    public void setUnAutor(Autor unAutor) {
        this.unAutor = unAutor;
    }

    /**
     * @return the listaAutor
     */
    public ListaAutor getListaAutor() {
        return listaAutor;
    }

    /**
     * @param listaAutor the listaAutor to set
     */
    public void setListaAutor(ListaAutor listaAutor) {
        this.listaAutor = listaAutor;
    }
    
    
}
