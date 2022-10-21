package com.practica01.practica01.repository;

import com.practica01.practica01.entity.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends CrudRepository<Estado,Long>{ 
}
