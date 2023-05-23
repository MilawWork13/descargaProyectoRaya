package edu.fpdual.persistence.manager.impl;

import edu.fpdual.api.dto.Game4Raya;
import edu.fpdual.api.dto.GameSiete;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Game4RayaManagerImpl {

    public int insert(Connection con, Game4Raya game4Raya) {
        String sql = "INSERT INTO game4raya(player1, player2, winner, date) values (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, game4Raya.getPlayer1());
            statement.setString(2, game4Raya.getPlayer2());
            statement.setString(3, game4Raya.getWinner());
            statement.setString(4, game4Raya.getDate());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }


    public List<Game4Raya> findByName(Connection con, String name) {
        String sql = "SELECT * FROM game4raya WHERE " +
                "player1 LIKE ? OR " +
                "player2 LIKE ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, "%" + name + "%");
            statement.setString(2, "%" + name + "%");

            ResultSet result = statement.executeQuery();
            List<Game4Raya> game4Rayas = new ArrayList<>();
            while (result.next()) {
                game4Rayas.add(new Game4Raya(result));
            }
            return game4Rayas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
