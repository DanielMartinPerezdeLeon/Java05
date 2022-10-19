package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Jugador {

    private int codigoJug;
    private String nombre;
    private String apellido;
    private float beneficioTotal;
    private String contraseña;

    public Jugador(int codigoJug, String nombre, String apellido, float beneficioTotal, String contraseña) {
        this.codigoJug = codigoJug; 
        this.nombre = nombre;
        this.apellido = apellido;
        this.beneficioTotal = beneficioTotal;
        this.contraseña = contraseña;
    }

    //CodigoJug
    public int getCodigoJug() {
        return codigoJug;
    }

    public void setCodigoJug(int codigoJug) {
        this.codigoJug = codigoJug;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //BeneficioTotal
    public float getBeneficioTotal() {
        return beneficioTotal;
    }

    public void setBeneficioTotal(float beneficioTotal) {
        this.beneficioTotal = beneficioTotal;
    }

    //Contraseña
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}