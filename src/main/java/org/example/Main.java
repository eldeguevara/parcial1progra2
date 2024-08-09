package org.example;

import org.example.clases.Alumno;
import org.example.clases.Asignacion;
import org.example.clases.Catedratico;
import org.example.clases.Curso;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Diego Guevara", "calle 13, zona 2, Guatemala", "5454-4565", "19");

        Alumno alumno2 = new Alumno("Pablo Morales", "calle 18, zona 1, Guatemala", "8767-9876", "20");

        Alumno alumno3 = new Alumno("Juan Pablo", "calle 19, zona 0, Guatemala", "7887-2323", "18");

        Catedratico catedratico1 = new Catedratico("Luis fuentes", "av 23, calle 4, Guatemala", "5756-7654", "Ingeniero en Sistemas");

        Catedratico catedratico2 = new Catedratico("Jovana Maria", "av 8, calle 2, Guatemala", "9879-8776", "Administradora de empresas");

        Catedratico catedratico3 = new Catedratico("Luis fuentes", "av 8, calle 6, Guatemala", "9879-9879", "Abogada");

        Curso matematica = new Curso("matematica", 3, 543, catedratico1, 2);
        Curso computacion = new Curso("computacion", 2, 87, catedratico2, 4);
        Curso sociales = new Curso("sociales", 1, 67, catedratico3, 4);

        List<Alumno> listaDeAlumnos = new ArrayList<>();
        listaDeAlumnos.add(alumno1);
        listaDeAlumnos.add(alumno2);
        listaDeAlumnos.add(alumno3);

        List<Alumno> listaDeAlumnos2 = new ArrayList<>();
        listaDeAlumnos2.add(alumno1);
        listaDeAlumnos2.add(alumno2);

        List<Alumno> listaDeAlumnos3 = new ArrayList<>();
        listaDeAlumnos3.add(alumno3);
        listaDeAlumnos3.add(alumno2);

        Asignacion asignacion = new Asignacion( listaDeAlumnos, matematica );
        Asignacion asignacion2 = new Asignacion( listaDeAlumnos2, computacion );
        Asignacion asignacion3 = new Asignacion( listaDeAlumnos3, sociales );


        asignacion.verAsiganaciones();
        System.out.println("---------------------------------");
        asignacion2.verAsiganaciones();
        System.out.println("---------------------------------");
        asignacion3.verAsiganaciones();

    }
}