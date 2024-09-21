/**
 * Esta clase representa un proxy para un objeto de tipo Estudiante.
 * Actúa como intermediario entre el cliente y el objeto Estudiante real.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
 */
public class ProxyEstudiante implements InterfaceEstudiante {
    // Declara una variable privada de tipo Estudiante llamada "alumno"
    private Estudiante alumno;
    
    /**
     * Constructor de la clase ProxyEstudiante.
     * 
     * @param alumno El objeto Estudiante real que se va a utilizar a través del proxy.
     */
    public ProxyEstudiante(Estudiante alumno) {
        // Asigna el objeto "alumno" pasado como argumento al objeto "alumno" de la clase
        this.alumno = alumno;
    }
    
    @Override
    public String getUsuario() {
        // Devuelve el valor de la propiedad "usuario" del objeto "alumno"
        return alumno.getUsuario();
    }

    @Override
    public void setUsuario(String usuario) {
        // Establece el valor de la propiedad "usuario" del objeto "alumno" al valor pasado como argumento
        alumno.setUsuario(usuario);
    }

    @Override
    public String getContrasenia() {
        // Devuelve el valor de la propiedad "contrasenia" del objeto "alumno"
        return alumno.getContrasenia();
    }

    @Override
    public void setContrasenia(String contrasenia) {
        // Establece el valor de la propiedad "contrasenia" del objeto "alumno" al valor pasado como argumento
        alumno.setContrasenia(contrasenia);
    }

    @Override
    public String getNombre() {
        // Devuelve el valor de la propiedad "nombre" del objeto "alumno"
        return alumno.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        // Establece el valor de la propiedad "nombre" del objeto "alumno" al valor pasado como argumento
        alumno.setNombre(nombre);
    }

    @Override
    public int getNoCuenta() {
        // Devuelve el valor de la propiedad "noCuenta" del objeto "alumno"
        return alumno.getNoCuenta();
    }

    @Override
    public void setNoCuenta(int noCuenta) {
        // Establece el valor de la propiedad "noCuenta" del objeto "alumno" al valor pasado como argumento
        alumno.setNoCuenta(noCuenta);
    }

    @Override
    public String getCarrera() {
        // Devuelve el valor de la propiedad "carrera" del objeto "alumno"
        return alumno.getCarrera();
    }

    @Override
    public void setCarrera(String carrera) {
        // Establece el valor de la propiedad "carrera" del objeto "alumno" al valor pasado como argumento
        alumno.setCarrera(carrera);
    }
}
