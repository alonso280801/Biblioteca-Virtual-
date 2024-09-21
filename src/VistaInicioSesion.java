/**
 * Esta clase representa la vista de inicio de sesión de un sistema.
 * Permite interactuar con el usuario para solicitar el nombre de usuario y la contraseña,
 * y mostrar mensajes de inicio de sesión exitoso o mensajes de error.
 * También proporciona un método para mostrar un mensaje de error general.
 * 
 * Los métodos de esta clase imprimen información en la consola.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
 */
import java.util.Scanner;

public class VistaInicioSesion {
    private Scanner entrada;

    /**
     * Crea una instancia de la clase VistaInicioSesion.
     * Inicializa el Scanner para leer la entrada del usuario desde la consola.
     */
    public VistaInicioSesion() {
        entrada = new Scanner(System.in);
    }
    
    /**
     * Solicita al usuario que ingrese su nombre de usuario.
     * 
     * @return El nombre de usuario ingresado por el usuario.
     */
    public String pedirUsuario() {
        System.out.println("Ingresa tu nombre de usuario");
        return entrada.nextLine();
    }
    
    /**
     * Solicita al usuario que ingrese su contraseña.
     * 
     * @return La contraseña ingresada por el usuario.
     */
    public String pedirContrasenia() {
        System.out.println("Ingresa tu contrasenia");
        return entrada.nextLine();
    }
    
    /**
     * Muestra un mensaje de inicio de sesión exitoso en la consola.
     */
    public void mostrarInicioSesionExitoso() {
        System.out.println("Inicio de sesion exitoso");
    }
    
    /**
     * Muestra un mensaje de error de inicio de sesión en la consola.
     * Este mensaje se muestra cuando el usuario y/o la contraseña son incorrectos.
     */
    public void mostrarErrorInicioSesion() {
        System.out.println("Usuario y/o contrasenia incorrecta");
    }
    
    /**
     * Muestra un mensaje de error general en la consola.
     * Este mensaje se muestra cuando ocurre un error no especificado durante el inicio de sesión.
     */
    public void mostrarError() {
        System.out.println("Ha ocurrido un error, por favor intentalo de nuevo");
    }   
}
