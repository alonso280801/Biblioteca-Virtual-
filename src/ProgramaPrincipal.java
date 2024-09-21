/**
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.io.IOException;

public class ProgramaPrincipal {
    public static void main(String[] args) throws IOException {
        // Crea una instancia de la clase MenuControlador
        MenuControlador controlador = new MenuControlador();
        // Llama al método iniciarSesion() de la instancia controlador
        controlador.iniciarSesion();
        // Crea una instancia de la clase MenuVista
        MenuVista vista = new MenuVista();
        // Declara una variable booleana llamada menuSalida y la inicializa en falso
        boolean menuSalida = false;

        while (!menuSalida) {
            try {
                // Llama al método mostrarMenu() de la instancia vista y asigna el resultado a la variable opcion
                Integer opcion = vista.mostrarMenu();

                switch (opcion) {
                    case 1:
                        // Llama al método verLibrosDisponibles() de la instancia controlador
                        controlador.verLibrosDisponibles();
                        break;
                    case 2:
                        // Llama al método buscarLibroPorNombre() de la instancia controlador
                        controlador.buscarLibroPorNombre();
                        break;
                    case 3:
                        // Llama al método librosRecomendados() de la instancia controlador
                        controlador.librosRecomendados();
                        break;
                    case 4:
                        // Llama al método mostrarMensajeDespedida() de la instancia vista
                        vista.mostrarMensajeDespedida();
                        menuSalida = true;
                        break;
                    default:
                        // Llama al método mostrarOpcionInvalida() de la instancia vista
                        vista.mostrarOpcionInvalida();
                    break;
                }
            } catch (Exception e) {
                // Llama al método mostrarError() de la instancia vista pasando el mensaje de la excepción como argumento
                vista.mostrarError(e.getMessage());
            }            
        }
    }
}
