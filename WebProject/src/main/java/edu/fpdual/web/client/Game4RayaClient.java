package edu.fpdual.web.client;

import edu.fpdual.web.dto.Game4Raya;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

public class Game4RayaClient {

    private final WebTarget webTarget;

    public Game4RayaClient() {
        Client client = ClientBuilder.newClient();
        this.webTarget = client.target("http://localhost:8081/RestProject/api/");
    }

    public Game4Raya registerGame4Raya(Game4Raya game4Raya) {

        return webTarget.path("game4Raya/insertGame")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(game4Raya, MediaType.APPLICATION_JSON), Game4Raya.class);
    }
    public List<Game4Raya> findByName(String nickname) {
        return webTarget.path("game4Raya/findByName")
                .queryParam("nickname", nickname)
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Game4Raya>>() {
                });
    }

}
