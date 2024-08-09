package org.example.clases;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {

    private List<Alumno> alumnos = new ArrayList<>();
    private Curso curso;

    public Asignacion(List<Alumno> alumnos, Curso curso) {
        this.alumnos = alumnos;
        this.curso = curso;
    }

    public void verAsiganaciones(){
        Catedratico catredratico = curso.getCatedratico();

        System.out.println("Curso: "+ curso.getId() + " " + curso.getTitulo());
        System.out.println("--Catedratico: " + catredratico.getCodigoCatedratico() + " " + catredratico.getNombre());
        for (Alumno alumno : alumnos) {
            System.out.println("------Alumno: "+ alumno.getCarnet() + " " + alumno.getNombre());
        }
        System.out.println("CUPO LLENO: " + curso.verificarEspacio());
    }

}
