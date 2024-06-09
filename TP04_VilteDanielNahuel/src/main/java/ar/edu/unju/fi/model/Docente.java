package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component

public class Docente {
	private String legajo;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}

	public Docente(String legajo, String nombre, String apellido, String email, String telefono) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	public String getLegajo() {
		return legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}	
	
	
}
