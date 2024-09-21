/**
 * La clase InicioSesion representa el proceso de inicio de sesión de un estudiante.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.util.List;
public class InicioSesion {
    // Declara una variable de instancia de tipo Usuarios.
    Usuarios usuarios = new Usuarios();
    // Declara una variable de instancia de tipo VistaInicioSesion.
    private VistaInicioSesion mensaje;
    // Declara una lista de objetos ProxyEstudiante.
    private List<ProxyEstudiante> alumnos;
    // Declara una variable de instancia de tipo boolean para indicar si la sesión ha sido iniciada.
    private boolean sesionIniciada;
    // Declara una variable de instancia de tipo boolean para indicar si el alumno ha sido encontrado.
    private boolean alumnoEncontrado;
    // Declara una variable de instancia de tipo String para almacenar la carrera del estudiante.
    private String carrera;

    /**
     * Crea un objeto de tipo InicioSesion y realiza la inicialización necesaria.
     */
    // Define un constructor para la clase InicioSesion.
    public InicioSesion() {
        mensaje = new VistaInicioSesion();
        alumnos = usuarios.lista();;
        sesionIniciada = false;
        alumnoEncontrado =false;
        carrera="";
    }

    /**
     * Realiza el proceso de inicio de sesión y devuelve la carrera del estudiante.
     * 
     * @return La carrera del estudiante.
     */
    // Define un método llamado iniciarSesion que devuelve una cadena.
    public String iniciarSesion() {
        // Ejecuta el bucle mientras la sesión no haya sido iniciada.
        while(!sesionIniciada){
            // Solicita al usuario el nombre de usuario.
            String usuario = mensaje.pedirUsuario();
            // Solicita al usuario la contraseña.
            String contrasenia = mensaje.pedirContrasenia();
            // Indica si se ha mostrado un error al iniciar sesión.
            boolean mostradoError = false;
            // Recorre cada estudiante en la lista de alumnos.
            for (ProxyEstudiante estudianteBusq : alumnos) {
                try {
                    // Verifica si el usuario y la contraseña coinciden con el estudiante actual.
                    if (estudianteBusq.getUsuario().equals(usuario) && estudianteBusq.getContrasenia().equals(contrasenia)) {
                        sesionIniciada = true;
                        alumnoEncontrado = true;
                        carrera=estudianteBusq.getCarrera();
                        break;
                    }
                } catch (Exception e) {
                    // Muestra el mensaje de error de inicio de sesión si no se ha mostrado previamente.
                    if (!mostradoError) {
                        mensaje.mostrarErrorInicioSesion();
                        mostradoError = true;
                    }
                }
            }
            // Muestra el mensaje de inicio de sesión exitoso si se encontró el alumno.
            if(alumnoEncontrado==true){
                mensaje.mostrarInicioSesionExitoso();
            }else{
                // Muestra el mensaje de error de inicio de sesión si no se ha mostrado previamente.
                if (!mostradoError) {
                    mensaje.mostrarErrorInicioSesion();
                }
            }
        }
     // Devuelve la carrera del estudiante.
     return carrera;
    }

}
