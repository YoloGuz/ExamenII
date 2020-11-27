/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "motocicleta")
public class Motocicleta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motocicletaId")
    private Integer motocicletaId;
    
    @Column(name = "modeloMotocicleta")
    private int modeloMotocicleta;

    @Column(name = "colorMotocicleta")
    private String colorMotocicleta;

    @Column(name = "cilindrajeMotocicleta")
    private int cilindrajeMotocicleta;

    @Column(name = "precioMotocicleta")
    private BigDecimal precioMotocicleta;
    
    @Column(name = "cantidadMotocicleta")
    private int cantidadMotocicleta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bodegaId", referencedColumnName = "bodegaId")
    private Bodega bodega;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marcaId", referencedColumnName = "marcaId")
    private Marca marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedorId", referencedColumnName = "proveedorId")
    private Proveedor proveedor;

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    public Integer getMotocicletaId() {
        return motocicletaId;
    }

    public void setMotocicletaId(Integer motocicletaId) {
        this.motocicletaId = motocicletaId;
    }

    public int getModeloMotocicleta() {
        return modeloMotocicleta;
    }

    public void setModeloMotocicleta(int modeloMotocicleta) {
        this.modeloMotocicleta = modeloMotocicleta;
    }

    public String getColorMotocicleta() {
        return colorMotocicleta;
    }

    public void setColorMotocicleta(String colorMotocicleta) {
        this.colorMotocicleta = colorMotocicleta;
    }

    public int getCilindrajeMotocicleta() {
        return cilindrajeMotocicleta;
    }

    public void setCilindrajeMotocicleta(int cilindrajeMotocicleta) {
        this.cilindrajeMotocicleta = cilindrajeMotocicleta;
    }

    public BigDecimal getPrecioMotocicleta() {
        return precioMotocicleta;
    }

    public void setPrecioMotocicleta(BigDecimal precioMotocicleta) {
        this.precioMotocicleta = precioMotocicleta;
    }

    public int getCantidadMotocicleta() {
        return cantidadMotocicleta;
    }

    public void setCantidadMotocicleta(int cantidadMotocicleta) {
        this.cantidadMotocicleta = cantidadMotocicleta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.motocicletaId);
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
        final Motocicleta other = (Motocicleta) obj;
        if (!Objects.equals(this.motocicletaId, other.motocicletaId)) {
            return false;
        }
        return true;
    }

    /**
     * falta los Fk
     */
    
}
