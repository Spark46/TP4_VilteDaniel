package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	private String codigo;
    private String nombre;
    private Integer curso;
    private Integer cantidadHoras;
    private String modalidad;
    private Docente docente;
    private Carrera carrera;
    private boolean estado;
    
    public Materia() {
    	
    }
	public Materia(String codigo, String nombre, Integer curso, Integer cantidadHoras, String modalidad, Docente docente,
			Carrera carrera, boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
		this.estado = estado;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public Integer getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

    
}