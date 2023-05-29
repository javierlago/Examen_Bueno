/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import Prestamos.Prestamos;

import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
public class LibrosOcio extends Libros{
    private ArrayList <Prestamos> p;

    public LibrosOcio() {
    }

    public LibrosOcio(ArrayList<Prestamos> p) {
        this.p = p;
    }

    public LibrosOcio(ArrayList<Prestamos> p, String ref, String titulo, float precio, boolean estado) {
        super(ref, titulo, precio, estado);
        this.p = p;
    }

    public LibrosOcio(String ref, String titulo, float precio, boolean estado) {
        super(ref, titulo, precio, estado);
    }

    
    public ArrayList <Prestamos> getP() {
        return p;
    }

    public void setP(ArrayList <Prestamos> p) {
        this.p = p;
    }


    public void anadirPrestamo(Prestamos prestamo){
        this.p.add(prestamo);
    }


}
