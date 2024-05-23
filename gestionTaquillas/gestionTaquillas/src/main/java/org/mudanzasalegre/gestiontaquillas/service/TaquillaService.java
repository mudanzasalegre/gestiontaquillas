package org.mudanzasalegre.gestiontaquillas.service;

import org.mudanzasalegre.gestiontaquillas.model.Taquilla;
import org.mudanzasalegre.gestiontaquillas.repo.TaquillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaquillaService {

    @Autowired
    private TaquillaRepository taquillaRepository;

    public Page<Taquilla> getAllTaquillas(Pageable pageable) {
        return taquillaRepository.findAll(pageable);
    }

    public Page<Taquilla> getByVestuario(String vestuario, Pageable pageable) {
        return taquillaRepository.findByVestuario(vestuario, pageable);
    }

    public Page<Taquilla> getBySexo(String sexo, Pageable pageable) {
        return taquillaRepository.findBySexo(sexo, pageable);
    }

    public Page<Taquilla> getByVestuarioAndSexo(String vestuario, String sexo, Pageable pageable) {
        return taquillaRepository.findByVestuarioAndSexo(vestuario, sexo, pageable);
    }

    public Page<Taquilla> searchByNombreApellidos(String nombre, Pageable pageable) {
        return taquillaRepository.findByNombreApellidosContainingIgnoreCase(nombre, pageable);
    }

    public void guardar(Taquilla taquilla) {
        taquillaRepository.save(taquilla);
    }

    public Taquilla getTaquillaById(Long id) {
        return taquillaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        taquillaRepository.deleteById(id);
    }
}
