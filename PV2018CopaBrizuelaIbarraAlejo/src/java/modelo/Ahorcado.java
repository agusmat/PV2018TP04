/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class Ahorcado implements Serializable {

    private String palabraAdivinar;
    private int intentos;
    private char[] palabraAhorcado;
    private String imagen;

    public Ahorcado() {
        palabraAdivinar=new String();
        palabraAhorcado=new char[10];//palabraAdivinar.length()];
        intentos=5;
    }

    public Ahorcado(String palabraAdivinar, int intentos, char[] palabraAhorcado) {
        this.palabraAdivinar = palabraAdivinar;
        this.intentos = intentos;
        this.palabraAhorcado = palabraAhorcado;
    }
    public void empezarJuego(String palabra){
        setPalabraAdivinar(palabra);
    }
    public ArrayList<String> getPalabraAhorcadoFormato(){
    ArrayList<String> caracteresPalabra=new ArrayList();
    for(int i=0;i<getPalabraAdivinar().length();i++){
        caracteresPalabra.add(String.valueOf(getPalabraAhorcado()[i]));
    }
    return caracteresPalabra;
    }
    public boolean buscarLetra(char a){
        boolean encontrado=false;
        for (int i=0;i<getPalabraAdivinar().length();i++){
            if (a==getPalabraAdivinar().charAt(i)){
                encontrado=true;
                getPalabraAhorcado()[i]=a;
            }
        }
        if(encontrado==false){
            setIntentos(getIntentos()-1);
            switch (getIntentos()){
                case 4:
                        setImagen("/images/ahorcado 1.png");
                        break;
                case 3:
                        setImagen("/images/ahorcado 2.png");
                        break;
                case 2:
                        setImagen("/images/ahorcado 3.png");
                        break;
                case 1:
                        setImagen("/images/ahorcado 4.png");
                        break;
                case 0:
                        setImagen("/images/ahorcado 5.png");
                        break;
    
                
            } 
        }
        return encontrado;//agregar imagen
    }
    public boolean juegoGanado(){
        boolean ganador=true;
        for(int i=0;i<getPalabraAdivinar().length();i++){
            if(getPalabraAdivinar().charAt(i)!=getPalabraAhorcado()[i]){
                ganador=false;
            }
        }
        return ganador;
    }

    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
