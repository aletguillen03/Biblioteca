# Sistema de Gestión de Biblioteca

Este es un sistema simple de gestión de biblioteca implementado en Java que demuestra el uso de interfaces, clases abstractas, herencia y encapsulamiento.

## Estructura del Proyecto

```
biblioteca/
├── src/
│   └── com/
│       └── biblioteca/
│           ├── interfaces/
│           │   └── Prestable.java
│           ├── model/
│           │   ├── Publicacion.java
│           │   └── Libro.java
│           └── BibliotecaApp.java
```

## Componentes

- **Prestable**: Interfaz que define los métodos para prestar y devolver elementos.
- **Publicacion**: Clase abstracta que representa una publicación con atributos comunes.
- **Libro**: Clase concreta que hereda de Publicacion e implementa Prestable.
- **BibliotecaApp**: Clase principal que demuestra el funcionamiento del sistema.

## Cómo Compilar y Ejecutar

1. Navega al directorio del proyecto:
   ```bash
   cd /Users/alejoguillen/Proyectos/biblioteca
   ```

2. Compila el proyecto:
   ```bash
   javac -d bin src/com/biblioteca/*.java src/com/biblioteca/interfaces/*.java src/com/biblioteca/model/*.java
   ```

3. Ejecuta la aplicación:
   ```bash
   java -cp bin com.biblioteca.BibliotecaApp
   ```

## Características

- Gestión de libros con información detallada
- Sistema de préstamo y devolución
- Control de estado de disponibilidad
- Interfaz de usuario por consola 