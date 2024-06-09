package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class DocenteCollection {
	public static List<Docente> docentes = new ArrayList<Docente>();

	public static List<Docente> listarDocentes() {
		return docentes;
	}

	public static Docente buscarDocentePorLegajo(String legajo) {
		for (Docente docente : docentes) {
			if (docente.getLegajo().equals(legajo)) {
				return docente;
			}
		}
		return null;
	}

	public static void modificarDocente(Docente docenteModificado) {
		int i = 0;
		for (Docente docente : docentes) {
			if (docente.getLegajo().equals(docenteModificado.getLegajo())) {
				docentes.set(i, docenteModificado);
				break;
			}
			i++;
		}
	}

	public static void eliminarDocente(String legajo) {
		docentes.removeIf(docente -> docente.getLegajo().equals(legajo));
	}

	public static void agregarDocente(Docente docente) {
		docentes.add(docente);
	}
}