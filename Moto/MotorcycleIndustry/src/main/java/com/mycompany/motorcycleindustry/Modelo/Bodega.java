/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author reyg6
 */

@Entity
@Table(name = "bodega")
public class Bodega implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodegaId")
    private Integer bodegaId;
    
    @Column(name = "telefonoBodega")
    private int telefonoBodega;
    
    @Column(name = "direccionBodega")
    private String direccionBodega;

    @JsonIgnore
    @OneToMany(mappedBy = "bodega")
    private List<Motocicleta> motocicletaList;

    public List<Motocicleta> getMotocicletaList() {
        return motocicletaList;
    }

    public void setMotocicletaList(List<Motocicleta> motocicletaList) {
        this.motocicletaList = motocicletaList;
    }
    
    
    
    public Integer getBodegaId() {
        return bodegaId;
    }

    public void setBodegaId(Integer bodegaId) {
        this.bodegaId = bodegaId;
    }

    public int getTelefonoBodega() {
        return telefonoBodega;
    }

    public void setTelefonoBodega(int telefonoBodega) {
        this.telefonoBodega = telefonoBodega;
    }

    public String getDireccionBodega() {
        return direccionBodega;
    }

    public void setDireccionBodega(String direccionBodega) {
        this.direccionBodega = direccionBodega;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.bodegaId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bodega other = (Bodega) obj;
        if (!Objects.equals(this.bodegaId, other.bodegaId)) {
            return false;
        }
        return true;
    }
    
    
}
