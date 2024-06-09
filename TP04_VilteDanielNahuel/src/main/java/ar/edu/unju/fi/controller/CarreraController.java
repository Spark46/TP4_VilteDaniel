package ar.edu.unju.fi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.collections.CarreraCollection;
import ar.edu.unju.fi.model.Carrera;
@Controller
public class CarreraController {
	
	@Autowired
	Carrera nuevaCarrera = new Carrera();
	
	@GetMapping("/formularioCarreras")
	public ModelAndView getFormularioCarreras() {
		//vista formCarrera.html
		ModelAndView modelView = new ModelAndView("formularioCarreras");
		modelView.addObject("nuevaCarrera", nuevaCarrera);	
		return modelView;
	}
	
	@PostMapping("/guardarCarrera")
	public ModelAndView saveCarrera(@ModelAttribute("nuevaCarrera") Carrera carreraAGuardar) {
		//guardar
		CarreraCollection.agregarCarrera(carreraAGuardar);
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarrera", CarreraCollection.listarCarreras());	
		return modelView;	
	}
	
	@GetMapping("/borrarCarrera/{codigo}")
	public ModelAndView deleteCarreraDelListado(@PathVariable(name="codigo") String codigo) {
		//borrar
		CarreraCollection.eliminarCarrera(codigo);
		//mostrar el nuevo listado
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarrera", CarreraCollection.listarCarreras());	
		return modelView;		
	}
	
	@GetMapping("/modificarCarrera/{codigo}")
	public ModelAndView editCarrera(@PathVariable(name="codigo") String codigo) {
		//seleccionar la carrera para modificar
		Carrera carreraAModificar = CarreraCollection.buscarCarreraPorCodigo(codigo);
		
		//mostrar el formulario de modificacion
		ModelAndView modelView = new ModelAndView("formularioCarreras");
		modelView.addObject("nuevaCarrera", carreraAModificar);	
		modelView.addObject("flag", true);
		return modelView;		
		}
	
	@PostMapping("/modificarCarrera")
	public ModelAndView updateCarrera(@ModelAttribute("nuevaCarrera") Carrera carreraModificada) {
					
		//modificar la carrera
		CarreraCollection.modificarCarrera(carreraModificada);
		
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarrera", CarreraCollection.listarCarreras());	
		return modelView;		
	}
	
	@GetMapping("/carreras")
	public ModelAndView showCarreras() {
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarrera", CarreraCollection.listarCarreras());	
		return modelView;		
	}
}