package edu.fpdual.web.service.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.fpdual.web.client.Game4RayaClient;
import edu.fpdual.web.dto.Game4Raya;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

@WebServlet(name = "RegisterGame4Raya", urlPatterns = "/register-game4raya")
public class RegisterGame4Raya extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        Game4Raya game4Raya =  mapper.readValue(req.getReader(),Game4Raya.class);

        new Game4RayaClient().registerGame4Raya(game4Raya);
        resp.sendRedirect("/WebProject/cuatroRaya/resultSession/result.jsp");

        resp.setContentType("text/plain");
    }
}
