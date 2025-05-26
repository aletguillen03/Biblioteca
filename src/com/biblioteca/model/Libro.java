package com.biblioteca.model;

import com.biblioteca.interfaces.Prestable;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;
    private String genero;

    public Libro(String titulo, String autor, int anioPublicacion, String genero) {
        super(titulo, autor, anioPublicacion);
        this.genero = genero;
        this.prestado = false;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformación del Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Género: " + genero);
        System.out.println("Estado: " + (prestado ? "Prestado" : "Disponible"));
    }
} 