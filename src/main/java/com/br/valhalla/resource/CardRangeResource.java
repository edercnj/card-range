package com.br.valhalla.resource;

import com.br.valhalla.model.entity.Bin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/card-range")
public class CardRangeResource {

    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        return "hello";
    }
    @POST
    public void add(Bin bin)
    {}
}