package edu.fpdual.web.dto;

import java.util.List;
import java.util.function.Predicate;

public class RankingGame4Raya {
    public long infoGanador(String nickname, List<Game4Raya> infoRetrieved) {

        Predicate<Game4Raya> predicatesWin = game4raya -> {

            String winner = game4raya.getWinner();
            int spaceIndex = winner.indexOf(" ");
            if (spaceIndex != -1) {
                String winnerFirstName = winner.substring(0, spaceIndex);
                return winnerFirstName.equals(nickname);
            }
            return false;
        };

        long count = infoRetrieved.stream()
                .filter(game4raya -> predicatesWin.test(game4raya))
                .count();

        return count;
    }
}
