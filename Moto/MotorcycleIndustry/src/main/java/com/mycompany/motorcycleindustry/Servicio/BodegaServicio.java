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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author reyg6
 */
@Stateless
public class BodegaServicio {
    @PersistenceContext
    private EntityManager entityManager;
    
    
     public List<Bodega> findBodega(){
     
        //String queryString = "select * from proveedor";
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Bodega> query = builder.createQuery(Bodega.class); 

        query.from(Bodega.class);
        
        List<Bodega> bodegaList = entityManager.createQuery(query).getResultList();

        return bodegaList;
         
     }
     
     public void editBodega(Bodega bodega){
         this.entityManager.merge(bodega);
     }
     
     public void crearBodega(Bodega bodega){
         this.entityManager.persist(bodega);
     }
     
     public Bodega buscarPorCodigo(Integer bodegaID){
         
         Bodega bodega = new Bodega();
         
         bodega = this.entityManager.find(Bodega.class, bodegaID);
         
         return bodega;
     }
     
     public void deleteBodega(Integer bodegaID){
         
         Bodega bodega = this.entityManager.find(Bodega.class, bodegaID);
         
         if(bodega != null){
         this.entityManager.remove(bodega);
         }
     }
}
