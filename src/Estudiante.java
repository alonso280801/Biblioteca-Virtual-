/**
 * La clase Estudiante representa a un estudiante con sus atributos y métodos correspondientes.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
public class Estudiante implements InterfaceEstudiante {
    // Declara variables privadas de instancia para representar los atributos de un estudiante.
    private String usuario;
    private String contrasenia;
    private String nombre;
    private int noCuenta;
    private String carrera;

    /**
     * Crea un objeto de tipo Estudiante con los atributos especificados.
     * 
     * @param usuario El usuario del estudiante.
     * @param contrasenia La contraseña del estudiante.
     * @param nombre El nombre del estudiante.
     * @param noCuenta El número de cuenta del estudiante.
     * @param carrera La carrera del estudiante.
     */
    // Define un constructor para la clase Estudiante que recibe como parámetros el usuario, contraseña, nombre, número de cuenta y carrera del estudiante.
    public Estudiante(String usuario, String contrasenia, String nombre, int noCuenta, String carrera) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.carrera = carrera;
    }
    
    /**
     * Obtiene el usuario del estudiante.
     * 
     * @return El usuario del estudiante.
     */
    // Implementa el método getUsuario de la interfaz InterfaceEstudiante para obtener el usuario del estudiante.
    @Override
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario del estudiante.
     * 
     * @param usuario El usuario del estudiante.
     */
    // Implementa el método setUsuario de la interfaz InterfaceEstudiante para establecer el usuario del estudiante.
    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del estudiante.
     * 
     * @return La contraseña del estudiante.
     */
    // Implementa el método getContrasenia de la interfaz InterfaceEstudiante para obtener la contraseña del estudiante.
    @Override
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña del estudiante.
     * 
     * @param contrasenia La contraseña del estudiante.
     */
    // Implementa el método setContrasenia de la interfaz InterfaceEstudiante para establecer la contraseña del estudiante.
    @Override
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */
    // Implementa el método getNombre de la interfaz InterfaceEstudiante para obtener el nombre del estudiante.
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * 
     * @param nombre El nombre del estudiante.
     */
    // Implementa el método setNombre de la interfaz InterfaceEstudiante para establecer el nombre del estudiante.
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta del estudiante.
     * 
     * @return El número de cuenta del estudiante.
     */
    // Implementa el método getNoCuenta de la interfaz InterfaceEstudiante para obtener el número de cuenta del estudiante.
    @Override
    public int getNoCuenta() {
        return noCuenta;
    }

    /**
     * Establece el número de cuenta del estudiante.
     * 
     * @param noCuenta El número de cuenta del estudiante.
     */
    // Implementa el método setNoCuenta de la interfaz InterfaceEstudiante para establecer el número de cuenta del estudiante.
    @Override
    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    /**
     * Obtiene la carrera del estudiante.
     * 
     * @return La carrera del estudiante.
     */
    // Implementa el método getCarrera de la interfaz InterfaceEstudiante para obtener la carrera del estudiante.
    @Override
    public String getCarrera() {
        return carrera;
    }

    /**
     * Establece la carrera del estudiante.
     * 
     * @param carrera La carrera del estudiante.
     */
    // Implementa el método setCarrera de la interfaz InterfaceEstudiante para establecer la carrera del estudiante.
    @Override
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}
