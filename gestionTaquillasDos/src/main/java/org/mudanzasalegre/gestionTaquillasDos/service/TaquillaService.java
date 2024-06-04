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

package org.mudanzasalegre.gestionTaquillasDos.service;

import java.util.List;
import java.util.Optional;

import org.mudanzasalegre.gestionTaquillasDos.model.Taquilla;
import org.mudanzasalegre.gestionTaquillasDos.repository.TaquillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaquillaService {

    @Autowired
    private TaquillaRepository taquillaRepository;

    public List<Taquilla> findAll() {
        return taquillaRepository.findAll();
    }

    public Page<Taquilla> findAll(Pageable pageable) {
        return taquillaRepository.findAll(pageable);
    }

    public List<Taquilla> searchByNombreApellidos(String nombreApellidos) {
        return taquillaRepository.findByNombreApellidosContaining(nombreApellidos);
    }

    public Taquilla save(Taquilla taquilla) {
        return taquillaRepository.save(taquilla);
    }

    public void deleteById(Integer id) {
        taquillaRepository.deleteById(id);
    }

    public Page<Taquilla> searchByNombreApellidos(String nombreApellidos, Pageable pageable) {
        return taquillaRepository.findByNombreApellidosContainingIgnoreCase(nombreApellidos, pageable);
    }

    public Page<Taquilla> findByVestuarioId(Integer vestuarioId, Pageable pageable) {
        return taquillaRepository.findByVestuarioId(vestuarioId, pageable);
    }

    public Taquilla findById(Integer id) {
        Optional<Taquilla> taquilla = taquillaRepository.findById(id);
        return taquilla.orElse(null);
    }

    public Page<Taquilla> searchByVestuarioIdAndNombreApellidos(Integer vestuarioId, String nombreApellidos, Pageable pageable) {
        return taquillaRepository.findByVestuarioIdAndNombreApellidosContainingIgnoreCase(vestuarioId, nombreApellidos, pageable);
    }

    public Taquilla findByCodigoTaquilla(String codigoTaquilla) {
        return taquillaRepository.findByCodigoTaquilla(codigoTaquilla);
    }
}
