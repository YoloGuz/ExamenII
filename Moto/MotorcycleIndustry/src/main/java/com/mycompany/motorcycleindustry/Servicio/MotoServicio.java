/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.Servicio;

import com.mycompany.motorcycleindustry.Modelo.Motocicleta;
import com.mycompany.motorcycleindustry.Modelo.Proveedor;
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
public class MotoServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    
     public List<Motocicleta> findMoto(){
     
        //String queryString = "select * from proveedor";
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Motocicleta> query = builder.createQuery(Motocicleta.class); 

        query.from(Motocicleta.class);
        
        List<Motocicleta> motoList = entityManager.createQuery(query).getResultList();

        return motoList;
         
     }
     
     public void editMoto(Motocicleta motocicleta){
         this.entityManager.merge(motocicleta);
     }
     
     public void crearMoto(Motocicleta motocicleta){
         this.entityManager.persist(motocicleta);
     }
     
     public Motocicleta buscarPorCodigo(Integer motoID){
         
         Motocicleta motocicleta = new Motocicleta();
         
         motocicleta = this.entityManager.find(Motocicleta.class, motoID);
         
         return motocicleta;
     }
     
     public void deleteMoto(Integer motoID){
         
         Motocicleta motocicleta = this.entityManager.find(Motocicleta.class, motoID);
         
         if(motocicleta != null){
         this.entityManager.remove(motocicleta);
         }
     }
}
