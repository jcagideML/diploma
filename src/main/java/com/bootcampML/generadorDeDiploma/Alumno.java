package com.bootcampML.generadorDeDiploma;

import java.util.Map;

public class Alumno {

    private String nombre;
    private Map<String, Integer> materias;

    public Alumno(String nombre, Map<String, Integer> materias) {
        setNombre(nombre);
        setMaterias(materias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Integer> getMaterias() {
        return materias;
    }

    public void setMaterias(Map<String, Integer> materias) {
        this.materias = materias;
    }
}
