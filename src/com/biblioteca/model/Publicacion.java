package com.biblioteca.model;

public abstract class Publicacion {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public Publicacion(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public abstract void mostrarInformacion();
} 