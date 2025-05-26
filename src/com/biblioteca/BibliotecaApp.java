package com.biblioteca;

import com.biblioteca.model.Libro;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Crear tres libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        Libro libro3 = new Libro("1984", "George Orwell", 1949, "Ciencia ficción");

        // Mostrar información inicial de todos los libros
        System.out.println("=== Estado inicial de los libros ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();

        // Prestar y devolver un libro
        System.out.println("\n=== Operaciones de préstamo ===");
        libro1.prestar();
        libro1.prestar(); // Intentar prestar el mismo libro
        libro1.devolver();
        libro1.devolver(); // Intentar devolver el mismo libro

        // Mostrar estado final
        System.out.println("\n=== Estado final de los libros ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
    }
} 