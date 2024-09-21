/**
 * La clase IteratorLibros permite iterar y buscar libros en una biblioteca.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.util.List;
import java.util.Iterator;
import java.io.IOException;

public class IteratorLibros {
    List<Libro> libros;

    /**
     * Constructor de la clase IteratorLibros que recibe un objeto Biblioteca y obtiene la lista de libros completos.
     *
     * @param libreria El objeto Biblioteca que contiene la lista de libros.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un constructor para la clase IteratorLibros que recibe como parámetro un objeto Biblioteca.
    public IteratorLibros(Biblioteca libreria)throws IOException {
        this.libros = libreria.librosCompletos();
    }
   
    /**
     * Obtiene la lista de libros.
     *
     * @return La lista de libros.
     */
    // Define un método getLibros que devuelve la lista de libros.
    public List<Libro> getLibros() {

       return libros;
    }

    /**
     * Establece la lista de libros.
     *
     * @param libros La nueva lista de libros.
     */
    // Define un método setLibros que establece la lista de libros.
    public void setLibros(List<Libro> libros) {
       this.libros = libros;
    }

    /**
     * Obtiene la lista de libros de la carrera "Ciencias de la computacion".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return La lista de libros de la carrera "Ciencias de la computacion".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibrosCC que devuelve la lista de libros de la carrera "Ciencias de la computacion".
    public List<Libro> getLibrosCC(Biblioteca lib)throws IOException  {
    libros = lib.librosCC();
    return libros; }

    /**
     * Obtiene la lista de libros de la carrera "Matematicas".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return La lista de libros de la carrera "Matematicas".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibrosMatematicas que devuelve la lista de libros de la carrera "Matematicas".
    public List<Libro> getLibrosMatematicas(Biblioteca lib)throws IOException  {
        libros = lib.librosMate();
        return libros;
    }
    
    /**
     * Obtiene la lista de libros de la carrera "Actuaria".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return La lista de libros de la carrera "Actuaria".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibrosActuaria que devuelve la lista de libros de la carrera "Actuaria".
    public List<Libro> getLibrosActuaria(Biblioteca lib)throws IOException  {
    libros = lib.librosAct();
    return libros;
    }

    /**
     * Obtiene la lista de libros de la carrera "Fisica".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return La lista de libros de la carrera "Fisica".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibrosFisica que devuelve la lista de libros de la carrera "Fisica".
    public List<Libro> getLibrosFisica(Biblioteca lib)throws IOException  {
        libros = lib.librosFis();
        return libros;
    }

    /**
     * Obtiene la lista de libros de la carrera "Biologia".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return La lista de libros de la carrera "Biologia".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibrosBiologia que devuelve la lista de libros de la carrera "Biologia".
    public List<Libro> getLibrosBiologia(Biblioteca lib)throws IOException  {
        libros = lib.librosBio();
        return libros;
    }

    /**
     * Obtiene una cadena con los nombres de los libros de la carrera "Biologia".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return Una cadena con los nombres de los libros de la carrera "Biologia".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibroBiologia que devuelve una cadena con los nombres de los libros de la carrera "Biologia".
    public String getLibroBiologia(Biblioteca lib)throws IOException {
        String aux = "";
        libros = lib.librosBio();
        Iterator<Libro> iterator = libros.iterator();
        while(iterator.hasNext()) {
            Libro value = iterator.next();
            if(value.getCarrera().equals("Biologia")) {
                aux += value.getNombre()+"\n";
            }
        }
        return aux;
    }

    /**
     * Obtiene una cadena con los nombres de los libros de la carrera "Fisica".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return Una cadena con los nombres de los libros de la carrera "Fisica".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibroFisica que devuelve una cadena con los nombres de los libros de la carrera "Fisica".
    public String getLibroFisica(Biblioteca lib)throws IOException {
        String aux = "";
        libros = lib.librosFis();
        Iterator<Libro> iterator = libros.iterator();
        while(iterator.hasNext()) {
            Libro value = iterator.next();
            if(value.getCarrera().equals("Fisica")) {
                aux += value.getNombre()+"\n";
            }
        }
        return aux;
    }

    /**
     * Obtiene una cadena con los nombres de los libros de la carrera "Matematicas".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return Una cadena con los nombres de los libros de la carrera "Matematicas".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibro Matematicas que devuelve una cadena con los nombres de los libros de la carrera "Matematicas".
    public String getLibroMatematicas(Biblioteca lib)throws IOException {
        String aux = "";
        libros = lib.librosMate();
        Iterator<Libro> iterator = libros.iterator();
        while(iterator.hasNext()) {
            Libro value = iterator.next();
            if(value.getCarrera().equals("Matematicas")) {
                aux += value.getNombre()+"\n";
            }
        }
        return aux;
    }

     /**
     * Obtiene una cadena con los nombres de los libros de la carrera "Actuaria".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return Una cadena con los nombres de los libros de la carrera "Actuaria".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibroActuaria que devuelve una cadena con los nombres de los libros de la carrera "Actuaria".
    public String getLibroActuaria(Biblioteca lib)throws IOException {
        String aux = "";
        libros = lib.librosAct();
        Iterator<Libro> iterator = libros.iterator();
        while(iterator.hasNext()) {
            Libro value = iterator.next();
            if(value.getCarrera().equals("Actuaria")) {
                aux += value.getNombre()+"\n";
            }
        }
        return aux;
    }

    /**
     * Obtiene una cadena con los nombres de los libros de la carrera "Ciencias de la computacion".
     *
     * @param lib La biblioteca de donde se obtienen los libros.
     * @return Una cadena con los nombres de los libros de la carrera "Ciencias de la computacion".
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método getLibroCC que devuelve una cadena con los nombres de los libros de la carrera "Ciencias de la computacion".
    public String getLibroCC(Biblioteca lib)throws IOException {
        String aux = "";
        libros = lib.librosCC();
        Iterator<Libro> iterator = libros.iterator();
        while(iterator.hasNext()) {
            Libro value = iterator.next();
            if(value.getCarrera().equals("Ciencias de la computacion")) {
                aux += value.getNombre()+"\n";
            }
        }
        return aux;
    }

    /**
     * Busca un libro por su título en la biblioteca y devuelve el libro encontrado.
     *
     * @param lib    La biblioteca en la que se realiza la búsqueda.
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado o un objeto Libro vacío si no se encuentra.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Define un método buscarLibro que busca un libro por su título en la biblioteca y devuelve el libro encontrado.
    public Libro buscarLibro(Biblioteca lib,String titulo)throws IOException { 
        libros = lib.librosCompletos();
        Iterator<Libro> iterator = libros.iterator();
        while(iterator.hasNext()) {
            Libro value = iterator.next();
            if(value.getNombre().equals(titulo)) {
                return value;
            }
        }
        Libro vacio = new Libro();
        return  vacio ;
    }


}
