package org.mudanzasalegre.gestionTaquillasDos.repository;

import org.mudanzasalegre.gestionTaquillasDos.model.Vestuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VestuarioRepository extends JpaRepository<Vestuario, Integer> {
	Vestuario findByNombre(String nombre);
}
