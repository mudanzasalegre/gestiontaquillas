/*
 * Gestión de Taquillas App - Propiedad Intelectual
 * Derechos de autor (c) - 2024 - mudanzasalegre
 * 
 * Este software y la documentación asociada son propiedad de JL Alegre (el "Autor").
 * 
 * Permiso de uso:
 * Se concede permiso para usar este software y la documentación asociada para fines internos dentro de [Nombre de la Institución] únicamente.
 * 
 * Restricciones:
 * 1. No se permite la copia, modificación, distribución, venta, sublicencia o transferencia de este software sin el permiso expreso y por escrito del Autor.
 * 2. Este software no puede ser usado para fines comerciales sin el consentimiento previo por escrito del Autor.
 * 
 * Propiedad Intelectual:
 * Este software es y seguirá siendo propiedad intelectual del Autor.
 * 
 * Garantía y Responsabilidad:
 * Este software se proporciona "tal cual", sin garantía de ningún tipo, expresa o implícita, incluyendo pero no limitándose a las garantías de comerciabilidad, idoneidad para un propósito particular y no infracción. En ningún caso el Autor será responsable por cualquier reclamo, daño o responsabilidad, ya sea en una acción de contrato, agravio o de otro tipo, que surja de o en conexión con el software o el uso u otros tratos en el software.
 * 
 * Contacto:
 * Para solicitar permiso o información adicional, por favor contacta a mudanzasalegre@hotmail.com
 */

package org.mudanzasalegre.gestionTaquillasDos.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "taquillas", indexes = { @Index(name = "idx_taquilla_codigo", columnList = "codigoTaquilla") })
public class Taquilla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "vestuario_id", nullable = false)
	private Vestuario vestuario;

	@Column(name = "codigo_taquilla", nullable = false, unique = true, length = 50)
	private String codigoTaquilla;

	@Column(name = "nombre_apellidos", length = 255)
	private String nombreApellidos;

	@Column(name = "categoria_profesional", length = 30)
	private String categoriaProfesional;

	@Column(name = "servicio", length = 30)
	private String servicio;

	@Column(name = "telefono", length = 9)
	private String telefono;

	@Column(name = "empresa_externa")
	private Boolean empresaExterna;

	@Column(name = "fecha_revision")
	private LocalDateTime fechaRevision;

	@Column(name = "revisado", nullable = false)
	private Boolean revisado = false;

	// Constructor vacío
	public Taquilla() {
	}

	// Constructor parametrizado
	public Taquilla(Vestuario vestuario, String codigoTaquilla, String nombreApellidos, String categoriaProfesional,
			String servicio, String telefono, Boolean empresaExterna, LocalDateTime fechaRevision, Boolean revisado) {
		this.vestuario = vestuario;
		this.codigoTaquilla = codigoTaquilla;
		this.nombreApellidos = nombreApellidos;
		this.categoriaProfesional = categoriaProfesional;
		this.servicio = servicio;
		this.telefono = telefono;
		this.empresaExterna = empresaExterna;
		this.fechaRevision = fechaRevision;
		this.revisado = revisado;
	}

	// Getters y Setters

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

	public Boolean getEmpresaExterna() {
		return empresaExterna;
	}

	public void setEmpresaExterna(Boolean empresaExterna) {
		this.empresaExterna = empresaExterna;
	}

	public LocalDateTime getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(LocalDateTime fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public Boolean getRevisado() {
		return revisado;
	}

	public void setRevisado(Boolean revisado) {
		this.revisado = revisado;
	}

	// Método toString

	@Override
	public String toString() {
		return "Taquilla{" + "id=" + id + ", vestuario=" + vestuario + ", codigoTaquilla='" + codigoTaquilla + '\''
				+ ", nombreApellidos='" + nombreApellidos + '\'' + ", categoriaProfesional='" + categoriaProfesional + '\''
				+ ", servicio='" + servicio + '\'' + ", telefono='" + telefono + '\'' + ", empresaExterna=" + empresaExterna
				+ ", fechaRevision=" + fechaRevision + ", revisado=" + revisado + '}';
	}

	// Métodos equals y hashCode

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Taquilla taquilla = (Taquilla) o;
		return Objects.equals(id, taquilla.id) && Objects.equals(vestuario, taquilla.vestuario)
				&& Objects.equals(codigoTaquilla, taquilla.codigoTaquilla)
				&& Objects.equals(nombreApellidos, taquilla.nombreApellidos)
				&& Objects.equals(categoriaProfesional, taquilla.categoriaProfesional)
				&& Objects.equals(servicio, taquilla.servicio) && Objects.equals(telefono, taquilla.telefono)
				&& Objects.equals(empresaExterna, taquilla.empresaExterna) && Objects.equals(fechaRevision, taquilla.fechaRevision)
				&& Objects.equals(revisado, taquilla.revisado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, vestuario, codigoTaquilla, nombreApellidos, categoriaProfesional, servicio, telefono,
				empresaExterna, fechaRevision, revisado);
	}
}