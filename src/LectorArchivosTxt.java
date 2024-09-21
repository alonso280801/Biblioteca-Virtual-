/**
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivosTxt {

    public static Libro leerArchivo(String rutaArchivo) throws IOException {
        // Se crea un objeto BufferedReader para leer el archivo
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        // Se lee la primera línea del archivo y se asigna a la variable "nombre"
        String nombre = br.readLine();
        // Se lee la segunda línea del archivo y se asigna a la variable "carrera"
        String carrera = br.readLine();
        // Se crea un StringBuilder para almacenar el contenido del archivo
        StringBuilder sb = new StringBuilder();
        String linea;
        // Se lee cada línea del archivo y se agrega al StringBuilder
        while ((linea = br.readLine()) != null) {
            sb.append(linea);
            sb.append(System.lineSeparator());
        }
        // Se obtiene el contenido completo del archivo como un String
        String contenido = sb.toString();
        // Se cierra el BufferedReader
        br.close();
        // Se crea y se devuelve un nuevo objeto Libro con los datos obtenidos del archivo
        return new Libro(nombre, contenido, carrera);
    }
}
