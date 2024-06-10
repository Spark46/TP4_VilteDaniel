package ar.edu.unju.fi.collections;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Materia;
public class ListadoMateria {
	public static List<Materia> materias = new ArrayList<Materia>();
	public static List<Materia> listarMaterias() {
		return materias;
	}
	public static Materia buscarMateriaPorCodigo(String codigo) {
		for (Materia materia : materias) {
			if (materia.getCodigo().equals(codigo)) {
				return materia;
			}
	    }
	    return null;
	}
	public static void modificarMateria(Materia materiaModificada) {
		int i=0;
		for (Materia materia : materias) {
			if (materia.getCodigo().equals(materiaModificada.getCodigo())) {
				materias.set(i, materiaModificada);
				break;
			}
			i++;
	    }
	}
	public static void eliminarMateria(String codigo) {
	    materias.removeIf(materia -> materia.getCodigo().equals(codigo));
	}
	public static void agregarMateria(Materia materia) {
		materias.add(materia);
	}
}
