package edu.fpdual.web.service.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.fpdual.web.client.Game4RayaClient;
import edu.fpdual.web.dto.Game4Raya;
import edu.fpdual.web.dto.RankingGame4Raya;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "FindGame4RayaByName", urlPatterns = "/findgame4rayaby-name")
public class FindGame4RayaByName extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String requestBody = req.getParameter("name");
        if (requestBody == null || requestBody.isEmpty()) {
            resp.setContentType("text/plain");
            resp.getWriter().write("0");
            return;
        }
        ObjectMapper mapper = new ObjectMapper();
        List<Game4Raya> dataRetrieved = new Game4RayaClient().findByName(requestBody);
        if (dataRetrieved != null) {
            long winCount = new RankingGame4Raya().infoGanador(requestBody, dataRetrieved);
            Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("gameData", dataRetrieved);
            responseMap.put("winCount", winCount);
            resp.setContentType("application/json");
            resp.getWriter().write(mapper.writeValueAsString(responseMap));
        } else {
            resp.setContentType("text/plain");
            resp.getWriter().write("0");
        }
    }
}
