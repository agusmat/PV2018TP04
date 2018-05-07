/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Agustin
 */
public class Calculadora implements Serializable {

    public Calculadora() {
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public double dividir(int a, int b) {
        return a / b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
