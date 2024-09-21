/**
 * Esta interfaz define la estructura para un observador.
 * Un observador es notificado cuando ocurre un evento en el sujeto observado.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
 */
interface Observer {
    /**
     * Este método se ejecuta cuando se recibe una actualización del sujeto observado.
     * 
     * @param mensaje El mensaje de actualización recibido del sujeto observado.
     */
    void actualizar(String mensaje);
}
