/**
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.io.IOException;
import java.util.Iterator;


public class IteratorLibrosVista {
    IteratorLibros biblioteca;
    
    public IteratorLibrosVista(IteratorLibros biblioteca){
        this.biblioteca = biblioteca;
    }
    /**
     * Imprime los libros de la biblioteca solo el titulo y la carrera  .
     */
    public void mostrarApendice(){
        Iterator<Libro> iteratorList = biblioteca.libros.iterator();
            System.out.println("\n ****************Libros Disponibles **************** : \n");
            while(iteratorList.hasNext()) {
                Libro value = iteratorList.next();
                System.out.println(value.getNombre()+"\nCarrera : "+value.getCarrera()+"\n");
            }

    }
    /**
     * Imprime los libros de la biblioteca incluye el contenido .
     */    
    public void mostrarLibros(){
        Iterator<Libro> iteratorList = biblioteca.libros.iterator();
            System.out.println("\n ****************Libros Disponibles **************** : \n");
            while(iteratorList.hasNext()) {
                Libro value = iteratorList.next();
                System.out.println(value);
            }
    }

    /**
     * Imprime los libros de la carrera "Matematicas".
     *
     * @param a La biblioteca desde donde se obtienen los libros.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Imprime los libros de la carrera "Matematicas".
    public void mostrasLibrosMate(Biblioteca a) throws IOException{
         System.out.println(biblioteca.getLibroMatematicas(a));
    }   

    /**
     * Imprime los libros de la carrera "Biologia".
     *
     * @param a La biblioteca desde donde se obtienen los libros.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
     // Imprime los libros de la carrera "Biologia".
    public void mostrasLibrosBiologia(Biblioteca a) throws IOException{
        System.out.println(biblioteca.getLibroBiologia(a));
    }
    
    /**
     * Imprime los libros de la carrera "Ciencias de la computacion".
     *
     * @param a La biblioteca desde donde se obtienen los libros.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Imprime los libros de la carrera "Ciencias de la computacion".
    public void mostrasLibrosCC(Biblioteca a) throws IOException{
        System.out.println(biblioteca.getLibroCC(a));
    } 

    /**
     * Imprime los libros de la carrera "Actuaria".
     *
     * @param a La biblioteca desde donde se obtienen los libros.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Imprime los libros de la carrera "Actuaria".
    public void mostrasLibrosActuaria(Biblioteca a) throws IOException{
    System.out.println(biblioteca.getLibroActuaria(a));
    }
    
    /**
     * Imprime los libros de la carrera "Fisica".
     *
     * @param a La biblioteca desde donde se obtienen los libros.
     * @throws IOException Si ocurre un error de lectura o escritura durante la operación.
     */
    // Imprime los libros de la carrera "Fisica".
    public void mostrasLibrosFisica(Biblioteca a) throws IOException{
        System.out.println(biblioteca.getLibroFisica(a));
    }      
      
}
