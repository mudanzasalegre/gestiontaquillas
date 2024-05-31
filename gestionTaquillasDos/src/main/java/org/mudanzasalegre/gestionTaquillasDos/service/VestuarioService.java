package org.mudanzasalegre.gestionTaquillasDos.service;

import java.util.List;
import java.util.Optional;

import org.mudanzasalegre.gestionTaquillasDos.model.Vestuario;
import org.mudanzasalegre.gestionTaquillasDos.repository.VestuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class VestuarioService {

    @Autowired
    private VestuarioRepository vestuarioRepository;

    public List<Vestuario> findAll() {
        return vestuarioRepository.findAll();
    }
    
    public List<Vestuario> findAll(Sort sort) {
        return vestuarioRepository.findAll(sort);
    }

    public Vestuario save(Vestuario vestuario) {
        return vestuarioRepository.save(vestuario);
    }

    public void deleteById(Integer id) {
        vestuarioRepository.deleteById(id);
    }

    public Vestuario findById(Integer id) {
        Optional<Vestuario> vestuario = vestuarioRepository.findById(id);
        return vestuario.orElse(null);
    }
    
    public Vestuario findByNombre(String nombre) {
     return vestuarioRepository.findByNombre(nombre);
 }
}
