import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ServicioAlumno svAlumno= new ServicioAlumno();



        ArrayList<Alumno> listaAlumnos=svAlumno.crearLista();
        System.out.println("");
        System.out.println(" ingrese alumnx a buscar en la lista");
        System.out.println("");
        String nombreIngresado=sc.next();

        svAlumno.busquedaAlumno(listaAlumnos,nombreIngresado );

       // Alumno alumnoEncontrado= svAlumno.busquedaAlumno(listaAlumnos,nombreIngresado );
        // svAlumno.promedioNotas(alumnoEncontrado);















    }
}