package org.example.clases;

import java.util.Random;

public class Catedratico {

    private int codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = new Random().nextInt(100);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    //metodo para ver al catedratico
    public void imprimirCatedratico(){
        System.out.println("Codigo: " + getCodigoCatedratico());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Profesion: " + getProfesion());
    }

    public int getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(int codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
