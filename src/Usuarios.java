/**
 * @author Tovar Gonzalez Cristian Alonso.
 * @version Mayo de 2023.
*/
import java.util.ArrayList;
import java.util.List;
public class Usuarios {
    
    // Creación de instancias de la clase Estudiante
    Estudiante alumno1 = new Estudiante("CaPi", "3.1416", "Carlos", 420987581, "Matematicas");
    Estudiante alumno2 = new Estudiante("Pelon18", "P3L0N", "Adrian", 318719032, "Biologia");
    Estudiante alumno3 = new Estudiante("MasterCoin", "Apartado", "Erik", 319132032, "Actuaria");
    Estudiante alumno4 = new Estudiante("Roki", "Pincel", "Itzel", 318205913, "Ciencias de la computacion");
    Estudiante alumno5 = new Estudiante("Senku", "VacaEsferica", "Samuel", 423928153, "Fisica");
    Estudiante alumno6 = new Estudiante("SoyAndy", "A17M", "Andrea", 317721209, "Matematicas");

    // Método para crear una lista de ProxyEstudiante
    public List lista(){  

        List<ProxyEstudiante> alumnos = new ArrayList<>();
        // Agrega instancias de ProxyEstudiante a la lista
        alumnos.add(new ProxyEstudiante(alumno1));
        alumnos.add(new ProxyEstudiante(alumno2));
        alumnos.add(new ProxyEstudiante(alumno3));
        alumnos.add(new ProxyEstudiante(alumno4));
        alumnos.add(new ProxyEstudiante(alumno5));
        alumnos.add(new ProxyEstudiante(alumno6));
      // Retorna la lista de alumnos  
     return alumnos;
    }

}