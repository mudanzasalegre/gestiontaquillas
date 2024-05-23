package org.mudanzasalegre.gestiontaquillas.repo;

import org.mudanzasalegre.gestiontaquillas.model.Taquilla;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaquillaRepository extends JpaRepository<Taquilla, Long> {
	Page<Taquilla> findByNombreApellidosContaining(String nombreApellidos, Pageable pageable);

	Page<Taquilla> findAll(Pageable pageable);

	Page<Taquilla> findByVestuario(String vestuario, Pageable pageable);

	Page<Taquilla> findBySexo(String sexo, Pageable pageable);

	Page<Taquilla> findByVestuarioAndSexo(String vestuario, String sexo, Pageable pageable);

	Page<Taquilla> findByNombreApellidosContainingIgnoreCase(String nombreApellidos, Pageable pageable);
}