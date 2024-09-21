/**
 * Esta clase representa el controlador del menú de la aplicación.
 * Administra la interacción entre la biblioteca, el iterador de libros,
 * el sistema de recomendación, la vista del menú y las acciones del usuario.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
 */
import java.io.IOException;

public class MenuControlador {
    private Biblioteca biblioteca;
    private IteratorLibros iterator;
    private RecomendacionEstudiante recomendacion;
    private MenuVista vista;
    private String carrera;
    Observer observer1 = new MensajeObserver();
    int observer = 0;
    
    /**
     * Crea una instancia de la clase MenuControlador.
     * Inicializa los objetos de la biblioteca, el iterador de libros,
     * el sistema de recomendación y la vista del menú.
     * También establece la carrera en una cadena vacía.
     * 
     * @throws IOException Si ocurre un error al inicializar la biblioteca.
     */
    public MenuControlador() throws IOException {
        biblioteca = new Biblioteca();
        iterator = new IteratorLibros(biblioteca);
        recomendacion = new RecomendacionEstudiante();
        vista = new MenuVista();
        carrera = "";
    }

    /**
     * Método para iniciar sesión.
     * Solicita al usuario que inicie sesión y devuelve la carrera seleccionada.
     * 
     * @return La carrera seleccionada por el usuario.
     * @throws IOException Si ocurre un error durante el inicio de sesión.
     */
    public String iniciarSesion() throws IOException {
        InicioSesion nuevo = new InicioSesion();
        carrera = nuevo.iniciarSesion();
        return carrera;
    }

    /**
     * Método para dejar una reseña en un libro.
     * Verifica si el libro existe y muestra una confirmación al usuario.
     * Si el usuario confirma, solicita ingresar un comentario y muestra el libro con la reseña agregada.
     * 
     * @param libro El libro al que se desea dejar una reseña.
     * @throws IOException Si ocurre un error al dejar la reseña.
     */
    public void reseniar(Libro libro) throws IOException {
        if (!libro.getNombre().equals("No existe ese libro intenta de nuevo") && libro != null && vista.confirmarAccion("¿Deseas reseniar este libro?")) {
            String comentario = vista.ingresarComentario();
            Libro libroConComentario = new ComentarioDecorator(libro, comentario);
            vista.mostrarLibro(libroConComentario);
        }
    }

    /**
     * Método para ver la lista de libros disponibles.
     * Muestra un apéndice de los libros disponibles y ofrece la opción de buscar un libro específico.
     * Si se encuentra el libro, se muestra en la vista y se puede dejar una reseña.
     * 
     * @throws IOException Si ocurre un error al ver los libros disponibles.
     */
    public void verLibrosDisponibles() throws IOException {
        IteratorLibrosVista imprimirLibros = new IteratorLibrosVista(iterator);
        imprimirLibros.mostrarApendice();

        if (vista.confirmarAccion("¿Deseas leer alguno de estos libros?")) {
            String nombreLibro = vista.ingresarNombreLibro();
            Libro libro = iterator.buscarLibro(biblioteca, nombreLibro);
            vista.mostrarLibro(libro);
            reseniar(libro);
        }
    }

    /**
     * Método para buscar un libro por su nombre.
     * Solicita al usuario ingresar el nombre del libro y muestra el libro encontrado en la vista.
     * También ofrece la opción de dejar una reseña en el libro.
     * 
     * @throws IOException Si ocurre un error al buscar el libro.
     */
    public void buscarLibroPorNombre() throws IOException {
        String nombreLibro = vista.ingresarNombreLibro();
        Libro libro = iterator.buscarLibro(biblioteca, nombreLibro);
        vista.mostrarLibro(libro);
        reseniar(libro);
    }

    /**
     * Método para mostrar los libros recomendados.
     * Si el sistema de recomendación aún no tiene un observador, se agrega uno.
     * Asigna la carrera actual al sistema de recomendación.
     * Muestra los libros recomendados y ofrece la opción de buscar y dejar una reseña en un libro específico.
     * 
     * @throws IOException Si ocurre un error al mostrar los libros recomendados.
     */
    public void librosRecomendados() throws IOException {
        if (observer == 0) {
            recomendacion.addObserver(observer1);
            observer = 1;
        }
        recomendacion.asignarCarrera(carrera);

        if (vista.confirmarAccion("¿Deseas leer alguno de estos libros?")) {
            String nombreLibro = vista.ingresarNombreLibro();
            Libro libro = iterator.buscarLibro(biblioteca, nombreLibro);
            vista.mostrarLibro(libro);
            reseniar(libro);
        }
    }
}