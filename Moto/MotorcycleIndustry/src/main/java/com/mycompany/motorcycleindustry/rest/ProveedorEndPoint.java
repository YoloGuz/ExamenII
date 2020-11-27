/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.rest;

import com.mycompany.motorcycleindustry.Modelo.Proveedor;
import com.mycompany.motorcycleindustry.Servicio.ProveedorServicio;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author reyg6
 */
@Path("/proveedor")
public class ProveedorEndPoint{
    
    @Inject
    private ProveedorServicio proveedorServicio;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Proveedor> buscarTodosProveedor(){
        return this.proveedorServicio.findProveedor();
    }
    
    @POST
    @Path("${proveedorId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarProveedorID(@PathParam ("proveedorId")Integer proveedorID){
        
        Proveedor proveedor = new Proveedor();
        proveedor = this.proveedorServicio.buscarPorCodigo(proveedorID);
        this.proveedorServicio.editProveedor(proveedor);
        
        return Response.ok().build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearProveedor(Proveedor proveedor){
        this.proveedorServicio.crearProveedor(proveedor);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("/{productoId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteProveedor(@PathParam ("proveedorId")Integer proveedorID){
        
        this.proveedorServicio.deleteProveedor(proveedorID);
        return Response.ok().build();
    }
            
    
}
