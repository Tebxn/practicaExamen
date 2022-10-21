package com.practica01.practica01.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//-------------------ENTIDAD ESTADO-----------------

@Entity
@Table(name="estados")
public class Estado implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private long id;
    private String nombre;
    private String distrito;
    private String poblacion;
    private String alcalde;
    
    @ManyToOne
    @JoinColumn(name="paises_id")
    private Pais pais;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
