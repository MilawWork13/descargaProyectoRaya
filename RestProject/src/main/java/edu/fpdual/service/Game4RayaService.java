package edu.fpdual.service;

import edu.fpdual.api.dto.Game4Raya;
import edu.fpdual.api.dto.GameSiete;
import edu.fpdual.persistence.connector.MySQLConnector;
import edu.fpdual.persistence.manager.impl.Game4RayaManagerImpl;
import lombok.Getter;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Getter
public class Game4RayaService {
    private MySQLConnector connector;
    private Game4RayaManagerImpl manager;

    public Game4RayaService(MySQLConnector con, Game4RayaManagerImpl manager) {
        this.connector = con;
        this.manager = manager;
    }

    public int insertGame(Game4Raya game4Raya) throws SQLException, ClassNotFoundException {
        Connection con = null;

        try {
            con = connector.getMySQLConnection();
            return manager.insert(con, game4Raya);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public List<Game4Raya> findGameByName(String nickname) throws SQLException, ClassNotFoundException {

        Connection con = null;
        try {
            con = connector.getMySQLConnection();
            return manager.findByName(con, nickname);
        } finally {
            if (con!=null) {
                con.close();
            }
        }
    }
}
