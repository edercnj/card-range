package com.br.valhalla.cardrange.resource;

import com.br.valhalla.cardrange.model.dto.BinDTO;
import com.br.valhalla.cardrange.model.entity.Bin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/card-range")
public class CardRangeResource {

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        return "hello";
    }
    @POST
    @Path("add")
    public void add(Bin bin)
    {}

    @DELETE
    @Path("delete/{id}")
    public void delete(@PathParam("id") Long id)
    {}

    @PUT
    @Path("update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bin update(@PathParam("id") Long id, BinDTO binDTO)
    {
        return null;
    }
}