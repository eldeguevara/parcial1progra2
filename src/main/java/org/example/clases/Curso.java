package org.example.clases;

import java.util.Random;

public class Curso {

    private int id;
    private String titulo;
    private int numMaxAlumnos;
    private int creditos;
    private Catedratico catedratico;
    private int alumnosAsignados;

    public Curso (String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico, int alumnosAsignados) {
        this.id = new Random().nextInt(100);
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosAsignados = alumnosAsignados;
    }

    //verificar espacioo
    public boolean verificarEspacio(){

        if (numMaxAlumnos <= alumnosAsignados){

            return  true;

        }

        return  false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(int numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public int getAlumnosAsignados() {
        return alumnosAsignados;
    }

    public void setAlumnosAsignados(int alumnosAsignados) {
        this.alumnosAsignados = alumnosAsignados;
    }
}
