package edu.fpdual.controller;

import edu.fpdual.api.dto.Game4Raya;
import edu.fpdual.persistence.connector.MySQLConnector;
import edu.fpdual.persistence.manager.impl.Game4RayaManagerImpl;
import edu.fpdual.service.Game4RayaService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;


@Path("/game4Raya")
public class Game4RayaController {

    private Game4RayaService service;

    @POST
    @Path("/insertGame")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertGame(Game4Raya game4raya) throws SQLException, ClassNotFoundException {
        service = new Game4RayaService(new MySQLConnector(), new Game4RayaManagerImpl());
        service.insertGame(game4raya);
        return Response.ok().status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/findByName")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response findGameByName(@QueryParam("nickname") String nickname) throws SQLException, ClassNotFoundException {

        service = new Game4RayaService(new MySQLConnector(), new Game4RayaManagerImpl());
        List<Game4Raya> listado = service.findGameByName(nickname);
        return Response.ok().entity(listado).status(Response.Status.CREATED).build();
    }

}
