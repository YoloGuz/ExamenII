/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.Servicio;

import com.mycompany.motorcycleindustry.Modelo.Bodega;
import com.mycompany.motorcycleindustry.Modelo.Motocicleta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author reyg6
 */
@Stateless
public class ReporteServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Tuple> motoBodega(){
        /**
         * select b.bodegaId, b.direccionBodega, m.motocicletaId, m.modeloMotocicleta, m.colorMotocicleta 
         * from bodega b inner join motocicleta m 
         * on b.bodegaId = m.bodegaId group by b.bodegaId;
         */
        
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        
        CriteriaQuery<Tuple> motoQuery = builder.createQuery(Tuple.class);
        
        Root<Motocicleta> motoRoot = motoQuery.from(Motocicleta.class);
        //Root<Bodega> bodegaRoot = bodegaQuery.from(Bodega.class);
        
        Join<Motocicleta, Bodega> bodegaJoin = motoRoot.join("bodega");
        //Join<Bodega, Motocicleta> motocicletaJoin = bodegaRoot.join("motocicletaList");
        
        motoQuery.multiselect(
        
                bodegaJoin.get("bodegaId"),
                bodegaJoin.get("direccionBodega"),
                motoRoot.get("motocicletaId"),
                motoRoot.get("modeloMotocicleta"),
                motoRoot.get("colorMotocicleta")

        
        );
        
        motoQuery.groupBy(
                bodegaJoin.get("bodegaId")
        );
        
        List<Tuple> motoBodegaList = entityManager.createQuery(motoQuery).getResultList();
        
        return motoBodegaList;
    
    }
}
