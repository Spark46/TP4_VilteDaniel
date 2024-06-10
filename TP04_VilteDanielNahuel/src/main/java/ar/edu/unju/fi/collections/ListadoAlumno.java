package ar.edu.unju.fi.collections;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Alumno;
public class ListadoAlumno {
	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	public static List<Alumno> listarAlumnos() {
		return alumnos;
	}
	public static Alumno buscarAlumnoPorDni(String dni) {
		for (Alumno alumno : alumnos) {
			if (alumno.getDni().equals(dni)) {
				return alumno;
		    }
		}
		return null;
	}
	
	public static void modificarAlumno(Alumno alumnoModificado) {
		int i=0;
		for (Alumno alumno : alumnos) {
			if (alumno.getDni().equals(alumnoModificado.getDni())) {
				alumnos.set(i, alumnoModificado);
				break;
			}
			i++;
		}
	}
	public static void eliminarAlumno(String dni) {
		alumnos.removeIf(alumno -> alumno.getDni().equals(dni));
	}
	public static void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
}
