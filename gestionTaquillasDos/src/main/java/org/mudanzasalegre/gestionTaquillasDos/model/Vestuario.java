package org.mudanzasalegre.gestionTaquillasDos.model;


import jakarta.persistence.*;

@Entity
@Table(name = "vestuarios", indexes = {
    @Index(name = "idx_vestuario_nombre", columnList = "nombre")
})
public class Vestuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
