package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.collections.ListadoDocente;
import ar.edu.unju.fi.model.Docente;

@Controller
public class DocenteController {
    
    @Autowired
    Docente nuevoDocente = new Docente();
    
    @GetMapping("/formularioDocentes")
    public ModelAndView getFormularioDocentes() {
        ModelAndView modelView = new ModelAndView("formularioDocentes");
        modelView.addObject("nuevoDocente", nuevoDocente);
        return modelView;
    }
    
    @PostMapping("/guardarDocente")
    public ModelAndView saveDocente(@ModelAttribute("nuevoDocente") Docente docenteAGuardar) {
        ListadoDocente.agregarDocente(docenteAGuardar);
        ModelAndView modelView = new ModelAndView("listaDeDocentes");
        modelView.addObject("listadoDocente", ListadoDocente.listarDocentes());    
        return modelView;    
    }
    
    @GetMapping("/borrarDocente/{legajo}")
    public ModelAndView deleteDocenteDelListado(@PathVariable(name="legajo") String legajo) {
        ListadoDocente.eliminarDocente(legajo);
        ModelAndView modelView = new ModelAndView("listaDeDocentes");
        modelView.addObject("listadoDocente", ListadoDocente.listarDocentes());    
        return modelView;        
    }
    
    @GetMapping("/modificarDocente/{legajo}")
    public ModelAndView editDocente(@PathVariable(name="legajo") String legajo) {
        Docente docenteAModificar = ListadoDocente.buscarDocentePorLegajo(legajo);
        ModelAndView modelView = new ModelAndView("formularioDocentes");
        modelView.addObject("nuevoDocente", docenteAModificar);    
        modelView.addObject("flag", true);
        return modelView;        
    }
    
    @PostMapping("/modificarDocente")
    public ModelAndView updateDocente(@ModelAttribute("nuevoDocente") Docente docenteModificado) {
        ListadoDocente.modificarDocente(docenteModificado);
        ModelAndView modelView = new ModelAndView("listaDeDocentes");
        modelView.addObject("listadoDocente", ListadoDocente.listarDocentes());    
        return modelView;        
    }
    
    @GetMapping("/docentes")
    public ModelAndView showDocentes() {
        ModelAndView modelView = new ModelAndView("listaDeDocentes");
        modelView.addObject("listadoDocente", ListadoDocente.listarDocentes());    
        return modelView;        
    }
}

