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
