/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.rest;

import com.mycompany.motorcycleindustry.Modelo.Bodega;
import com.mycompany.motorcycleindustry.Modelo.Marca;
import com.mycompany.motorcycleindustry.Servicio.BodegaServicio;
import com.mycompany.motorcycleindustry.Servicio.MarcaServicio;
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
@Path("/Marca")
public class MarcaEndPoint {
    @Inject
    private MarcaServicio marcaServicio;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Marca> buscarTodasBodegas(){
        return this.marcaServicio.findMarca();
    }
    
    @POST
    @Path("${marcaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarMarcaID(@PathParam ("marcaId")Integer marcaID){
        
        Marca marca = new Marca();
        marca = this.marcaServicio.buscarPorCodigo(marcaID);
        this.marcaServicio.editMarca(marca);
        
        return Response.ok().build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearMarca(Marca marca){
        this.marcaServicio.crearMarca(marca);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("/{marcaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteMarca(@PathParam ("marcaId")Integer marcaID){
        
        this.marcaServicio.deleteMarca(marcaID);
        return Response.ok().build();
    }
            

}
