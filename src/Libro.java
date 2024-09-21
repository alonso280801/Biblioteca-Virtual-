/**
 * Clase que representa un libro.
 * 
 * <p>Esta clase contiene los atributos nombre, contenido y carrera, que representan
 * el nombre del libro, su contenido y la carrera a la que pertenece, respectivamente.
 * 
 * <p>Se proporcionan constructores para crear objetos Libro con los valores deseados
 * para los atributos. Además, se implementan métodos para acceder a los atributos y
 * para obtener una representación en cadena del libro.
 * 
 * <p>Nota: La clase asume que el atributo contenido representa el contenido completo
 * del libro, y que el atributo carrera indica la carrera a la que pertenece el libro.
 * 
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/

public class Libro {
    private String nombre;
    private String contenido;
    private String carrera;
    
    /**
     * Crea un objeto Libro con el nombre, contenido y carrera especificados.
     * 
     * @param nombre el nombre del libro.
     * @param contenido el contenido del libro.
     * @param carrera la carrera a la que pertenece el libro.
    */
    public Libro(String nombre, String contenido, String carrera) {
        // El constructor toma el nombre, contenido y carrera del libro como parámetros y los
        // asigna a las variables de instancia correspondientes. Además, inicializa la variable
        // comentario en una cadena vacía.
        this.nombre = nombre;
        this.contenido = contenido;
        this.carrera = carrera;
    }

    /**
     * Crea un objeto Libro con valores predeterminados para los atributos.
     * 
     * <p>El constructor sin parámetros se utiliza para indicar que no se encontró
     * un libro con el nombre buscado.
     */
    public Libro() {
        this.nombre = "No existe ese libro intenta de nuevo";
        this.contenido = "";
        this.carrera = "";
    }
    
    /**
     * Devuelve el nombre del libro.
     * 
     * @return el nombre del libro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el contenido del libro.
     * 
     * @return el contenido del libro.
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Devuelve la carrera a la que pertenece el libro.
     * 
     * @return la carrera del libro.
     */
    public String getCarrera() {
        return carrera;
    }
    
    /**
     * Devuelve una representación en cadena del libro.
     * 
     * <p>Si la carrera del libro no está especificada, se devuelve la cadena
     * "No existe ese libro buscado, intenta de nuevo".
     * 
     * @return una representación en cadena del libro.
     */
    @Override
    // El método toString() devuelve una cadena que representa el libro y su comentario,
    // si existe. Si la variable comentario no está vacía, se agrega a la cadena de retorno
    // antes del carácter de nueva línea. En caso contrario, solo se devuelve la representación
    // del libro sin comentario.
    public String toString() {
        String opcion1 ="";
        if (carrera.equals("")){
           return opcion1 = "No existe ese libro buscado intenta de nuevo";
        }
        
        opcion1 = "Libro{" + "nombre='" + nombre + '\'' + ", contenido='" + contenido + '\'' + ", carrera='" + carrera + '\'' +'}';
        return opcion1;
    }
}