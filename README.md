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

## Requisitos Previos

- Java Development Kit (JDK) 8 o superior
- Git instalado en tu sistema

## Cómo Clonar y Ejecutar el Proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/aletguillen03/Biblioteca.git
   cd Biblioteca
   ```

2. Crea el directorio para los archivos compilados:
   ```bash
   mkdir bin
   ```

3. Compila el proyecto:
   ```bash
   javac -d bin src/com/biblioteca/*.java src/com/biblioteca/interfaces/*.java src/com/biblioteca/model/*.java
   ```

4. Ejecuta la aplicación:
   ```bash
   java -cp bin com.biblioteca.BibliotecaApp
   ```

## Ejemplo de Salida

Al ejecutar la aplicación, verás algo similar a esto:

```
=== Estado inicial de los libros ===

Información del Libro:
Título: El Quijote
Autor: Miguel de Cervantes
Año de Publicación: 1605
Género: Novela
Estado: Disponible

[... más libros ...]

=== Operaciones de préstamo ===
El libro 'El Quijote' ha sido prestado.
El libro 'El Quijote' ya está prestado.
El libro 'El Quijote' ha sido devuelto.
El libro 'El Quijote' no estaba prestado.

=== Estado final de los libros ===
[... información de los libros ...]
```

## Características

- Gestión de libros con información detallada
- Sistema de préstamo y devolución
- Control de estado de disponibilidad
- Interfaz de usuario por consola

## Contribuir

Si deseas contribuir al proyecto:

1. Haz un Fork del repositorio
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Haz commit de tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles. 