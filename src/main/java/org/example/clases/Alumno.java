package org.example.clases;

import java.util.Random;

public class Alumno {

    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;

    public Alumno(String nombre, String direccion, String telefono, String edad) {
        this.carnet = new Random().nextInt(100);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    //imprimir datos
    public void imprimirAlumno(){
        System.out.println("Carnet: " + getCarnet());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Edad: " + getEdad());
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
