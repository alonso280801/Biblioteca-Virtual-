/**
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
public class ComentarioDecorator extends Libro {
    // Declara una variable privada de tipo Libro llamada "libro".
    private Libro libro;
    // Declara una variable privada de tipo String llamada "comentario".
    private String comentario;

    /**
     * Crea un objeto ComentarioDecorator que envuelve a un libro y agrega un comentario.
     * 
     * @param libro El libro a decorar.
     * @param comentario El comentario a agregar.
     */
    // Define un constructor para la clase ComentarioDecorator que recibe como parámetros un objeto de tipo Libro y un String.
    public ComentarioDecorator(Libro libro, String comentario) {
        this.libro = libro;
        this.comentario = comentario;
    }
    
    /**
     * Obtiene el nombre del libro decorado.
     * 
     * @return El nombre del libro.
     */
    // Anula el método getNombre de la clase Libro para que devuelva el nombre del libro.
    @Override
    public String getNombre() {
        return libro.getNombre();
    }

    /**
     * Obtiene el contenido del libro decorado.
     * 
     * @return El contenido del libro.
     */
    // Anula el método getContenido de la clase Libro para que devuelva el contenido del libro.
    @Override
    public String getContenido() {
        return libro.getContenido();
    }
    
    /**
     * Obtiene la carrera del libro decorado.
     * 
     * @return La carrera del libro.
     */
    // Anula el método getCarrera de la clase Libro para que devuelva la carrera del libro.
    @Override
    public String getCarrera() {
        return libro.getCarrera();
    }

    /**
     * Devuelve una cadena que representa el objeto ComentarioDecorator y el último comentario agregado.
     * 
     * @return Una cadena que representa el objeto ComentarioDecorator.
     */
    // Anula el método toString de la clase Object para que devuelva una cadena que representa el objeto ComentarioDecorator y el último comentario agregado.
    @Override
    public String toString() {
        return libro.toString() + "\nUltimo comentario agregado: " + comentario;
    }
}