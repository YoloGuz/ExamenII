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
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author reyg6
 */
@Stateless
public class ProveedorServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    
     public List<Proveedor> findProveedor(){
     
        //String queryString = "select * from proveedor";
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Proveedor> query = builder.createQuery(Proveedor.class); 

        query.from(Proveedor.class);
        
        List<Proveedor> proveedorList = entityManager.createQuery(query).getResultList();

        return proveedorList;
         
     }
     
     public void editProveedor(Proveedor proveedor){
         this.entityManager.merge(proveedor);
     }
     
     public void crearProveedor(Proveedor proveedor){
         this.entityManager.persist(proveedor);
     }
     
     public Proveedor buscarPorCodigo(Integer proveedorID){
         
         Proveedor proveedor = new Proveedor();
         
         proveedor = this.entityManager.find(Proveedor.class, proveedorID);
         
         return proveedor;
     }
     
     public void deleteProveedor(Integer proveedorID){
         
         Proveedor proveedor = this.entityManager.find(Proveedor.class, proveedorID);
         
         if(proveedor != null){
         this.entityManager.remove(proveedor);
         }
     }
}
