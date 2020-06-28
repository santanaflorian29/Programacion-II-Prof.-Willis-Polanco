package com.example.actividad1semana3;

public class Estudiantes {

    private String nombre;
    private  int foto;

    public Estudiantes()
    {


    }
    //constructor principal
    public Estudiantes(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
