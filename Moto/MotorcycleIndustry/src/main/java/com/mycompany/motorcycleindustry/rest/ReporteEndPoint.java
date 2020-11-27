/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorcycleindustry.rest;

import com.mycompany.motorcycleindustry.Servicio.ReporteServicio;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.Tuple;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author reyg6
 */
@Path("/reporte")
public class ReporteEndPoint {
    
    @Inject
    private ReporteServicio reporteServicio;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tuple> motosPorBodega(){
        
        List<Tuple> wrapperMotocicletaList = this.reporteServicio.motoBodega();
        
        return wrapperMotocicletaList;
    }
    
}
