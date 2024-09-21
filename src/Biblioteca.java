/**
 * La clase Biblioteca representa una biblioteca que almacena y proporciona acceso a una colección de libros.
 * Permite obtener listas de libros según la carrera asociada.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
    /**
     * Obtiene una lista de todos los libros disponibles en la biblioteca.
     * 
     * @return Una lista de libros completos.
     * @throws IOException Si ocurre un error al leer los libros.
     */
    public List<Libro> librosCompletos() throws IOException {
	//Modificar la ruta de la carpeta con la ruta donde tengas la carpeta Base de datos
        String rutaCarpeta = "D:\\Usuario\\Desktop\\Archivos-Resumenes\\Modelado y Programacion\\Proyecto 2\\Base de datos";
        List<Libro> libros = CreadorLibros.crearLibros(rutaCarpeta);
        return libros;
    }

    /**
     * Obtiene una lista de libros de la carrera de Actuaria.
     * 
     * @return Una lista de libros de Actuaria.
     * @throws IOException Si ocurre un error al leer los libros.
     */
    public List<Libro> librosAct() throws IOException {
        List<Libro> libros = librosCompletos(); // Llama al método librosCompletos para obtener la lista de libros
        List<Libro> librosAct = new ArrayList<>(); // Crea una lista vacía para almacenar los libros de la carrera de Actuaria
        for (Libro libro : libros) {
            if (libro.getCarrera().equals("Actuaria")) { // Verifica si el libro pertenece a la carrera de Actuaria
                librosAct.add(libro); // Agrega el libro a la lista de libros de la carrera de Actuaria
            }
        }
        return librosAct; // Retorna la lista de libros de la carrera de Actuaria
    }

    /**
     * Obtiene una lista de libros de la carrera de Biología.
     * 
     * @return Una lista de libros de Biología.
     * @throws IOException Si ocurre un error al leer los libros.
     */
    public List<Libro> librosBio() throws IOException {
        List<Libro> libros = librosCompletos(); // Llama al método librosCompletos para obtener la lista de libros
        List<Libro> librosBio = new ArrayList<>(); // Crea una lista vacía para almacenar los libros de la carrera de biologia
        for (Libro libro : libros) {
            if (libro.getCarrera().equals("Biologia")) { // Verifica si el libro pertenece a la carrera de biologia
                librosBio.add(libro); // Agrega el libro a la lista de libros de la carrera de biologia
            }
        }
        return librosBio; // Retorna la lista de libros de la carrera de biologia   
    }

    /**
     * Obtiene una lista de libros de la carrera de Ciencias de la Computación.
     * 
     * @return Una lista de libros de Ciencias de la Computación.
     * @throws IOException Si ocurre un error al leer los libros.
     */
    public List<Libro> librosCC() throws IOException {
        List<Libro> libros = librosCompletos(); // Llama al método librosCompletos para obtener la lista de libros
        List<Libro> librosCC = new ArrayList<>(); // Crea una lista vacía para almacenar los libros de la carrera de Ciencias de la computacion
        for (Libro libro : libros) {
            if (libro.getCarrera().equals("Ciencias de la computacion")) { // Verifica si el libro pertenece a la carrera de Ciencias de la computacion
                librosCC.add(libro); // Agrega el libro a la lista de libros de la carrera de Ciencias de la computacion
            }
        }
        return librosCC; // Retorna la lista de libros de la carrera de Ciencias de la computacion
    }

    /**
     * Obtiene una lista de libros de la carrera de Física.
     * 
     * @return Una lista de libros de Física.
     * @throws IOException Si ocurre un error al leer los libros.
     */
    public List<Libro> librosFis() throws IOException {
        List<Libro> libros = librosCompletos(); // Llama al método librosCompletos para obtener la lista de libros
        List<Libro> librosFis = new ArrayList<>(); // Crea una lista vacía para almacenar los libros de la carrera de fisica
        for (Libro libro : libros) {
            if (libro.getCarrera().equals("Fisica")) { // Verifica si el libro pertenece a la carrera de fisica
                librosFis.add(libro); // Agrega el libro a la lista de libros de la carrera de fisica
            }
        }
        return librosFis; // Retorna la lista de libros de la carrera de fisica
    }

    /**
     * Obtiene una lista de libros de la carrera de Matemáticas.
     * 
     * @return Una lista de libros de Matemáticas.
     * @throws IOException Si ocurre un error al leer los libros.
     */
    public List<Libro> librosMate() throws IOException {
        List<Libro> libros = librosCompletos(); // Llama al método librosCompletos para obtener la lista de libros
        List<Libro> librosMate = new ArrayList<>(); // Crea una lista vacía para almacenar los libros de la carrera de matematicas
        for (Libro libro : libros) {
            if (libro.getCarrera().equals("Matematicas")) { // Verifica si el libro pertenece a la carrera de matematicas
                librosMate.add(libro); // Agrega el libro a la lista de libros de la carrera de matematicas
            }
        }
        return librosMate; // Retorna la lista de libros de la carrera de matematicas
    }
    
}