import com.sun.source.tree.UsesTree;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        Alumno a1 = new Alumno();
        System.out.println("ingrese el nombre del alumno");
        a1.setNombre(sc.next());
        System.out.println("");
        System.out.println("ingrese las notas que obtuvo el alumno");
        int cont = 1;
        ArrayList<Integer> notasIngresadas = new ArrayList<>();
        do {
            System.out.println("ingrese la nota N° " + (cont));
            notasIngresadas.add(sc.nextInt());
            cont++;
            System.out.println("Desea ingresar otra nota?? ");
        } while (sc.next().equalsIgnoreCase("si") ? true : false);
        a1.setNotas(notasIngresadas);
        return a1;
    }

    public ArrayList<Alumno> crearLista() {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        do {
            listaAlumnos.add(crearAlumno());
            System.out.println(" Quiere ingresar otro alumno?");
        } while (sc.next().equalsIgnoreCase("si") ? true : false);
        mostrarListaAlumnos(listaAlumnos);
        return listaAlumnos;
    }


    private void mostrarListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        for (Alumno x : listaAlumnos
        ) {
            System.out.println(x.toString());
        }
    }

    // metodo de busqueda con un for each

       /* public Alumno busquedaAlumno(ArrayList <Alumno> listaAlumnos){
        Alumno Alumnoencontrado= null;
        String nombreIngresado=sc.next();
            System.out.println("ingresa el alumno a buscar");

        for (Alumno x: listaAlumnos
         ) if (x.getNombre().equalsIgnoreCase(nombreIngresado)) {
            Alumnoencontrado=x;
            System.out.println("alumno encontrado");
        }
            return Alumnoencontrado;
    }*/


    public Alumno busquedaAlumno(ArrayList<Alumno> listaAlumnos, String nombreIngresado) {
        Alumno alumnoEncontrado = null;
        int i = 0;
        double suma = 0;
        while (i < listaAlumnos.size() && !listaAlumnos.get(i).getNombre().equalsIgnoreCase(nombreIngresado)) {
            i++;
        }
        if (i < listaAlumnos.size()) {
            alumnoEncontrado = listaAlumnos.get(i);
            for (Integer notas : alumnoEncontrado.getNotas()
            ) {
                suma += notas;
            }
            System.out.println(" Las notas que obtuvo el alumno  " + alumnoEncontrado + " y tiene un promedio de " + suma / alumnoEncontrado.getNotas().size());
        } else {
            System.out.println(" El alumno ingresado no se encontró en la lista");
        }
        return alumnoEncontrado;
    }


         /*public double promedioNotas(Alumno alumnoEncotrado){
            int sumatoria=0;
            for (int i = 0; i < alumnoEncotrado.getNotas().size(); i++) {

                for (Integer nota: alumnoEncotrado.getNotas()) {
                    sumatoria+=nota;
                }
            }
                System.out.println("la suma es: "+sumatoria);
                double notaFinal= (sumatoria / alumnoEncotrado.getNotas().size());
                System.out.println( "la nota final es "+ notaFinal);
              return notaFinal;
        }*/


}











