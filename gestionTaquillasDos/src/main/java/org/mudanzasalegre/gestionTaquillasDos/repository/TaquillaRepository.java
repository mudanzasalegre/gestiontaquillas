package org.mudanzasalegre.gestionTaquillasDos.repository;

import java.util.List;

import org.mudanzasalegre.gestionTaquillasDos.model.Taquilla;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaquillaRepository extends JpaRepository<Taquilla, Integer> {
    List<Taquilla> findByNombreApellidosContaining(String nombreApellidos);
    Page<Taquilla> findByNombreApellidosContainingIgnoreCase(String nombreApellidos, Pageable pageable);
    Page<Taquilla> findByVestuarioId(Integer vestuarioId, Pageable pageable);
    Page<Taquilla> findByVestuarioIdAndNombreApellidosContainingIgnoreCase(Integer vestuarioId, String nombreApellidos, Pageable pageable);
    Taquilla findByCodigoTaquilla(String codigoTaquilla);
}
