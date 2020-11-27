/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.rest;

import com.mycompany.motorcycleindustry.Modelo.Bodega;
import com.mycompany.motorcycleindustry.Modelo.Motocicleta;
import com.mycompany.motorcycleindustry.Servicio.BodegaServicio;
import com.mycompany.motorcycleindustry.Servicio.MotoServicio;
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
@Path("/bodega")
public class BodegaEndPoint {
    @Inject
    private BodegaServicio bodegaServicio;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bodega> buscarTodasBodegas(){
        return this.bodegaServicio.findBodega();
    }
    
    @POST
    @Path("${bodegaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarBodegaID(@PathParam ("bodegaId")Integer bodegaID){
        
        Bodega bodega = new Bodega();
        bodega = this.bodegaServicio.buscarPorCodigo(bodegaID);
        this.bodegaServicio.editBodega(bodega);
        
        return Response.ok().build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearBodega(Bodega bodega){
        this.bodegaServicio.crearBodega(bodega);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("/{bodegaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBodega(@PathParam ("bodegaId")Integer bodegaID){
        
        this.bodegaServicio.deleteBodega(bodegaID);
        return Response.ok().build();
    }
            
}
