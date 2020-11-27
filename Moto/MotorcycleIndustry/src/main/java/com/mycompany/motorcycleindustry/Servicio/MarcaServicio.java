/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.Servicio;

import com.mycompany.motorcycleindustry.Modelo.Bodega;
import com.mycompany.motorcycleindustry.Modelo.Marca;
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
public class MarcaServicio {
     @PersistenceContext
     private EntityManager entityManager;
    
    
     public List<Marca> findMarca(){
     
        //String queryString = "select * from proveedor";
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Marca> query = builder.createQuery(Marca.class); 

        query.from(Marca.class);
        
        List<Marca> marcaList = entityManager.createQuery(query).getResultList();

        return marcaList;
         
     }
     
     public void editMarca(Marca marca){
         this.entityManager.merge(marca);
     }
     
     public void crearMarca(Marca marca){
         this.entityManager.persist(marca);
     }
     
     public Marca buscarPorCodigo(Integer marcaID){
         
         Marca marca = new Marca();
         
         marca = this.entityManager.find(Marca.class, marcaID);
         
         return marca;
     }
     
     public void deleteMarca(Integer marcaID){
         
         Marca marca = this.entityManager.find(Marca.class, marcaID);
         
         if(marca != null){
         this.entityManager.remove(marca);
         }
     }

}
