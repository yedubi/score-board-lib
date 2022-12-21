package com.sportradar.scoreboard.impl;

import com.sportradar.scoreboard.model.Game;
import com.sportradar.scoreboard.repository.FootballScoreBoardRepository;

import java.util.Comparator;

/**
 * LiveFootballWorldCupScoreBoard extends AbstractFootballScoreBoard which provide implementation for
 * FootballScoreBoard interface.
 * And provide ScoreBoard of the football games sorted by their total score then by most recently started match
 *
 * @author Yevhenii Dubinin
 */

public class LiveFootballWorldCupScoreBoard extends AbstractFootballScoreBoard {

    public LiveFootballWorldCupScoreBoard(FootballScoreBoardRepository repository) {
        super(repository);
    }

    /**
     * Implements abstract getOrderingComparator comparator method
     * Returns comparator for sorting football games by their total score then by most recently started match.
     *
     * @return {@code Comparator<FootballGame>} FootballGame comparator.
     */
    protected Comparator<Game> getOrderingComparator() {
        return Comparator
                .comparing(Game::getTotalScore)
                .thenComparing(Game::getTimestamp)
                .reversed();
    }

}