package com.bootcampML.generadorDeDiploma;

public class DiplomaDTO {

    private String nombre;
    private Integer promedio;
    private String mensaje;
    private String felicitacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPromedio() {
        return promedio;
    }

    public void setPromedio(Integer promedio) {
        this.promedio = promedio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFelicitacion() {
        return felicitacion;
    }

    public void setFelicitacion(String felicitacion) {
        this.felicitacion = felicitacion;
    }
}
