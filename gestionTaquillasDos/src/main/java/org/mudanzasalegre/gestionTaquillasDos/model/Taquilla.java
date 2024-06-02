package org.mudanzasalegre.gestionTaquillasDos.model;

import jakarta.validation.constraints.Pattern;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "taquillas", indexes = { @Index(name = "idx_taquilla_codigo", columnList = "codigoTaquilla") })
public class Taquilla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "vestuario_id", nullable = false)
	private Vestuario vestuario;

	@Column(nullable = false, unique = true, length = 20)
	private String codigoTaquilla;

	@Column(nullable = false, length = 255)
	private String nombreApellidos;

	@Column(nullable = false, length = 50)
	private String categoriaProfesional;

	@Column(nullable = false, length = 50)
	private String servicio;

	@Pattern(regexp = "^\\d{9}$|^$", message = "El número de teléfono debe tener 9 dígitos o estar en blanco")
	@Column(length = 9)
	private String telefono;

	private boolean empresaExterna;

	// Constructor vacío
	public Taquilla() {
	}

	// Constructor con parámetros
	public Taquilla(Vestuario vestuario, String codigoTaquilla, String nombreApellidos, String categoriaProfesional,
			String servicio, String telefono, boolean empresaExterna) {
		this.vestuario = vestuario;
		this.codigoTaquilla = codigoTaquilla;
		this.nombreApellidos = nombreApellidos;
		this.categoriaProfesional = categoriaProfesional;
		this.servicio = servicio;
		this.telefono = telefono;
		this.empresaExterna = empresaExterna;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Vestuario getVestuario() {
		return vestuario;
	}

	public void setVestuario(Vestuario vestuario) {
		this.vestuario = vestuario;
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

	public boolean isEmpresaExterna() {
		return empresaExterna;
	}

	public void setEmpresaExterna(boolean empresaExterna) {
		this.empresaExterna = empresaExterna;
	}

	@Override
	public String toString() {
		return "Taquilla [id=" + id + ", vestuario=" + vestuario + ", codigoTaquilla=" + codigoTaquilla + ", nombreApellidos="
				+ nombreApellidos + ", categoriaProfesional=" + categoriaProfesional + ", servicio=" + servicio + ", telefono="
				+ telefono + ", empresaExterna=" + empresaExterna + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoriaProfesional, codigoTaquilla, empresaExterna, id, nombreApellidos, servicio, telefono,
				vestuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taquilla other = (Taquilla) obj;
		return Objects.equals(categoriaProfesional, other.categoriaProfesional)
				&& Objects.equals(codigoTaquilla, other.codigoTaquilla) && empresaExterna == other.empresaExterna
				&& Objects.equals(id, other.id) && Objects.equals(nombreApellidos, other.nombreApellidos)
				&& Objects.equals(servicio, other.servicio) && Objects.equals(telefono, other.telefono)
				&& Objects.equals(vestuario, other.vestuario);
	}
}
