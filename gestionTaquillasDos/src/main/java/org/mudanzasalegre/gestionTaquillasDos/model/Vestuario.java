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


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "vestuarios", indexes = {
    @Index(name = "idx_vestuario_nombre", columnList = "nombre")
})
public class Vestuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre del vestuario es obligatorio.")
    @Column(nullable = false, length = 50)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Sexo sexo;

    // Constructor vacío
    public Vestuario() {}

    // Constructor con parámetros
    public Vestuario(String nombre, Sexo sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

				public Integer getId() {
					return id;
				}

				public void setId(Integer id) {
					this.id = id;
				}

				public String getNombre() {
					return nombre;
				}

				public void setNombre(String nombre) {
					this.nombre = nombre;
				}

				public Sexo getSexo() {
					return sexo;
				}

				public void setSexo(Sexo sexo) {
					this.sexo = sexo;
				}
    
}
