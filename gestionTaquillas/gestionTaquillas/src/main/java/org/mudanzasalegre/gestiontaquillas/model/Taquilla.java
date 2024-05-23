package org.mudanzasalegre.gestiontaquillas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taquillas")
public class Taquilla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String vestuario;
	private String sexo;
	private String codigoTaquilla;
	private String nombreApellidos;
	private String categoriaProfesional;
	private String servicio;
	private String telefono;
	private boolean empresaExterna;

	// Getters y Setters

	// Constructor vacío
	public Taquilla() {
	}

	// Constructor con parámetros
	public Taquilla(String vestuario, String sexo, String codigoTaquilla, String nombreApellidos,
			String categoriaProfesional, String servicio, String telefono, boolean empresaExterna) {
		this.vestuario = vestuario;
		this.sexo = sexo;
		this.codigoTaquilla = codigoTaquilla;
		this.nombreApellidos = nombreApellidos;
		this.categoriaProfesional = categoriaProfesional;
		this.servicio = servicio;
		this.telefono = telefono;
		this.empresaExterna = empresaExterna;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVestuario() {
		return vestuario;
	}

	public void setVestuario(String vestuario) {
		this.vestuario = vestuario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCodigoTaquilla() {
		return codigoTaquilla;
	}

	public void setCodigoTaquilla(String codigoTaquilla) {
		this.codigoTaquilla = codigoTaquilla;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getCategoriaProfesional() {
		return categoriaProfesional;
	}

	public void setCategoriaProfesional(String categoriaProfesional) {
		this.categoriaProfesional = categoriaProfesional;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getEmpresaExterna() {
		return empresaExterna;
	}

	public void setEmpresaExterna(boolean empresaExterna) {
		this.empresaExterna = empresaExterna;
	}
	
}
