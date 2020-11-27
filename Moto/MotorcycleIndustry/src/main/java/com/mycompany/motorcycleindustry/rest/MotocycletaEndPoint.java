/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.rest;

import com.mycompany.motorcycleindustry.Modelo.Motocicleta;
import com.mycompany.motorcycleindustry.Modelo.Proveedor;
import com.mycompany.motorcycleindustry.Servicio.MotoServicio;
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
@Path("/motocicleta")
public class MotocycletaEndPoint {
    @Inject
    private MotoServicio motoServicio;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Motocicleta> buscarTodasMotos(){
        return this.motoServicio.findMoto();
    }
    
    @POST
    @Path("${motocicletaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarMotocicletaID(@PathParam ("motocicletaId")Integer motocicletaID){
        
        Motocicleta moto = new Motocicleta();
        moto = this.motoServicio.buscarPorCodigo(motocicletaID);
        this.motoServicio.editMoto(moto);
        
        return Response.ok().build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearMoto(Motocicleta moto){
        this.motoServicio.crearMoto(moto);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("/{motocicletaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteMoto(@PathParam ("motocicletaId")Integer motocicletaID){
        
        this.motoServicio.deleteMoto(motocicletaID);
        return Response.ok().build();
    }
            

    
}
