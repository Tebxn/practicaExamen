package com.practica01.practica01.service;

import com.practica01.practica01.entity.Estado;
import com.practica01.practica01.repository.EstadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService implements IEstadoService{
    
    @Autowired
    EstadoRepository estadoRepository;

    @Override
    public List<Estado> getAllEstado() {
        return (List<Estado>) estadoRepository.findAll();
    }

    @Override
    public Estado getEstadoById(long id) {
        return estadoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEstado(Estado estado) {
        estadoRepository.save(estado);
    }

    @Override
    public void delete(long id) {
        estadoRepository.deleteById(id);
    }
    
}
