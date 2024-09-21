/**
 * La interfaz InterfaceEstudiante define los métodos que deben ser implementados por una clase que represente a un estudiante.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/

public interface InterfaceEstudiante {
    /**
     * Devuelve el usuario del estudiante.
     * 
     * @return El usuario del estudiante.
     */
    String getUsuario();
    /**
     * Establece el usuario del estudiante.
     * 
     * @param usuario El nuevo usuario del estudiante.
     */
    void setUsuario(String usuario);
    /**
     * Devuelve la contraseña del estudiante.
     * 
     * @return La contraseña del estudiante.
     */
    String getContrasenia();

    /**
     * Establece la contraseña del estudiante.
     * 
     * @param contrasenia La nueva contraseña del estudiante.
     */
    void setContrasenia(String contrasenia);

    /**
     * Devuelve el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */
    String getNombre();

    /**
     * Establece el nombre del estudiante.
     * 
     * @param nombre El nuevo nombre del estudiante.
     */
    void setNombre(String nombre);

    /**
     * Devuelve el número de cuenta del estudiante.
     * 
     * @return El número de cuenta del estudiante.
     */
    int getNoCuenta();

    /**
     * Establece el número de cuenta del estudiante.
     * 
     * @param noCuenta El nuevo número de cuenta del estudiante.
     */
    void setNoCuenta(int noCuenta);

    /**
     * Devuelve la carrera del estudiante.
     * 
     * @return La carrera del estudiante.
     */
    String getCarrera();

    /**
     * Establece la carrera del estudiante.
     * 
     * @param carrera La nueva carrera del estudiante.
     */
    void setCarrera(String carrera);
}
