package com.sportradar.scoreboard;

import com.sportradar.scoreboard.model.Game;

import java.util.List;


/**
 * Interface for the FootballScoreBoard.
 *
 * @author Yevhenii Dubinin
 */

public interface FootballScoreBoard {

    /**
     * Create new game and add to the score board repository.
     *
     * @param homeTeam - home team name.
     * @param awayTeam - away team name.
     * @return {@code FootballGame}
     */
    Game startGame(String homeTeam, String awayTeam);

    /**
     * Finish football by removing from score board repository.
     *
     * @param game - finished {@code FootballGame}.
     * @throws FootballGameNotStartedException if try to finish not started game
     */
    void finishGame(Game game) throws FootballGameNotStartedException;

    /**
     * Update football game score and save in repository.
     *
     * @param game   - {@code FootballGame} for update
     * @param scores - pair of new scores.
     * @throws FootballGameNotStartedException if try to update not started game
     */
    void updateScore(Game game, int[] scores) throws FootballGameNotStartedException;

    /**
     * Returns the list of currently ongoing matches.
     *
     * @return A list of {@code FootballGame}
     */
    List<Game> getSummary();

}
