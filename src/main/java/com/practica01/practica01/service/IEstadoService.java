package com.practica01.practica01.service;

import com.practica01.practica01.entity.Estado;
import java.util.List;

public interface IEstadoService {
    public List<Estado> getAllEstado();
    public Estado getEstadoById(long id);
    public void saveEstado(Estado estado);
    public void delete (long id);
}
