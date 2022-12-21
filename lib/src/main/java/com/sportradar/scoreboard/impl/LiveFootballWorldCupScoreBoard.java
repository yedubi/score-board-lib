package com.sportradar.scoreboard.impl;

import com.sportradar.scoreboard.model.Game;
import com.sportradar.scoreboard.repository.FootballScoreBoardRepository;

import java.util.Comparator;

public class LiveFootballWorldCupScoreBoard extends AbstractFootballScoreBoard {

    public LiveFootballWorldCupScoreBoard(FootballScoreBoardRepository repository) {
        super(repository);
    }

    protected Comparator<Game> getOrderingComparator() {
        return Comparator
                .comparing(Game::getTotalScore)
                .thenComparing(Game::getTimestamp)
                .reversed();
    }

}