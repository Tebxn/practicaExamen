package com.practica01.practica01.service;

import com.practica01.practica01.entity.Pais;
import com.practica01.practica01.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//-----------PAIS SERVICE-------------

@Service
public class PaisService implements IPaisService {
    
    @Autowired
    private PaisRepository paisRepository;
    
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
    }
    
}
