package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.model.Docente;

@Controller
public class DocenteController {
	@Autowired
	Docente nuevoDocente = new Docente();
	
	@GetMapping("/formularioDocente")
    public ModelAndView getFormDocentes() {
		ModelAndView modelView = new ModelAndView("formDocente");
		modelView.addObject("nuevoDocente", nuevoDocente);
        return modelView;
    }
	
	@PostMapping("/guardarDocente")
	public ModelAndView saveDocente(@ModelAttribute("nuevoDocente") Docente docenteAGuardar) {
		//guardar
		DocenteCollection.agregarDocente(docenteAGuardar);
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocente", DocenteCollection.listarDocentes());	
		return modelView;	
	}
	
	@GetMapping("/borrarDocente/{legajo}")
	public ModelAndView delDocenteDeList(@PathVariable(name="legajo") String legajo) {
		//borrar
		DocenteCollection.eliminarDocente(legajo);
		//mostrar el nuevo listado
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocente", DocenteCollection.listarDocentes());	
		return modelView;		
	}
	
	@GetMapping("/modificarDocente/{legajo}")
	public ModelAndView editDocente(@PathVariable(name="legajo") String legajo) {
		//seleccionar el docente para modificar
		Docente docenteAModificar = DocenteCollection.buscarDocentePorLegajo(legajo);
		
		//mostrar el formulario de modificacion
		ModelAndView modelView = new ModelAndView("formDocente");
		modelView.addObject("nuevoDocente", docenteAModificar);	
		modelView.addObject("flag", true);
		return modelView;		
		}
	
	@PostMapping("/modificarDocente")
	public ModelAndView updateDocente(@ModelAttribute("nuevoDocente") Docente docenteModificado) {
					
		//modifica el docente
		DocenteCollection.modificarDocente(docenteModificado);
		
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocente", DocenteCollection.listarDocentes());	
		return modelView;		
	}
	
	@GetMapping("/docentes")
	public ModelAndView showDocentes() {
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocente", DocenteCollection.listarDocentes());	
		return modelView;		
	}
}