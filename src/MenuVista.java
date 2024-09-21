/**
 * Esta clase representa la vista del menú de un sistema de libros.
 * Permite interactuar con el usuario mostrando opciones y recopilando su entrada.
 * Proporciona métodos para mostrar mensajes, obtener datos de entrada y mostrar información.
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuVista {
    private Scanner entrada;

    /**
     * Crea una instancia de VistaMenu.
     * Inicializa el objeto Scanner para leer la entrada del usuario desde la consola.
     */
    public MenuVista() {
        entrada = new Scanner(System.in);
    }

    /**
     * Muestra el menú y permite al usuario seleccionar una opción.
     * 
     * @return La opción seleccionada por el usuario.
     */
    public Integer mostrarMenu() {
        Integer opcion = null;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Bienvenido al sistema");
                System.out.println("Selecciona una de las siguientes opciones");
                System.out.println("1. Ver libros disponibles");
                System.out.println("2. Buscar libro por nombre");
                System.out.println("3. Libros recomendados para ti");
                System.out.println("4. Salir");

                String input = entrada.nextLine();
                opcion = Integer.parseInt(input);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor numerico.");
            }
        }

        return opcion;
    }

    /**
     * Permite al usuario ingresar el nombre de un libro.
     * 
     * @return El nombre del libro ingresado por el usuario.
     */
    public String ingresarNombreLibro() {
        System.out.println("Ingresa el nombre del libro:");
        return entrada.nextLine();
    }


    /**
     * Muestra la información de un libro.
     * 
     * @param libro El libro a mostrar.
     */
    public void mostrarLibro(Libro libro) {
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("El libro no existe.");
        }
    }

    /**
     * Muestra un mensaje y permite al usuario confirmar una acción (Sí/No).
     * 
     * @param mensaje El mensaje a mostrar.
     * @return true si el usuario selecciona "Sí", false si selecciona "No".
     */
    public boolean confirmarAccion(String mensaje) {
        
        System.out.println(mensaje);
        System.out.println("1. Si");
        System.out.println("2. No");

        int opcion = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer del scanner
        return opcion == 1;
    }

    /**
     * Permite al usuario ingresar un comentario para un libro.
     * 
     * @return El comentario ingresado por el usuario.
     */
    public String ingresarComentario() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué comentario deseas agregar?");
        System.out.println("1) Me encantó este libro");
        System.out.println("2) Está regular este libro");
        System.out.println("3) No lo volvería a leer");
        String comentario = "";

        boolean opcionValida = false;
        do {
            try {
                int opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Agregando comentario positivo");
                        comentario = "Me encantó este libro";
                        opcionValida = true;
                        break;
                    case 2:
                        System.out.println("Agregando comentario neutro");
                        comentario = "Está regular este libro";
                        opcionValida = true;
                        break;
                    case 3:
                        System.out.println("Agregando comentario negativo");
                        comentario = "No lo volvería a leer";
                        opcionValida = true;
                        break;
                    default:
                        System.out.println("Elección inválida, intenta de nuevo");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, intenta de nuevo");
                entrada.next(); // Limpiar el buffer del scanner
            }
        } while (!opcionValida);

        return comentario;
    }

    /**
     * Muestra un mensaje en la consola.
     * 
     * @param mensaje El mensaje a mostrar.
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Muestra un mensaje de despedida en la consola.
     */
    public void mostrarMensajeDespedida() {
        System.out.println("Vuelve pronto!");
    }

    /**
     * Muestra un mensaje indicando que la opción seleccionada no está disponible.
     */
    public void mostrarOpcionInvalida() {
        System.out.println("Opción no disponible. Por favor, elija una opción válida.");
    }

    /**
     * Muestra un mensaje de error en la consola.
     * 
     * @param mensajeError El mensaje de error a mostrar.
     */
    public void mostrarError(String mensajeError) {
        System.out.println("Error: " + mensajeError);
    }

}
