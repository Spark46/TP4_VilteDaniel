package ar.edu.unju.fi.model;
import org.springframework.stereotype.Component;

@Component
public class Carrera {
	private String codigo;
	private String nombre;
	private int cantidadAnios;
	private boolean estado;
	
	
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carrera(String codigo, String nombre, int cantidadAnios, boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAnios = cantidadAnios;
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
	
	public int getCantidadAnios() {
		return cantidadAnios;
	}
	
	public void setCantidadAnios(int cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}