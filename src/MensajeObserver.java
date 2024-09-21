/**
 * Esta clase representa un observador de mensajes.
 * Implementa la interfaz Observer y proporciona la funcionalidad
 * para recibir y mostrar mensajes de recomendación de libros.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
 */
class MensajeObserver implements Observer {
    private String nombre;
    
    /**
     * Crea una instancia de la clase MensajeObserver sin nombre.
     * El nombre se puede establecer posteriormente usando el método setnombre().
     */
    public MensajeObserver() {
    }

    /**
     * Crea una instancia de la clase MensajeObserver con un nombre específico.
     * 
     * @param nombre El nombre del observador de mensajes.
     */
    public MensajeObserver(String nombre) {   
        this.nombre = nombre;
    }

    /**
     * Método de la interfaz Observer que se ejecuta cuando se recibe una actualización.
     * Muestra un mensaje de recomendación de libros en la consola, basado en el mensaje recibido.
     * 
     * @param mensaje El mensaje de recomendación de libros recibido.
     */
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Los libros que te recomiendo para la materia de " + mensaje);
    }
}
