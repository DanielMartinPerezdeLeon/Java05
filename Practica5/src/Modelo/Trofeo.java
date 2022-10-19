package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.GregorianCalendar;

/**
 *
 * @author carlo
 */
public class Trofeo {

    private int codigoTrof;
    private String nombre;
    private float importe;
    private int jugadorCodigo; /*FK codigo(Jugador)*/
    private GregorianCalendar fechaPartido;

    public Trofeo(int codigoTrof, String nombre, float importe, int jugadorCodigo, GregorianCalendar fechaPartido) {
        this.codigoTrof = codigoTrof;
        this.nombre = nombre;
        this.importe = importe;
        this.jugadorCodigo = jugadorCodigo;
        this.fechaPartido = fechaPartido;
    }

    //CodigoTrof
    public int getCodigoTrof() {
        return codigoTrof;
    }

    public void setCodigoTrof(int codigoTrof) {
        this.codigoTrof = codigoTrof;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Importe
    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    //JugadorCodigo
    public int getJugadorCodigo() {
        return jugadorCodigo;
    }

    public void setJugadorCodigo(int jugadorCodigo) {
        this.jugadorCodigo = jugadorCodigo;
    }

    //FechaPartido
    public GregorianCalendar getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(GregorianCalendar fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

}