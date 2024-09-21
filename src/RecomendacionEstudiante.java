import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la funcionalidad de recomendación para un estudiante.
 * Permite asignar una carrera al estudiante y notificar a los observadores sobre la carrera asignada.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
 */
class RecomendacionEstudiante {
    private String carrera;
    private List<Observer> observador = new ArrayList<>();

    /**
     * Asigna la carrera al estudiante y notifica a los observadores.
     *
     * @param carrera la carrera asignada al estudiante
     * @throws IOException si ocurre un error al obtener la lista de libros relacionados con la carrera
     */
    public void asignarCarrera(String carrera) throws IOException {
        this.carrera = carrera;
        notifyObservers();
    }

    /**
     * Agrega un observador a la lista de observadores.
     *
     * @param observer el observador a agregar
     */
    public void addObserver(Observer observer) {
        observador.add(observer);
    }

    /**
     * Remueve un observador de la lista de observadores.
     *
     * @param observer el observador a remover
     */
    public void removeObserver(Observer observer) {
        observador.remove(observer);
    }

    /**
     * Notifica a todos los observadores sobre la carrera asignada.
     *
     * @throws IOException si ocurre un error al obtener el mensaje de recomendación
     */
    private void notifyObservers() throws IOException {
        for (Observer observer : observador) {
            observer.actualizar(getMensaje());
        }
    }

    /**
     * Obtiene el mensaje de recomendación según la carrera asignada.
     *
     * @return el mensaje de recomendación de libros relacionados con la carrera
     * @throws IOException si ocurre un error al obtener la lista de libros relacionados con la carrera
     */
    private String getMensaje() throws IOException {
        Biblioteca lista = new Biblioteca();
        IteratorLibros a = new IteratorLibros(lista);
        switch (carrera) {
            case "Actuaria":
                return "Los libros recomendados para la carrera de Actuaria son:\n" + a.getLibroActuaria(lista);
            case "Biologia":
                return "Los libros recomendados para la carrera de Biología son:\n" + a.getLibroBiologia(lista);
            case "Ciencias de la computacion":
                return "Los libros recomendados para la carrera de Ciencias de la Computación son:\n" + a.getLibroCC(lista);
            case "Fisica":
                return "Los libros recomendados para la carrera de Física son:\n" + a.getLibroFisica(lista);
            case "Matematicas":
                return "Los libros recomendados para la carrera de Matemáticas son:\n" + a.getLibroMatematicas(lista);
            default:
                return "Carrera no encontrada";
        }
    }
}
