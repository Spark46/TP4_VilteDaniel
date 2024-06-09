package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String fecha_nac;
	private String domicilio;
	private String libreta;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	public Alumno(String dni, String nombre, String apellido, String email, String telefono, String fecha_nac,
			String domicilio, String libreta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fecha_nac = fecha_nac;
		this.domicilio = domicilio;
		this.libreta = libreta;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLibreta() {
		return libreta;
	}
	public void setLibreta(String libreta) {
		this.libreta = libreta;
	}
	
	
}
