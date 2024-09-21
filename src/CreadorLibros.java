/**
 * La clase CreadorLibros se encarga de crear una lista de objetos Libro a partir de los archivos de texto ubicados en una carpeta especificada.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreadorLibros {

    /**
     * Crea una lista de objetos Libro a partir de los archivos de texto en la carpeta especificada.
     * 
     * @param rutaCarpeta La ruta de la carpeta que contiene los archivos de texto.
     * @return Una lista de objetos Libro creados a partir de los archivos de texto.
     * @throws IOException Si ocurre un error al leer los archivos de texto.
     */
    // Define un método estático llamado crearLibros que recibe como parámetro una cadena que representa la ruta de una carpeta y devuelve una lista de objetos Libro. Puede lanzar una excepción de tipo IOException.
    public static List<Libro> crearLibros(String rutaCarpeta) throws IOException {
        // Crea un objeto de tipo File que representa la carpeta especificada en la ruta.
        File carpeta = new File(rutaCarpeta);
        // Obtiene un array de objetos File que representa los archivos contenidos en la carpeta.
        File[] archivos = carpeta.listFiles();
        // Crea una lista de objetos Libro vacía.
        List<Libro> libros = new ArrayList<>();
        // Recorre cada archivo en el array de archivos.
        for (File archivo : archivos) {
            // Verifica si el archivo es un archivo regular y si su nombre termina con la extensión ".txt".
            if (archivo.isFile() && archivo.getName().endsWith(".txt")) {
                // Agrega a la lista de libros el resultado de leer el archivo de texto utilizando el método estático leerArchivo de la clase LectorArchivosTxt.
                libros.add(LectorArchivosTxt.leerArchivo(archivo.getAbsolutePath()));
            }
        }
        // Devuelve la lista de libros creada.
     return libros;
    }
}
